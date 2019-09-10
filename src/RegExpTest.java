import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author simba@onlying.cn
 * @date 2019/9/5 11:15
 */
public class RegExpTest {
    public static void main(String[] args) {
        String string = "成都市(成华区)(武侯区)(高新区)";
        Pattern pattern = Pattern.compile(".*?(?=\\()");
        Matcher m = pattern.matcher(string);
        if (m.find()){
            System.out.println(m.group());
        }
    }
}
