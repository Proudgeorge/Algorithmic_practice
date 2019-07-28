package Point_to_offer.question31to40;

import Point_to_offer.question1to10.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author simba@onlying.cn
 * @date 2019/7/25 16:09
 */
public class Question39 {
    public int TreeDepth1(TreeNode root) {
        if (root == null)
            return 0;
        int left = TreeDepth1(root.left)+1;
        int right = TreeDepth1(root.right)+1;
        return left>right ? left:right;
    }

    public int TreeDepth2(TreeNode root) {
        if (root == null)
            return 0;
        int deep = 0;
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.offer(root);
        int start = 0,end = 1;
        while (!queue.isEmpty()){
            TreeNode node = queue.poll();
            start++;
            if (node.left != null){
                queue.offer(node.left);
            }
            if (node.right != null){
                queue.offer(node.right);
            }
            if (start == end){
                end = queue.size();
                start = 0;
                deep++;
            }
        }
        return deep;
    }
}
