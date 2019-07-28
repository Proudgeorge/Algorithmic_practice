package Point_to_offer.question21to30;

import com.sun.xml.internal.bind.v2.model.core.ID;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.TreeSet;

/**
 * 输入一个字符串,按字典序打印出该字符串中字符的所有排列。例如输入字符串abc,
 * 则打印出由字符a,b,c所能排列出来的所有字符串abc,acb,bac,bca,cab和cba。
 * @author simba@onlying.cn
 * @date 2019/7/17 23:30
 */
public class Question28 {
    public ArrayList<String> Permutation(String str) {
        ArrayList<String> result = new ArrayList<String>();
        if (str == null || str.length() ==0)
            return result;
        char[] chars = str.toCharArray();
        TreeSet<String> temp = new TreeSet<>();
        Permutation(chars,0,temp);
        result.addAll(temp);
        return result;
    }
    public void Permutation(char[] chars,int index,TreeSet<String> result){
        if (chars ==null||chars.length == 0)
            return;
        if (index < 0||index>chars.length - 1)
            return;
        if (index == chars.length-1){
            result.add(String.valueOf(chars));
        }else {
            for (int i=index;i<=chars.length-1;i++){
                swap(chars,index,i);
                Permutation(chars,index+1,result);
                //回退
                swap(chars,index,i);
            }
        }
    }
    public void swap(char[] str,int i,int j){
        char temp = str[i];
        str[i] = str[j];
        str[j] = temp;
    }
}
