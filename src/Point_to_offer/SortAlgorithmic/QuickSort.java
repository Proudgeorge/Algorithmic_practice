package Point_to_offer.SortAlgorithmic;

import java.awt.*;
import java.util.Arrays;

/**
 * @author simba@onlying.cn
 * @date 2019/7/10 11:29
 */
public class QuickSort {
    /**
     * 快排1
     * @param arr
     * @param low
     * @param high
     */
    public void quicksort1(int[] arr,int low,int high){
        int start = low;
        int end = high;
        int key = arr[low];

        while (end > start){
            //从后往前比较
            while (end > start && arr[end]>=key){
                // 如果没有比关键值小的，比较下一个，
                // 直到有比关键值小的交换位置，然后又从前往后比较
                end--;
            }
            if (arr[end]<= key){
                int temp = arr[end];
                arr [end] = arr[start];
                arr [start] = temp;
            }
            //从前往后比较
            while (end>start && arr[start] <= key){
                // 如果没有比关键值大的，比较下一个，
                // 直到有比关键值大的交换位置，然后又从前往后比较
                start++;
            }
            if (arr[start] >= key){
                int temp = arr[start];
                arr[start] = arr [end];
                arr[end] = temp;
            }
        }
        if (start >low){
            quicksort1(arr,low,start-1);
        }
        if (end < high){
            quicksort1(arr,end+1,high);
        }
    }

    /**
     * 快排2
     * @param array
     * @param start
     * @param end
     * @return
     */
    public int[] quicksort2(int[] array,int start,int end){
       if (array.length <1||start<0||end>=array.length||start>end){
           return null;
       }
       int smallIndex = partition(array,start,end);
       if (smallIndex > start )
           quicksort2(array,start,smallIndex-1);
       if (smallIndex < end)
           quicksort2(array,smallIndex+1,end);

       return array;

    }
    public int partition(int[] array,int start,int end){
        int pivot = (int) (start+Math.random()*(end-start+1));
        int smallIndex = start -1;
        swap(array, pivot,end);
        for (int i = start;i <= end;i++){
            if (array[i] <= array[end]){
                smallIndex++;
                if (i>smallIndex)
                    swap(array,i,smallIndex);
            }
        }
        return smallIndex;
    }

    /**
     * 交换数组内元素
     * @param array
     * @param i
     * @param j
     */
    public void swap(int[] array,int i,int j){
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    //测试
    public static void main(String[] args) {
        QuickSort sort = new QuickSort();
        int[] arr = { 11, 3, 29, 49, 30, 7, 50, 63, 46, 1, 99 };
        System.out.println("未排序数组："+ Arrays.toString(arr));
        sort.quicksort2(arr,0,arr.length-1);
        System.out.println("排序后的数组"+Arrays.toString(arr));
    }
}
