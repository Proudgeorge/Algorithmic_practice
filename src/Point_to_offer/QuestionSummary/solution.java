package Point_to_offer.QuestionSummary;

import java.util.Scanner;

import static java.lang.System.in;

/**
 * @author simba@onlying.cn
 * @date 2019/8/8 9:38
 */
public class solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);
        String[] str = scanner.nextLine().replace("[","").replace("]","").split(",");
        int[] data = new int[str.length];
        for (int i=0;i<data.length;i++){
            data[i] = Integer.parseInt(str[i]);
        }
        int i = 0;
        int temp = 0;
        while (true){
            if (i<0||i>=data.length){
                System.out.println(true);
                return;
            }else if (data[i] == Integer.MAX_VALUE){
                System.out.println(false);
                return;
            }else {
                temp = data[i];
                data[i] = Integer.MAX_VALUE;
                i += temp;
            }
        }
    }
}
