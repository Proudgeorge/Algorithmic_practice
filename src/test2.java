import java.util.Arrays;
import java.util.Iterator;

/**
 * @author simba@onlying.cn
 * @date 2019/6/24 0:25
 */
public class test2 {
    public static void main(String[] args) {
//        double a = 255;
//        double b = 120;
//        double c = 1495;
//        System.out.println(0.5*a+0.3*b+0.2*c);

        int[] pre = {3,6,8,3,45,77,33,2,1};
        for (int iterator:Arrays.copyOfRange(pre,1,4)){
            System.out.println(iterator);
        }
//        System.out.println(Arrays.copyOfRange(pre,1,4));

        int[][] matrix = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        System.out.println(matrix.length);
        System.out.println(Arrays.toString(matrix[0]));
    }



}
