package Point_to_offer.question41to50;

/**翻转单词顺序列
 * trim() : 去除字符串首尾空格
 * split() : 对字符串按照所传参数进行分割
 * @author simba@onlying.cn
 * @date 2019/8/7 10:34
 */
public class Question42 {
    public String ReverseSentence(String str) {
        if (str.trim().length() == 0)
            return str;
        String[] temp = str.split(" ");
        String res = "";
        for (int i=temp.length-1;i>=0;i--){
            res += temp[i];
            if (i != 0)
                res += " ";
        }
        return res;
    }
}
