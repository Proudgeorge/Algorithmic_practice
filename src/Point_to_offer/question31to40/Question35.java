package Point_to_offer.question31to40;

import java.util.LinkedHashMap;

/**
 * 在一个字符串(1<=字符串长度<=10000，全部由字母组成)中找到第一个只出现一次的字符,并返回它的位置
 * @author simba@onlying.cn
 * @date 2019/7/23 16:25
 */
public class Question35 {
    public int FirstNotRepeatingChar1(String str) {
        if (str == null||str.length()==0)
            return -1;
        char[] chars = str.toCharArray();
        LinkedHashMap<Character,Integer> hashMap = new LinkedHashMap<Character, Integer>();

        for (char item:chars){
            if (hashMap.containsKey(item))
                hashMap.put(item,hashMap.get(item)+1);
            else {
                hashMap.put(item,1);
            }
        }
        for (int i= 0;i<str.length();i++){
            if (hashMap.get(str.charAt(i)) == 1){
                return i;
            }
        }
        return -1;
    }

    public int FirstNotRepeatingChar2(String str) {
        int len = str.length();
        if (str ==null||len == 0)
            return -1;
        char[] s = str.toCharArray();
        int[] m = new int[256];
        for (int i = 0;i<len;i++){
            if (m[s[i]] == 1)
                return i;
        }
        return -1;
    }
}
