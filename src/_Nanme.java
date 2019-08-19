/**
 * @author simba@onlying.cn
 * @date 2019/8/10 13:24
 */
public class _Nanme {
    public static void main(String[] args) {
        int sum = 0;
        for (int x=0;x<10;x++){
            sum += x;
            if (x%3==0){
                break;
            }
        }
        System.out.println(sum);
    }
}
