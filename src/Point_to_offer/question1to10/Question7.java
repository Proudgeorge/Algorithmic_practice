package Point_to_offer.question1to10;

import java.util.Stack;

/**
 * @author simba@onlying.cn
 * @date 2019/7/8 21:15
 */
/**
 * 7.用两个栈来实现一个队列，完成队列的Push和Pop操作。 队列中的元素为int类型
 * 栈实现
 */
public class Question7 {
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();

    public void push(int node) {
        stack1.push(node);
    }

    public int pop() {
        if (stack1.isEmpty() && stack2.isEmpty()){
            throw new RuntimeException("stack is empty!");
        }

        if (stack2.isEmpty()){
            while (!stack1.isEmpty()){
               stack2.push(stack1.pop()) ;

            }
        }
        return stack2.pop();
    }
}
