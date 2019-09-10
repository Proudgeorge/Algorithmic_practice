package Thread;

/**
 * @author simba@onlying.cn
 * @date 2019/9/7 17:33
 */
public class RunnableThreadTest implements Runnable{
    @Override
    public void run() {
        for (int i=0;i<100;i++){
            System.out.println(Thread.currentThread().getName()+"--"+i);
        }

    }

    public static void main(String[] args) {
        for (int i=0;i<100;i++){
            System.out.println(Thread.currentThread().getName()+"-"+i);
            if (i==20){
                RunnableThreadTest threadTest = new RunnableThreadTest();
                new Thread(threadTest,"新线程1").start();
                new Thread(threadTest,"新线程2").start();
            }
        }
    }
}
