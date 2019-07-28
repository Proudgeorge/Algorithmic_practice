package Point_to_offer.question31to40;

import Point_to_offer.question1to10.ListNode;

import java.util.Stack;

/**
 * 输入两个链表，找出它们的第一个公共结点
 * @author simba@onlying.cn
 * @date 2019/7/24 23:30
 */
public class Question37 {
    public ListNode FindFirstCommonNode1(ListNode pHead1, ListNode pHead2) {
        Stack<ListNode> stack1 = new Stack<>();
        Stack<ListNode> stack2 = new Stack<>();
        while (pHead1 != null){
            stack1.push(pHead1);
            pHead1 = pHead1.next;
        }
        while (pHead2 != null){
            stack2.push(pHead2);
            pHead2 = pHead2.next;
        }
        ListNode res = null;
        while (!stack1.isEmpty()&&!stack2.isEmpty()&&stack1.peek() == stack2.peek()){
            stack1.pop();
            res = stack2.pop();
        }
        return res;
    }

    public ListNode FindFirstCommonNode2(ListNode pHead1, ListNode pHead2) {
        if (pHead1 ==null||pHead2 ==null)
            return null;
        int count1 = 1,count2 = 1;
        ListNode p1 = pHead1;
        ListNode p2 = pHead2;
        while (p1.next != null){
            p1 = p1.next;
            count1++;
        }
        while (p2.next != null){
            p2 = p2.next;
            count2++;
        }
        if (count1 > count2){
           int dif = count1-count2;
           while (dif != 0){
               pHead1 = pHead1.next;
               dif--;
           }
        }else {
            int dif = count2 - count1;
            while (dif != 0){
                pHead2 = pHead2.next;
                dif--;
            }
        }
        while (pHead1 != null&&pHead2 != null){
            if (pHead1 == pHead2)
                return pHead1;
            pHead1 = pHead1.next;
            pHead2 = pHead2.next;
        }
        return null;

    }
}
