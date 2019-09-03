import com.sun.org.apache.bcel.internal.generic.SWAP;

/**
 * @author simba@onlying.cn
 * @date 2019/8/26 9:45
 */
public class Heap {
    private int[] a;
    private int n;
    private int count;

    public Heap(int capacity){
        a = new int[capacity+1];
        n = capacity;
        count = 0;
    }

    public void insert(int data){
        if (count >= n)return;//堆满了
        ++count;
        a[count] = data;
        int i = count;
        while (i/2 >0 &&a[i] > a[i/2]){
            swap(a,i,i/2);
            i = i/2;
        }
    }
    public void swap(int[] a,int i,int j){
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
