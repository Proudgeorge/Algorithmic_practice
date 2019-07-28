package Point_to_offer.SortAlgorithmic;

import java.util.Arrays;

/**
 * @author simba@onlying.cn
 * @date 2019/7/9 18:28
 */
public class BubbleSort {
    public static void main(String[] args) {
        int arr[]= {3,6,8,3,45,77,33,2,1};

        System.out.println(Arrays.toString(bullesort(arr)));

    }

    /**
     * 空间消耗 O(1) (用于交换相邻数据)
     * 平均时间复杂度 O(n^2)
     * 最好情况 O(n) (改进后的，避免对已经有序的序列重复进行循环比较，未改进的为O(n^2) )
     * 最坏情况 O(n^2) (需排序的为逆序)
     * @param array
     * @return
     */
    public static int[]  bullesort(int[] array) {
        boolean flag = true;
        //若flag为false表明剩下的序列是有序的
        for (int i=0;i<array.length&&flag;i++){
            flag = false;
            for (int j=array.length-1;j>0;j--){
                if (array[j]<array[j-1]){
                    int temp = array[j];
                    array[j] = array[j-1];
                    array[j-1] = temp;
                    flag = true;//表明有数据交换
                }
            }
        }
        return array;
    }
}
