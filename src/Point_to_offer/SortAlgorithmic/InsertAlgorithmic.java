package Point_to_offer.SortAlgorithmic;

import java.util.Arrays;

/**
 * @author simba@onlying.cn
 * @date 2019/7/9 17:56
 */
public class InsertAlgorithmic {
    public static void main(String[] args) {
        int arr[]= {3,6,8,3,45,77,33,2,1};

        System.out.println(Arrays.toString(insertionSort(arr)));
    }

    /**
     * 从小到大排序
     *
     * 空间消耗 O(1) (临时保存array[i])
     * 平均时间复杂度 O(n^2)
     * 最好情况 O(n) (已经排序，内层for循环的检测总是立即判断不成立而终止)
     * 最坏情况 O(n^2) (需排序的为逆序)
     *
     * @param array
     * @return
     */
    public static int[] insertionSort(int[] array){
        int l = array.length;
        int j;
        for (int i=1;i<l;i++){
            int temp = array[i];
            for (j=i;j>0&&temp<array[j-1];j--){
                array[j] = array[j-1];
            }
            array[j] = temp;
        }
        return array;
    }

}
