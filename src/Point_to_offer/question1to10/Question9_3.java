package Point_to_offer.question1to10;

/**
 * 我们可以用2*1的小矩形横着或者竖着去覆盖更大的矩形。
 * 请问用n个2*1的小矩形无重叠地覆盖一个2*n的大矩形，总共有多少种方法？
 * @author simba@onlying.cn
 * @date 2019/7/8 23:48
 */
public class Question9_3 {
    public int RectCover(int target) {
        if (target <= 0 ){
            return 0;
        }
        if (target ==1){
            return 1;
        }
        if (target == 2){
            return 2;
        }else {
            return RectCover(target-1)+RectCover(target-2);
        }
    }
}
