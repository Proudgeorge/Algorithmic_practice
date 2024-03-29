package Point_to_offer.question1to10;

/**
 * 大家都知道斐波那契数列，现在要求输入一个整数n，请你输出斐波那契数列的第n项（从0开始，第0项为0）。
 * n<=39
 * @author simba@onlying.cn
 * @date 2019/7/8 23:15
 */

public class Question9 {
    public int Fibonacci(int n) {
        int result = 0;
        int preOne = 0;
        int preTwo = 1;
        if (n==0){
            return result;
        }else if (n ==1){
            return preTwo;
        }else {
            for (int i=2;i<=n;i++){
                result = preOne+preTwo;
                preTwo = preOne;
                preOne = result;
            }
        }
        return result;
    }
}
