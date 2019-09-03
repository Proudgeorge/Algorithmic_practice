package TestPreparePractice;

import java.util.Scanner;

/**
 * @author simba@onlying.cn
 * @date 2019/8/24 17:21
 */
public class Main3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] a = sc.next().toCharArray();
        char[] b = sc.next().toCharArray();
        int count = 0;
        for (int i=0;i<b.length;i++){
            if ((a[i]>='a'&&a[i]<='z')||(a[i]>='A'&&a[i]<='Z')||(a[i]>='0'&&a[i]<='9')){
                if (b[i]=='1'){
                    count++;
                }
            }else {
                if (b[i]=='0'){
                    count++;
                }
            }
        }
        System.out.println(String.format("%.2f",(double)count*100/b.length)+"%");
    }
}
