package Point_to_offer.question41to50;

/**
 * 写一个函数，求两个整数之和，要求在函数体内不得使用+、-、*、/四则运算符号。
 * @author simba@onlying.cn
 * @date 2019/8/7 17:31
 */
public class Question47 {
    /**
     * 5 101 7 111 计算5+7
     * 相加各位的值，不算进位，得到010，二进制每位相加就相当于各位做异或操作，101^111=010
     *
     * 计算进位值，得到1010，相当于各位做与操作得到101，再向左移一位得到1010，(101&111)<<1。
     *
     * 重复上述两步， 各位相加 010^1010=1000，进位值为100=(010&1010)<<1。
     *
     * 继续重复上述两步：1000^100 = 1100，进位值为0，跳出循环，1100为最终结果
     * @param num1
     * @param num2
     * @return
     */
    public int Add(int num1,int num2) {
        if (num2 == 0)
            return num1;
        int sum = 0,carry = 0;
        while (num2 != 0){
            sum = num1^num2;
            carry = (num1 & num2) << 1;
            num1 = sum;
            num2 = carry;
        }
        return num1;
    }
}
