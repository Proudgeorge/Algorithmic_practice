package Point_to_offer.question41to50;

import java.lang.reflect.Array;
import java.security.PublicKey;
import java.util.ArrayList;

/**
 * 小明很喜欢数学,有一天他在做数学作业时,要求计算出9~16的和,他马上就写出了正确答案是100。但是他并不
 * 满足于此,他在想究竟有多少种连续的正数序列的和为100(至少包括两个数)。没多久,他就得到另一组连续正数
 * 和为100的序列:18,19,20,21,22。现在把问题交给你,你能不能也很快的找出所有和为S的连续正数序列?
 * Good Luck!
 * @author simba@onlying.cn
 * @date 2019/8/6 16:15
 */
public class Question41 {
    /**
     * 滑动窗口的方法：用两个数字 start 和 end 分别表示序列的最小值和最大值，首先将 start
     * 初始化为1，end 初始化为2。如果从start到end的和大于sum，我们就从序列中去掉较小的值
     * (即增大start),相反，只需要增大end。
     * 终止条件为：一直增加begin到(1+sum)/2并且end小于sum为止
     * @param sum
     * @return
     */
    public ArrayList<ArrayList<Integer>> FindContinuousSequence(int sum) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
        if (sum < 3)
            return res;
        int start = 1,end = 2,mid = (1+sum)/2;
        while (start < mid){
            int s = totalsum(start,end);
            if (s == sum){
                res.add(getSequence(start,end));
                end++;
            }else if (s<sum){
                end++;
            }else if (s>sum){
                start++;
            }
        }
        return res;
    }
    public int totalsum(int start,int end){
        int sum = 0;
        for (int i = start;i <= end;i++){
            sum += i;
        }
        return sum;
    }
    public ArrayList<Integer> getSequence(int start,int end){
        ArrayList<Integer> temp = new ArrayList<>();
        for (int i= start;i<= end;i++){
            temp.add(i);
        }
        return temp;
    }
}
