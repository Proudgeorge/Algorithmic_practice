package Point_to_offer.question41to50;

/**
 * 对于一个给定的字符序列S，请你把其循环左移K位后的序列输出
 * @author simba@onlying.cn
 * @date 2019/8/7 10:35
 */
public class Question42_1 {
    public String LeftRotateString(String str,int n) {
        int len = str.length();
        if (len == 0)
            return "";
        n = n % len;
        String s1 = str.substring(n,len);
        String s2 = str.substring(0,n);
        return s1 + s2;
    }

    public static void main(String[] args) {
        System.out.println(3%11);
    }
}
