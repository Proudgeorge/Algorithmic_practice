package TestPreparePractice;

import java.util.Scanner;

/**
 * 股票问题
 * @author simba@onlying.cn
 * @date 2019/8/23 23:17
 */
public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()){
           int days = sc.nextInt();

        }
    }
    public int stock(int n){
        if (n == 1)
            return 1;
        int price = 1;
        int next = 1;
        int temp = next;
        while (n >= 1){
            while (temp >0){
                price++;
                temp--;
                n--;
                if (n==0){
                    break;
                }
            }
            if (n>=1){
                price--;
                n--;
            }
            next++;
            temp = next;

        }
        return price;
    }
}


