import java.util.Arrays;

/**
 * 冒泡排序
 * @author simba@onlying.cn
 * @date 2019/6/7 22:52
 */
public class BubbleSort {
    public static void main(String[] args) {
        int[] Arr ={6,3,18,9,10,2,11};
        System.out.println("排序前数组为："+Arr);
        for (int num:Arr){
            System.out.println(num);
        }
        for (int i = 0; i < Arr.length-1; i++) {
            for (int j = 0; j < Arr.length-1-i; j++) {
                if (Arr[j] > Arr[j+1]){
                    int temp = Arr[j];
                    Arr[j] = Arr[j+1];
                    Arr[j+1] = temp;
                }
            }
        }

        System.out.println("排序后数组为："+Arr);
        for (int num:Arr){
            System.out.println(num);
        }
    }
}
