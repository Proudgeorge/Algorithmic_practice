package Point_to_offer.question21to30;

import com.sun.org.apache.regexp.internal.RE;

import javax.naming.InitialContext;
import java.util.Arrays;

/**输入一个整数数组，判断该数组是不是某二叉搜索树的后序遍历的结果。
 * 如果是则输出Yes,否则输出No。假设输入的数组的任意两个数字都互不相同。
 * @author simba@onlying.cn
 * @date 2019/7/14 23:11
 */
public class Question24 {
    /**
     * 二叉搜索树: 左子树<根<=右子树
     * 对于后序遍历来说，序列数组的最后一个元素一定是根节点, 根据这个元素，
     * 将前面的数组分为左、右两个部分，左侧部分都比该元素小，右侧部分都比该元素大，
     * 如果右侧部分有比该根节点小的元素，那么就不是后序遍历，如此递归进行。
     * @param sequence
     * @return
     */
    public boolean VerifySquenceOfBST(int [] sequence) {
        if (sequence ==null||sequence.length == 0){
            return false;
        }
        int rstart = 0;
        int length = sequence.length;

        for (int i=0;i<length-1;i++){
            if (sequence[i] <sequence[length-1]){
                rstart++;
            }
        }
        if (rstart == 0){
            VerifySquenceOfBST(Arrays.copyOfRange(sequence,0,length-1));
        }else {
            for (int i = rstart;i<length-1;i++){
                if (sequence[i]<=sequence[length-1])
                    return false;
            }
            VerifySquenceOfBST(Arrays.copyOfRange(sequence,0,rstart));
            VerifySquenceOfBST(Arrays.copyOfRange(sequence,rstart,length-1));
        }
        return true;
    }

}
