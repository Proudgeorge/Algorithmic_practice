package Point_to_offer.question11to20;

import Point_to_offer.question1to10.TreeNode;

/**输入两棵二叉树A，B，判断B是不是A的子结构。
 * （ps：我们约定空树不是任意一个树的子结构）
 * 思路：若根节点相等，利用递归比较他们的子树是否相等，若根节点不相等，则利用递归分别在左右子树中查找。
 * @author simba@onlying.cn
 * @date 2019/7/11 10:06
 */
public class Question18 {
    public boolean HasSubtree(TreeNode root1, TreeNode root2) {
        boolean reuslt = false;
        if (root1 !=null&&root2!=null){
            if (root1.val == root2.val){
                reuslt = doesTreeHaveTree2(root1,root2);
            }
            if (!reuslt){
                return HasSubtree(root1.left,root2)||HasSubtree(root1.right,root2);
            }
        }
        return reuslt;
    }
    public boolean doesTreeHaveTree2(TreeNode node1,TreeNode node2){
        if (node2 == null){
            return true;
        }
        if (node1 == null){
            return false;
        }
        if (node1.val!= node2.val){
            return false;
        }
        return doesTreeHaveTree2(node1.left,node2.left)&&
                doesTreeHaveTree2(node1.right,node2.right);
    }
}
