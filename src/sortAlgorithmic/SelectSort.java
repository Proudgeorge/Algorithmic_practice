package sortAlgorithmic;

import java.util.Arrays;

/**
 * 冒泡排序
 * @author simba@onlying.cn
 * @date 2019/6/7 22:52
 */
public class SelectSort {
    public static void main(String[] args) {
        int[] Arr ={6,3,18,9,10,2,11};
        System.out.println("排序前数组为："+Arr);
        for (int num:Arr){
            System.out.println(num);
        }
        //总共经过N-1轮比较
        for (int i = 0; i < Arr.length-1; i++) {
            int min = i;
            for (int j = i+1; j < Arr.length; j++) {
                if (Arr[j] < Arr[min]){
                    min = j;
                }
            }
            if (i != min){
                int temp = Arr[i];
                Arr[i] = Arr[min];
                Arr[min] = temp;
            }
        }
        System.out.println("排序后数组为："+ Arrays.toString(SelectSort(Arr)));
//        for (int num:Arr){
//            System.out.println(num);
//        }
    }
    public static int[] SelectSort(int[] Arr){
        if (Arr.length == 0)
            return Arr;
        for (int i=0;i<Arr.length;i++){
            int minIndex = i;
            for (int j=i+1;j<Arr.length;j++){
                if (Arr[j]<Arr[minIndex]){ //找到最小的数
                    minIndex = j; //将最小的数的索引保存
                }
            }
            int temp = Arr[minIndex];
            Arr[minIndex] = Arr[i];
            Arr[i] = temp;
        }
        return Arr;
    }
}
