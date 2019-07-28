package Point_to_offer.question31to40;

import Point_to_offer.SortAlgorithmic.MergeSort;

/**
 * 在数组中的两个数字，如果前面一个数字大于后面的数字，则这两个数字组成一个逆序对。
 * 输入一个数组,求出这个数组中的逆序对的总数P。并将P对1000000007取模的结果输出。
 * 即输出P%1000000007
 * @author simba@onlying.cn
 * @date 2019/7/24 10:09
 */
public class Question36 {
    int count = 0;
    public int InversePairs(int [] array) {
        if(array==null)
            return 0;
        mergeSort(array,0,array.length-1);
        return count;
    }

    private void mergeSort(int[] data,int start,int end) {
        int mid = (start + end) / 2;
        if (start < end) {
            mergeSort(data, start, mid);
            mergeSort(data, mid + 1, end);
            merge(data, start, mid, end);
        }
    }

    public void merge(int[] data,int start,int mid,int end) {
        int arr[] = new int[end - start + 1];
        int c = 0;
        int s = start;
        int index = mid + 1;
        while (start <= mid && index <= end) {
            if (data[start] < data[index]) {
                arr[c++] = data[start++];
            } else {
                arr[c++] = data[index++];
                count += mid +1 - start;
                count %= 1000000007;
            }
        }

        while (start <= mid) {
            arr[c++] = data[start++];
        }

        while (index <= end) {
            arr[c++] = data[index++];
        }

        for (int d : arr) {
            data[s++] = d;
        }
    }
}
