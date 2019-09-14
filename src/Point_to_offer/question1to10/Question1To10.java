package Point_to_offer.question1to10;

import LinkedList.ListNode;

import java.util.ArrayList;
import java.util.Stack;

/**
 * @author simba@onlying.cn
 * @date 2019/7/7 15:28
 */
public class Question1To10 {
    public static void main(String[] args) {

    }

    /**
     *3.在一个二维数组中，每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。
     * 请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
     */
    public boolean find(int[][] array,int target){
        if (array == null){
            return false;
        }
        int row = 0;
        int colmn = array[0].length -1;
        while (row<array.length && colmn >=0){
            if (array[row][colmn] == target){
                return true;
            }
            if (array[row][colmn] > target){
                colmn--;
            }else {
                row++;
            }
        }
        return false;
    }
    /**
     * 4.将一个字符串中的空格替换成“%20”。
     * 例如，当字符串为We Are Happy.则经过替换之后的字符串为We%20Are%20Happy。
     */
    public String replaceSpace1(StringBuffer str){
        if (str == null){
            return null;
        }
        String s = String.valueOf(str);
        String replace = s.replace(" ", "%20");

        return replace;
    }
    public String replaceSpace2(StringBuffer str) {
        if (str == null)
            return null;
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            if (String.valueOf(str.charAt(i)).equals(" ")) {
                sb.append("%20");
            }else {
                sb.append(str.charAt(i));
            }
        }
        return String.valueOf(sb);
    }
    /**
     * 5.输入一个链表，从尾到头打印链表每个节点的值。
     *
     * 思路：借助栈实现，或使用递归的方法。
     */
    //递归
    ArrayList<Integer> list = new ArrayList<>();
    public ArrayList<Integer> printListFromTailToHead1(ListNode listNode) {

        if (listNode != null){
            System.out.println(listNode);
            list.add(listNode.val);
            this.printListFromTailToHead1(listNode.next);

        }
        return list;

    }
//    借助栈实现
    public ArrayList<Integer> printListFromTailToHead2(ListNode listNode) {
        ArrayList<Integer> list = new ArrayList<>();
        if (listNode == null)
            return list;
        Stack<ListNode> stack = new Stack<>();
        while (listNode != null) {
            stack.push(listNode);
            listNode = listNode.next;
        }

        while (!stack.isEmpty()) {
            list.add(stack.pop().val);
        }
        return list;
    }
    /**
     *6.输入某二叉树的前序遍历和中序遍历的结果，请重建出该二叉树。
     * 假设输入的前序遍历和中序遍历的结果中都不含重复的数字。
     * 例如输入前序遍历序列{1,2,4,7,3,5,6,8}和中序遍历序列{4,7,2,1,5,3,8,6}，
     * 则重建二叉树并返回
     */
    public TreeNode reConstructBinaryTree(int [] pre, int [] in) {

        if (pre == null || in == null) {
            return null;
        }
        if (pre.length == 0 || in.length == 0) {
            return null;
        }
        if (pre.length != in.length) {
            return null;
        }

        return recusiveConstruct(pre,0,pre.length-1,in,0,in.length-1);

    }

    private static TreeNode recusiveConstruct(int[] p, int pStart,int pEnd,
                                              int[] m,int mStart,int mEnd) {
        TreeNode head = new TreeNode(p[pStart]);
        if(pStart == pEnd)
            return head;
        int partition = 0;
        for(int i = mStart; i <= mEnd; i++){
            if(m[i] == p[pStart]){
                partition = i;
                break;
            }
        }
        if(partition - mStart > 0)
            head.left = recusiveConstruct(p,pStart+1,pStart+partition-mStart,
                    m,mStart,partition-1);
        if(mEnd - partition > 0)
            head.right = recusiveConstruct(p,pStart+partition-mStart+1,pEnd,
                    m,partition+1,mEnd);
        return head;
    }
    /**
     * 7.用两个栈来实现一个队列，完成队列的Push和Pop操作。 队列中的元素为int类型
     * 栈实现
     */

}































