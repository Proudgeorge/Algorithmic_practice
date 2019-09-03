package sortAlgorithmic;

import java.util.Arrays;

/**
 * 快速排序使用分治法来把一个串（list）分为两个子串（sub-lists）。具体算法描述如下：
 *
 * 从数列中挑出一个元素，称为 “基准”（pivot）；
 * 重新排序数列，所有元素比基准值小的摆放在基准前面，所有元素比基准值大的摆在基准的后面（相同的数可以到任一边）。
 * 在这个分区退出之后，该基准就处于数列的中间位置。这个称为分区（partition）操作；
 * 递归地（recursive）把小于基准值元素的子数列和大于基准值元素的子数列排序。
 * @author simba@onlying.cn
 * @date 2019/9/3 16:47
 */
public class QuickSort {
    public static void main(String[] args) {
        int[] Arr ={6,3,18,9,10,2,11,100,88,47};
        System.out.println("排序前数组为："+ Arrays.toString(Arr));
        System.out.println("排序后数组为："+ Arrays.toString(quickSort(Arr,0,Arr.length-1)));
    }
    public static int[] quickSort(int[] Arr,int start,int end){
        if (Arr.length<1||start<0||end>=Arr.length||start>end)
            return null;
        int smallIndex = partition(Arr,start,end);
        if (smallIndex > start){
            quickSort(Arr,start,smallIndex-1);
        }
        if (smallIndex < end){
            quickSort(Arr,smallIndex+1,end);
        }
        return Arr;
    }
    public static int partition(int[] arr,int start,int end){
        int pivot = (int) (start + Math.random()*(end-start));
        int smallIndex = start -1;
        swap(arr,pivot,end);
        for (int i=start;i<=end;i++){
            if (arr[i] <= arr[end]){
                smallIndex++;
                if (i>smallIndex){
                    swap(arr,i,smallIndex);
                }
            }
        }
        return smallIndex;
    }
    public static void swap(int[] array,int i,int j){
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
