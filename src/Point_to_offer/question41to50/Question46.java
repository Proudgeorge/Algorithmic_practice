package Point_to_offer.question41to50;

/**求1+2+3+...+n，要求不能使用乘除法、for、while、if、else、switch、case等关键字及条件判断语句（A?B:C）。
 * @author simba@onlying.cn
 * @date 2019/8/7 17:14
 */
public class Question46 {
    /**
     * 递归思路
     * @param n
     * @return
     */
    public int Sum_Solution(int n) {
        int sum = n;
        boolean t = (n >0)&&(sum+=Sum_Solution(n-1))>0;
        return sum;
    }
}
