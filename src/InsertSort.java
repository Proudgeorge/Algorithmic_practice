/**
 * 冒泡排序
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



        System.out.println("排序后数组为："+Arr);
        for (int num:Arr){
            System.out.println(num);
        }
    }
}
