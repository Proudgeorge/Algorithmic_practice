package Point_to_offer.question11to20;

import Point_to_offer.question1to10.ListNode;
import com.sun.xml.internal.bind.v2.model.core.ID;

/**
 * O(1)时间删除链表节点
 * 将要删除节点的下一个节点的值赋给要删除的节点，然后指向下下一个节点
 * @author simba@onlying.cn
 * @date 2019/7/10 21:43
 */
public class Question13 {
    public void deleteNode(ListNode head,ListNode delistNode){
        if (delistNode==null||head==null)
            return;
        if (head == delistNode){
            head = null;
        }else {
            if (delistNode.next == null){
                ListNode ponitListNode = head;
                while (ponitListNode.next.next != null){
                    ponitListNode = ponitListNode.next;
                }
                ponitListNode.next = null;
            }else {
                delistNode.val = delistNode.next.val;
                delistNode.next = delistNode.next.next;
            }
        }


    }
}
