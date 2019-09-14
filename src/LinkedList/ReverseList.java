package LinkedList;

/**
 * @author simba@onlying.cn
 * @date 2019/9/14 13:31
 */

public class ReverseList {
    /**
     *反转链表
     * @param head
     * @return pre 反转后的链表
     */
    public ListNode reverseList(ListNode head){
        //正确性判断
        if ( head == null||head.next==null){
            return head;
        }
        ListNode pre = null;
        while (head!=null){
            ListNode temp = head;
            head = head.next;
            temp.next = pre;
            pre = temp;
        }
        return pre;
    }

    /**
     * 将两个有序链表合并为一个新的有序链表并返回
     * @param l1
     * @param l2
     * @return
     */
    public ListNode mergeTwoLists(ListNode l1,ListNode l2){
        if (l1==null)
            return l2;
        if (l2==null)
            return l1;
        ListNode head = null;
        if (l1.val<l2.val){
            head = l1;
            head.next = mergeTwoLists(l1.next,l2);
        }else {
            head = l2;
            head.next = mergeTwoLists(l2.next,l1);
        }
        return head;
    }
}
