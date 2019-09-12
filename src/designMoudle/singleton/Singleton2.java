package designMoudle.singleton;

/**懒汉式
 * @author simba@onlying.cn
 * @date 2019/9/11 22:59
 */
public class Singleton2 {
    //需要加上volatile关键字来保证线程安全对于双重检查的时候
    private static volatile Singleton2 INSTANCE=null;
    //私有化构造函数
    private Singleton2(){
        System.out.println("init class");
    }
    //第一种方法：利用synchronized 关键字来实现线程安全
    public static Singleton2 getInstance1(){
        if (INSTANCE == null){
            INSTANCE = new Singleton2();
        }
        return INSTANCE;
    }
    //第二种方法：双重检查来确保线程安全同时将同步块放在方法内减少每次都需要同步加锁带来的消耗
    public static Singleton2 getInstance2(){
        if (INSTANCE == null){
            synchronized (INSTANCE){
                if (INSTANCE == null){
                    INSTANCE = new Singleton2();
                }
            }
        }
        return INSTANCE;
    }
    //第三种方法：静态内部类实现懒汉式实现了线程安全又避免同步带来的影响
    public static class lazyLoader{
        private static final Singleton2 INSTANCE = new Singleton2();

    }
    public static final Singleton2 getInstance3(){
        return lazyLoader.INSTANCE;
    }
}
