package Point_to_offer.question21to30;

import Point_to_offer.question1to10.TreeNode;

/**
 * @author simba@onlying.cn
 * @date 2019/7/15 23:22
 */
public class Question27 {
    TreeNode head = null;
    TreeNode end = null;
    public TreeNode Convert(TreeNode pRootOfTree) {
        ConverSub(pRootOfTree);
        return head;
    }
    public void ConverSub(TreeNode pRootOfTree){
        if (pRootOfTree == null){
            return;
        }
        Convert(pRootOfTree.left);
        if (end == null){
            head = pRootOfTree;
            end = pRootOfTree;
        }else {
            end.right = pRootOfTree;
            pRootOfTree.left = end;
            end = pRootOfTree;
        }
        Convert(pRootOfTree.right);
    }
}
