package Point_to_offer.question1to10;

/**
 * @author simba@onlying.cn
 * @date 2019/7/8 23:37
 */
public class Question9_2 {
    public int JumpFloor(int target) {
        int first = 1,seconde = 2,third =0;
        if (target<=0){
            return 0;
        }
        if (target ==1){
            return 1;
        }
        if (target == 2){
            return 2;
        }
        for (int i= 3;i<=target;i++){
            third = first+seconde;
            first = seconde;
            seconde = third;
        }

        return third;
    }


}
