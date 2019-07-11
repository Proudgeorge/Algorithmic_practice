package Point_to_offer.question11to20;

/**
 * 打印1到最大的n位数
 * 考虑大数问题，使用字符串或数组表示。
 * @author simba@onlying.cn
 * @date 2019/7/9 8:44
 */
public class Question12 {
    /**
     * @param n 数字的最大位数
     */
    public static void printToMaxOfNDigits(int n){
        int[] array = new int[n];
        if (n <= 0){
            System.out.println("输入的n没有意义");
            return;
        }

        printToMaxOfNDigits(array,0);
    }

    /**
     * @param arr 存放结果的数组
     * @param n 当前处理的是第n个元素，从0开始计数
     */
    public static void printToMaxOfNDigits(int[] arr,int n){
        // 说明所有的数据排列选择已经处理完毕
        if (n >= arr.length){
            printArray(arr); //可以输入数组的值
        }else {
            for (int i=0;i<=9;i++){
                arr[n] = i;
                printToMaxOfNDigits(arr,n+1);
            }
        }
    }
    private static void printArray(int[] array){
        int index = 0; //找到第一个非0的元素
        while (index < array.length&&array[index]==0){
            index++;
        }
        //从第一个非0值到开始输出到最后的元素
        for (int i=index;i <array.length;i++){
            System.out.println(array[i]);
        }
        //条件
        if (index<array.length){
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Question12 question12 = new Question12();
        question12.printToMaxOfNDigits(2);
    }
}
