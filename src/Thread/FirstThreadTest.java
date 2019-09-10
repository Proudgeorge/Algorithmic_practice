package Thread;

/**
 * @author simba@onlying.cn
 * @date 2019/9/7 17:14
 */
public class FirstThreadTest extends Thread {
    int i = 0;

    @Override
    //重写run方法，run方法体就是现场执行体
    public void run() {
        for (;i<100;i++){
            System.out.println(getName()+" "+i);
        }
    }

    public static void main(String[] args) {
        for (int i =0;i<100;i++){
            System.out.println(Thread.currentThread().getName()+" :"+i);
            if (i==20){
                new FirstThreadTest().start();
                new FirstThreadTest().start();
            }
        }
    }
}
