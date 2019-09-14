package Point_to_offer.question11to20;

import LinkedList.ListNode;

/**
 * @author simba@onlying.cn
 * @date 2019/7/11 0:22
 */
public class Question17 {
    public ListNode Merge(ListNode list1, ListNode list2) {
        if (list1==null)
            return list2;
        if (list2==null)
            return list1;
        ListNode newHead = null;
        if (list1.val <= list2.val){
            newHead = list1;
            newHead.next = Merge(list1.next,list2);
        }else {
            newHead = list2;
            newHead.next = Merge(list1,list2.next);
        }
        return newHead;
    }
}
