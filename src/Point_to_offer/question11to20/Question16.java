package Point_to_offer.question11to20;

import Point_to_offer.question1to10.ListNode;

/**
 * @author simba@onlying.cn
 * @date 2019/7/10 23:40
 */
public class Question16 {
    public ListNode ReverseList(ListNode head) {
        if (head == null)
            return null;
        ListNode pre = null;
        ListNode next = null;
        while (head != null){
            next = head.next;
            head.next = pre;
            pre = head;
            head = next;
        }
        return pre;
    }
}
