package Point_to_offer.question11to20;

import Point_to_offer.question1to10.ListNode;

/**
 * 输入一个链表，输出该链表中倒数第k个结点
 * 思路：定义一快一慢两个指针，快指针走K步，然后慢指针开始走，
 * 快指针到尾时，慢指针就找到了倒数第K个节点
 * @author simba@onlying.cn
 * @date 2019/7/10 23:07
 */
public class Question15 {
    public ListNode FindKthToTail(ListNode head,int k){
        if (head == null||k <=0){
            return null;
        }
        ListNode fast = head;
        ListNode slow = head;
        while (k-- >1){
            if (fast.next != null)
                fast = fast.next;
            else
                return null;

        }
        while (fast.next != null){
            fast = fast.next;
            slow = slow.next;
        }
        return slow;
    }

}
