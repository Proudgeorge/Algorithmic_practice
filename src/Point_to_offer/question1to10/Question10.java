package Point_to_offer.question1to10;

/**
 * 输入一个整数，输出该数二进制表示中1的个数。其中负数用补码表示。
 * @author simba@onlying.cn
 * @date 2019/7/9 0:11
 */
public class Question10 {
    public int NumberOf1(int n) {
        int count=0;
        while (n!=0){
            count++;
            n = n &(n-1);
        }
        return count;
    }
}
