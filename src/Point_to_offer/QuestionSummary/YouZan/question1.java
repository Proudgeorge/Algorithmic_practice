package Point_to_offer.QuestionSummary.YouZan;

import java.util.Scanner;

import static java.lang.System.in;

/**
 *给定一个非空的整数数组，从数组第一个元素(下标为0的元素)开始遍历进行移动，下一次向后或向前移动
 * 该元素的值 的位数（值为正数向后移动，值为负数向前移动，值为零不移动），依次类推进行移动，若某次
 * 移动数组出现越界，则说明数组可以跳出，返回true；不能跳出则返回false；
 * （加分项：也可考虑不增加使用其他集合数组辅助完成算法）
 * 例1：
 * 输入数组a[5] = [1,2,3,2,5];从第一个元素开始a[0]=1,下次向后移动1位到第二个元素a[1]=2,
 * 再次向后移动2位到第四个元素a[3],因为下次向后移动2位(a[3]=2)后,向后数组越界,即跳出数组,输出true;
 * 例2：
 * 输入数组a[2] = [1,-3];从第一个元素开始a[0]=1,下次移动1位到第二个元素a[1]=-3,
 * 再次向前移动3位后,向前数组越界,即跳出数组,输出true;
 * @author simba@onlying.cn
 * @date 2019/8/8 9:38
 */
public class question1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);
        String[] str = scanner.nextLine().replace("[","").replace("]","").split(",");
        int[] data = new int[str.length];
        for (int i=0;i<data.length;i++){
            data[i] = Integer.parseInt(str[i]);
        }
        int i = 0;
        int temp = 0;
        while (true){
            if (i<0||i>=data.length){
                System.out.println(true);
                return;
            }else if (data[i] == Integer.MAX_VALUE){
                System.out.println(false);
                return;
            }else {
                temp = data[i];
                data[i] = Integer.MAX_VALUE;
                i += temp;
            }
        }
    }
}
