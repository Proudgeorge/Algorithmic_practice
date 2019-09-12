package Thread.threadPool;

import com.sun.org.apache.xml.internal.security.Init;

import java.util.ArrayList;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 自定义简单的线程池
 * @author simba@onlying.cn
 * @date 2019/9/12 23:32
 */
public class MyThreadPool {
    /*存放线程的集合*/
    private ArrayList<MyThread> threads;
    /*任务队列*/
    private ArrayBlockingQueue<Runnable> taskQueue;
    /*线程池初始限定大小*/
    private int threadNum;
    /*已工作的线程数目*/
    private int workThreadNum;
    private final ReentrantLock mainLock = new ReentrantLock();
    public MyThreadPool(int initPoolNUm){
        threadNum = initPoolNUm;
        threads = new ArrayList<>(initPoolNUm);
        //任务队列初始化为线程线程数的四倍
        taskQueue = new ArrayBlockingQueue<>(initPoolNUm*4);
        threadNum = initPoolNUm;
        workThreadNum = 0;
    }
    public void execute(Runnable runnable){
        try {
            mainLock.lock();
            //线程池未满，每加入一个任务则开启一个线程
            if (workThreadNum<threadNum){
                MyThread myThread = new MyThread(runnable);
                myThread.start();
                threads.add(myThread);
                workThreadNum++;
            }
            //线程池已满，放入任务队列，等待有空闲线程时执行
            else {
                //队列已满，无法添加时，拒绝任务
                if (!taskQueue.offer(runnable)){
                    rejecTask();
                }
            }
        }finally {
            mainLock.unlock();
        }

    }
    private void rejecTask(){
        System.out.println("任务队列已满，无法继续添加，请扩大您的初始化线程池");
    }
    public static void main(String[] args) {
        MyThreadPool myThreadPool = new MyThreadPool(5);
        Runnable task = new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+"执行中");
            }
        };
        for (int i=0;i<20;i++){
            myThreadPool.execute(task);
        }
    }
    class MyThread extends Thread{

        private Runnable task;
        public MyThread(Runnable runnable){
            this.task = runnable;
        }

        @Override
        public void run() {
            //该线程一直启动着，不断从任务队列取任务执行
            while (true){
                //如果初始化任务不为空，则执行初始化任务
                if (task!=null){
                    task.run();
                    task = null;
                }
                //否则去任务队列取任务并执行
                else {
                    Runnable queueTask = taskQueue.poll();
                    if (queueTask != null){
                        queueTask.run();
                    }
                }
            }
        }
    }
}
