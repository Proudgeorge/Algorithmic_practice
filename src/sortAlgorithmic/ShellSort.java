package sortAlgorithmic;

/**
 * @author simba@onlying.cn
 * @date 2019/6/7 23:48
 */
public class ShellSort {
    public static void main(String[] args) {
        int[] Arr ={6,3,18,9,10,2,11};
        System.out.println("排序前数组为："+Arr);
        for (int num:Arr){
            System.out.println(num);
        }

        int gap = 1;
        while (gap < Arr.length){
            gap = gap*3 +1;
        }
        while (gap >0){
            for (int i = gap; i < Arr.length; i++) {
                int temp = Arr[i];
                int j = i - gap;
                while (j >=0 && Arr[j] >temp){
                    Arr[j+gap] = Arr[j];
                    j -= gap;
                }
                Arr[j+gap] = temp;
            }
            gap = (int) Math.floor(gap/3);
        }

        System.out.println("排序后数组为："+Arr);
        for (int num:Arr){
            System.out.println(num);
        }
    }
}
