package Point_to_offer.question31to40;

import com.sun.org.apache.regexp.internal.RE;

/**
 *从1到非负整数n中1出现的次数
 * @author simba@onlying.cn
 * @date 2019/7/21 15:31
 */
public class Question32 {
    /**
     * 法一：依次遍历每个数，判断每个数里面是否包含1
     * 法二：同法一，将数字转成字符串，直接判断
     * 法三：归纳法
     * @param n
     * @return
     */
    public int NumberOf1Between1AndN_Solution1(int n) {
        int res = 0;
        for (int i=1;i<=n;i++){
            res += number1(i);
        }
        return res;
    }
    public int number1(int n){
        int res = 0;
        while (n>0){
            if (n%10 == 1)
                res++;
            n /= 10;
        }
        return res;
    }

    public int NumberOf1Between1AndN_Solution2(int n) {
        int res = 0;
        StringBuffer stringBuffer = new StringBuffer();
        for (int i=1;i<=n;i++)
            stringBuffer.append(i);
        String string = stringBuffer.toString();
        for (int i=0;i<string.length();i++)
            if (string.charAt(i) == '1')
                res++;


        return res;

    }

    public int NumberOf1Between1AndN_Solution3(int n) {
        int res = 0;
        int cur = 0,before=0,after = 0;
        int i = 1;
        while (i<n){
            before = n/(i*10);
            cur = (n/i)%10;
            after = n - n/i*i;
            if (cur == 0){
                //如果当前为0，出现1的次数有高位决定，等于高位数字*当前位数
                res += before*i;
            }else if (cur == 1){
                //如果1，出现1的次数由高位和地位决定，高位*当前位+低位+1
                res += before *i +after+1;
            }else {
                //如果大于1，出现1的次数由高位决定，（高位数字+1）*当前位数
                res += (before+1)*i;
            }
            i *=10;
        }
        return res;
    }
}
