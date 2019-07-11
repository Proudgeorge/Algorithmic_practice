package Point_to_offer.SortAlgorithmic;

import com.sun.xml.internal.bind.v2.model.core.ID;

/**
 * 空间消耗 O(n+log n)
 * 平均时间复杂度 O(n log n)
 * 最好情况 O(n log n)
 * 最坏情况 O(n log n)
 *
 * @author simba@onlying.cn
 * @date 2019/7/9 23:43
 */
public class MergeSort {
    public static void mergesort(int[] array){

    }
    public static void mergersort(int[] array,int[] tempArr,int left,int right){
        if (left<right){
            int center = (left+right)/2;
            //递归将左边的归并为有序
            mergersort(array,tempArr,left,center);
            //递归将右边的归并为有序
            mergersort(array,tempArr,center+1,right);
            //递归将左右两个子序列归并到一起
            merge(array,tempArr,left,center+1,right);
        }
    }

    /**
     *
     * @param array
     * @param tempArr
     * @param leftPos 左数组的第一个索引
     * @param rightPos 右数组的第一个索引
     * @param rightEnd 右数组最后一个元素的索引
     */
    public static void merge(int[] array,int[] tempArr,int leftPos,int rightPos,int rightEnd){
        int leftEnd = rightPos-1,tmpPos = leftPos,num = rightEnd-leftEnd+1;
        while (leftPos <= leftEnd&&rightPos<=rightEnd){
            // 从两个数组中取出最小的放入临时数组
            if (array[leftPos]<array[rightPos])
                tempArr[tmpPos++] = array[leftPos++];
            else
                tempArr[tmpPos++] = array[rightPos++];
//            tempArr[tmpPos++] = array[array[leftPos]<array[rightPos]?leftPos++:rightPos++];

        }

        while (leftPos <= leftEnd){
            tempArr[tmpPos++] = array[leftPos++];
        }
        while (rightPos <= rightEnd){
            tempArr[tmpPos++] = array[rightPos++];
        }
        for (int i=0;i<num;i++,rightEnd--){
            array[rightEnd] = tempArr[rightEnd];
        }
    }
}
