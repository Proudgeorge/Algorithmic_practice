import java.util.Random;

/**
 * @author simba@onlying.cn
 * @date 2019/7/8 22:46
 */
public class random_result {
    public static void main(String[] args) {
        Random random = new Random();
        for (int i=0;i<4;i++){
            System.out.println(random.nextInt(25)+1);
        }
    }
}
