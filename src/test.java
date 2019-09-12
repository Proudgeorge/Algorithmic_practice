import org.junit.Test;

import java.awt.*;
import java.awt.geom.RoundRectangle2D;
import java.util.Arrays;

/**
 * @author simba@onlying.cn
 * @date 2019/6/21 23:01
 */
public class test {
    public static void main(String[] args) {
        int[] pre = {3,6,8,3,45,77,33,2,1};
        for (int i=0;i<pre.length/2;i++){
            swap(pre,i,pre.length-1-i);
        }
        System.out.println(Arrays.toString(pre));
//        final double a = 0.5;
//        double[] b = new double[8];
//
//        double[] c = new double[8];
//        for (int i = 0; i < 8; i++) {
//            b[i] = Math.random();
//            c[i] = Math.random();
//            System.out.println(i+"=====");
//            if (b[i]>a&&c[i]>a){
//                System.out.println(i);
//            }
//
//        }

    }


    public static void swap(int[] str, int a, int b){
        int temp = str[a];
        str[a] = str[b];
        str[b] = temp;
    }

}
