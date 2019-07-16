package Point_to_offer.question11to20;

import Point_to_offer.question1to10.TreeNode;
import com.sun.xml.internal.bind.v2.model.core.ID;

/**
 * 操作给定的二叉树，将其变换为源二叉树的镜像。
 * 思路：使用递归或非递归方式交换每个节点的左右子树位置
 * @author simba@onlying.cn
 * @date 2019/7/11 10:58
 */
public class Question19 {
    public void Mirror(TreeNode root) {
        TreeNode temp ;
        if (root != null){
            temp = root.right;
            root.right = root.left;
            root.left = temp;
            if (root.left != null){
                Mirror(root.left);
            }
            if (root.right !=null){
                Mirror(root.right);
            }
        }
    }
}
