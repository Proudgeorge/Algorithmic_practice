package Thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author simba@onlying.cn
 * @date 2019/9/10 15:43
 */
public class TestJoin {
    public static void main(String[] args) {
        final Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+":"+"run 1");
            }
        },"T1");
        final Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+":"+"run 2");
                try {
                    thread1.join(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        },"T2");
        final Thread thread3 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+":"+"run 3");
                try {
                    thread2.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        },"T3");
        //method1
       /* thread1.start();
        thread2.start();
        thread3.start();*/
        //method2使用单个任务的线程池来实现。保证线程的依次执行
        ExecutorService executor = Executors.newSingleThreadExecutor();
        executor.submit(thread1);
        executor.submit(thread2);
        executor.submit(thread3);
        executor.shutdown();
    }
}
