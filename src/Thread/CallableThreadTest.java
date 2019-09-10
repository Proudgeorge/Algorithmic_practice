package Thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @author simba@onlying.cn
 * @date 2019/9/7 21:20
 */
public class CallableThreadTest implements Callable {
    public static void main(String[] args) {
        CallableThreadTest ctt = new CallableThreadTest();
        FutureTask<Integer> ft = new FutureTask<>(ctt);
        for (int i=0;i<100;i++){
            System.out.println(Thread.currentThread().getName()+"循环变量i的值"+i);
            if (i==20){
                new Thread(ft,"有返回值的线程").start();
            }
        }
        try {
            System.out.println("子线程的返回值："+ft.get());
        }catch (InterruptedException e){
            e.printStackTrace();
        }catch (ExecutionException e){
            e.printStackTrace();
        }
    }

    @Override
    public Object call() throws Exception {
        int i=0;
        for (;i<100;i++){
            System.out.println(Thread.currentThread().getName()+"  "+i);
        }
        return i;
    }
}
