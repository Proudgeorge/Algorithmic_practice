package Point_to_offer.question31to40;

import com.sun.org.apache.regexp.internal.RE;
import org.junit.Test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

/**输入一个正整数数组，把数组里所有数字拼接起来排成一个数，打印能拼接出的所有数字中最小的一个
 * @author simba@onlying.cn
 * @date 2019/7/21 23:20
 */
public class Question33 {
    public String PrintMinNumber(int [] numbers) {
        if (numbers == null||numbers.length ==0){
            return "";
        }
        int len = numbers.length;
        String[] strings = new String[len];
        StringBuffer sb = new StringBuffer();
        for (int i=0;i<len;i++){
            strings[i] = String.valueOf(numbers[i]);
        }
        Arrays.sort(strings, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                String c1 = s1+s2;
                String c2 = s2+s1;
                return c1.compareTo(c2);
            }
        });
        for (int i=0;i<len;i++)
            sb.append(strings[i]);
    return sb.toString();
    }

    @Test
    public void test() {
        int[] arr = {3,32,321};
        System.out.println(PrintMinNumber(arr));
    }
}
