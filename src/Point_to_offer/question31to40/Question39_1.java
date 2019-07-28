package Point_to_offer.question31to40;

import Point_to_offer.question1to10.TreeNode;

/**
 * 输入一棵二叉树，判断该二叉树是否是平衡二叉树。
 * 思路：平衡因子的绝对值<= 1
 * @author simba@onlying.cn
 * @date 2019/7/25 21:22
 */
public class Question39_1 {
    private boolean isBalanced = true;
    public boolean IsBalanced_Solution(TreeNode root){

        getDepth(root);
        return isBalanced;
    }

    public int getDepth(TreeNode root){
        if (root == null){
            return 0;
        }
        int left = getDepth(root.left);
        int right = getDepth(root.right);
        if (Math.abs(left - right) > 1){
            isBalanced = false;
        }

        return left > right? (left+1):(right+1);
    }
}
