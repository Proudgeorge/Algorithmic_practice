package Point_to_offer.question41to50;

import com.sun.xml.internal.bind.v2.model.core.ID;

/**
 * 把字符串转换成整数
 * @author simba@onlying.cn
 * @date 2019/8/7 21:13
 */
public class Question49 {
    public int StrToInt(String str) {
        if (str.length() == 0)
            return 0;
        int flag = 0;
        if (str.charAt(0) == '+')
            flag = 1;
        else if (str.charAt(0) == '-')
            flag = 2;
        int start = flag >0?1:0;
        long res = 0;
        while (start < str.length()){
            if (str.charAt(start)>'9'||str.charAt(start)<'0')
                return 0;
            res = res*10 +(str.charAt(start)-'0');
            start++;
        }
        return flag == 2?-(int)res:(int)res;

    }
}
