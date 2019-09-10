package Thread;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author simba@onlying.cn
 * @date 2019/9/4 15:20
 */
public class MySafeThread implements Runnable{
    private static AtomicInteger count = new AtomicInteger(0);//线程安全的计数变量

    public static void calc(){
        while ((count.get())<1000){
            int c = count.incrementAndGet();
            System.out.println("正在运行的线程"+Thread.currentThread().getName()+":"+c);
        }
    }

    /**
     * 线程运行方法，每次只能一个线程访问
     */
    @Override
    public synchronized void run() {
        while (true){
            MySafeThread.calc();
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        //创建5个线程实例并启动
        for (int i=1;i<6;i++){
            MySafeThread mySafeThread = new MySafeThread();
            Thread thread = new Thread(mySafeThread);
            thread.start();
        }
    }
}
