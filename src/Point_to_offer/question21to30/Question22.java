package Point_to_offer.question21to30;

import jdk.management.resource.NotifyingMeter;

import java.util.ArrayList;
import java.util.Stack;


/**
 * 输入两个整数序列，第一个序列表示栈的压入顺序，请判断第二个序列是否可能为该栈的弹出顺序。
 * 假设压入栈的所有数字均不相等。例如序列1,2,3,4,5是某栈的压入顺序，
 * 序列4,5,3,2,1是该压栈序列对应的一个弹出序列，但4,3,5,1,2就不可能是该压栈序列的弹出序列。
 * （注意：这两个序列的长度是相等的）
 * @author simba@onlying.cn
 * @date 2019/7/13 11:39
 */
public class Question22 {
    public boolean IsPopOrder(int[] pushA,int[] popA){
        if (pushA.length != popA.length||pushA.length==0||popA.length==0)
            return false;

        Stack<Integer> stack = new Stack<>();
//        ArrayList<Integer> list = new ArrayList<>();
        int index = 0;
        for (int i=0;i<pushA.length;i++){
            stack.push(pushA[i]);
            while (!stack.empty()&&stack.peek()==popA[index]){
                stack.pop();
                index++;
            }
        }
        return stack.empty();

    }

}
