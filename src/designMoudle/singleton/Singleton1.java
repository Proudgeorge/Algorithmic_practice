package designMoudle.singleton;

/**
 * 饿汉单列
 * @author simba@onlying.cn
 * @date 2019/9/11 22:55
 */
public class Singleton1 {
    private static final Singleton1 INSTANCE = new Singleton1();

    //私有化构造函数
    private Singleton1(){

    }
    public static Singleton1 getInstance(){
        return INSTANCE;
    }
}
