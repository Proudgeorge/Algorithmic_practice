import org.junit.Test;

import java.awt.*;
import java.awt.geom.RoundRectangle2D;

/**
 * @author simba@onlying.cn
 * @date 2019/6/21 23:01
 */
public class test {
    public static void main(String[] args) {
        final double a = 0.5;
        double[] b = new double[8];

        double[] c = new double[8];
        for (int i = 0; i < 8; i++) {
            b[i] = Math.random();
            c[i] = Math.random();
            System.out.println(i+"=====");
            if (b[i]>a&&c[i]>a){
                System.out.println(i);
            }

        }
    }



}
