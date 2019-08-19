package Thread;

/**
 * 设计4个线程，其中两个线程每次对j增加1，另外两个线程对j每次减少1。
 * 使用内部类实现线程，对j增减的时候没有考虑顺序问题
 * @author simba@onlying.cn
 * @date 2019/8/10 20:53
 */
public class ThreadTest1 {
   private int j;

    public static void main(String[] args) {
        ThreadTest1 tt = new ThreadTest1();
        Inc inc = tt.new Inc();
        Dec dec = tt.new Dec();
        for (int i=0;i<2;i++){
            Thread thread = new Thread(inc);
            thread.start();
            thread = new Thread(dec);
            thread.start();
        }
    }

    private synchronized void inc(){
        j++;
        System.out.println(Thread.currentThread().getName()+"-inc:"+j);
    }
    private synchronized void dec(){
        j--;
        System.out.println(Thread.currentThread().getName()+"-dec"+j);
    }
    class Inc implements Runnable{
        public void run(){
            for (int i=0;i<100;i++){
                inc();
            }
        }
    }
    class Dec implements Runnable{
        public void run(){
            for (int i=0;i<100;i++){
                dec();
            }
        }
    }
}

