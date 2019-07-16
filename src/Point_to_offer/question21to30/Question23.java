package Point_to_offer.question21to30;

import Point_to_offer.question1to10.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * 从上往下打印出二叉树的每个节点，同层节点从左至右打印
 * @author simba@onlying.cn
 * @date 2019/7/14 22:30
 */
public class Question23 {
    /**
     * 使用两个队列一个存放节点，一个存放值。先将根节点加入到队列中，然后遍历队列中的元素，
     * 遍历过程中，访问该元素的左右节点，再将左右子节点加入到队列中来。
     * @param root
     * @return
     */
    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<>();
        if (root == null)
            return list;
        LinkedList<TreeNode> linkedList = new LinkedList<>();
        linkedList.add(root);

        while (!linkedList.isEmpty()){
            //获取并移除队列头部元素，如果队列为空，返回null；
            TreeNode node = linkedList.poll();
            list.add(node.val); //存值
            if (node.left != null){
                linkedList.addLast(node.left); //存放节点
            }
            if (node.right != null){
                linkedList.addLast(node.right);
            }
        }
        return list;
    }
}

