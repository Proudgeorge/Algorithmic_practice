package TestPreparePractice;

import java.util.Scanner;

/**
 * @author simba@onlying.cn
 * @date 2019/8/24 0:08
 */
public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()){
            int n = sc.nextInt();
            int[] a= new int[n];
            for (int i=0;i<n;i++){
                a[i] = sc.nextInt();
            }
            System.out.println(isSort(a,n));
        }
    }
    public static String isSort(int[] a,int n){
        int flag = 0;
        int first = 0;
        for (int i=1;i<n&&flag<=1;i++){
            if (a[i] < a[i-1]){
                first = a[i-1];
                while (i<n&&a[i]<a[i-1]) i++;
                if (i == n) flag++;
                else if (first <a[i])flag++;
                else flag = 2;
            }
        }
        if (flag==1)
            return "yes";
        return "no";
    }
}
