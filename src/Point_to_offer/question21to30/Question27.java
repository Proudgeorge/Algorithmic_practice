package Point_to_offer.question21to30;

import Point_to_offer.question1to10.TreeNode;

/**
 * 输入一棵二叉搜索树，将该二叉搜索树转换成一个排序的双向链表。
 * 要求不能创建任何新的结点，只能调整树中结点指针的指向。
 * @author simba@onlying.cn
 * @date 2019/7/15 23:22
 */
public class Question27 {
    /**
     *
     */
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
