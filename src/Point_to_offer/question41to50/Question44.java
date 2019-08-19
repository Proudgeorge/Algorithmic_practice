package Point_to_offer.question41to50;

import java.util.Arrays;

/**
 * 扑克牌顺子游戏
 * @author simba@onlying.cn
 * @date 2019/8/7 11:22
 */
public class Question44 {
    public boolean isContinuous(int [] numbers) {
        int zero = 0,dis = 0;
        if (numbers.length != 5)
            return false;
        Arrays.sort(numbers);
        for (int i = 0;i < 4;i++){
            if(numbers[i] == 0){
                zero++;
                continue;
            }
            if (numbers[i] == numbers[i+1] )
                return false;
            if (numbers[i+1]-numbers[i] > 1)
                dis += numbers[i+1]-numbers[i]-1;
        }
        if (zero >= dis)
            return true;
        else
            return false;
    }
}
