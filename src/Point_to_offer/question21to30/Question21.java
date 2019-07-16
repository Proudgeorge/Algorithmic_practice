package Point_to_offer.question21to30;

import java.util.Stack;

/**
 * 定义栈的数据结构，请在该类型中实现一个能够得到栈中所含最小元素
 * 的min函数（时间复杂度应为O（1））。
 * @author simba@onlying.cn
 * @date 2019/7/11 16:35
 */
public class Question21 {
    Stack<Integer> stack = new Stack<>();
    Stack<Integer> temp = new Stack<>();
    int min = Integer.MAX_VALUE;
    public void push(int node){
        stack.push(node);
        if (node < min){
            temp.push(node);
            min = node;
        }else {
            temp.push(min);
        }
    }
    public void pop(){
        stack.pop();
        temp.pop();

    }
    public int top(){
        int t = stack.pop();
        stack.push(t);
        return t;
    }
    public int min(){
        int m = temp.pop();
        temp.push(m);
        return m;
    }
}
