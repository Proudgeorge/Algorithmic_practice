package Point_to_offer.question21to30;

import com.sun.xml.internal.bind.v2.model.core.ID;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/**
 * @author simba@onlying.cn
 * @date 2019/7/17 23:30
 */
public class Question28 {
    ArrayList<String> res = new ArrayList<String>();
    public ArrayList<String> Permutation(String str) {
        if (str == null)
            return res;
        PermutationHelper(str.toCharArray(),0);
        Collections.sort(res);
        return res;
    }
    public void PermutationHelper(char[] str,int i){
        if (i == str.length - 1){
            res.add(String.valueOf(str));
        }else {
            for (int j = i; j < str.length; j++){
                if (j != i && str[i] == str[j])
                    continue;
                swap(str, i, j);
                PermutationHelper(str,i+1);
                swap(str,i,j);
            }
        }
    }
    public void swap(char[] str,int i,int j){
        char temp = str[i];
        str[i] = str[j];
        str[j] = temp;
    }
}
