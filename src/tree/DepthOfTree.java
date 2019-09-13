package tree;

import Point_to_offer.question1to10.TreeNode;

/**
 * @author simba@onlying.cn
 * @date 2019/8/24 22:21
 */
public class DepthOfTree {
    //递归实现
    public int maxDepth(TreeNode root){
        if (root == null)
            return 0;
        int left = maxDepth(root.left);
        int right = maxDepth(root.right);
        int bigger = Math.max(left,right);
        return bigger+1;
    }
    //非递归实现
    public int maxDepth2(TreeNode root){
        if (root == null)
            return 0;
        return 0;
    }
}
