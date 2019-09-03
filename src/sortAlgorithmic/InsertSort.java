package sortAlgorithmic;

import java.util.Arrays;

/**
 * 排序
 * 一般来说，插入排序都采用in-place在数组上实现。具体算法描述如下：
 *
 * 从第一个元素开始，该元素可以认为已经被排序；
 * 取出下一个元素，在已经排序的元素序列中从后向前扫描；
 * 如果该元素（已排序）大于新元素，将该元素移到下一位置；
 * 重复步骤3，直到找到已排序的元素小于或者等于新元素的位置；
 * 将新元素插入到该位置后；
 * 重复步骤2~5。
 * @author simba@onlying.cn
 * @date 2019/6/7 22:52
 */
public class InsertSort {
    public static void main(String[] args) {
        int[] Arr ={6,3,18,9,10,2,11};
        System.out.println("排序前数组为："+Arr);
        for (int num:Arr){
            System.out.println(num);
        }
        System.out.println("排序后数组为："+ Arrays.toString(insertSort(Arr)));
        //从下标为1到末尾我未排序序列
        for (int i = 1; i < Arr.length; i++) {
            //待插入的数据
            int temp = Arr[i];
            int j = i;
            while (j>0&&temp<Arr[j-1]){
                Arr[j] = Arr[j-1];
                j--;
            }
            if (j!=i){
                Arr[j] = temp;
            }
        }
//        for (int num:Arr){
//            System.out.println(num);
//        }
    }
    public static int[] insertSort(int[] Arr){
        //默认第一个位已经排序的
        for (int i=1;i<Arr.length;i++){
            int temp = Arr[i];
            int j = i;
            while ( j>0&&temp<Arr[j-1]){
                Arr[j] =Arr[j-1];
                j--;
            }
            if (j!=i){
                Arr[j] = temp;
            }
        }
        return Arr;
    }
}
