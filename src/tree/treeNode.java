package tree;

import Point_to_offer.question1to10.TreeNode;

import java.util.LinkedList;

/**
 * @author simba@onlying.cn
 * @date 2019/7/7 22:51
 */
public class treeNode {
    public int val;
    public treeNode left;
    public treeNode right;
    treeNode(int x){
        val = x;
    }


    public void preOrderTraversel(TreeNode root){
        if (root != null){
            System.out.println(root.val+" ");
            preOrderTraversel(root.left);
            preOrderTraversel(root.right);
        }
    }
    public void preOrderTraversel2(TreeNode root){
        if (root == null)
            return;
        LinkedList<TreeNode> stack = new LinkedList<>();
        TreeNode pNode = root;
        while (pNode != null||!stack.isEmpty()){
            if (pNode != null){
                System.out.println(pNode.val+" ");
                stack.push(pNode);
                pNode = pNode.left;
            }else {
                TreeNode node = stack.pop();
                pNode = node.right;
            }
        }
    }
    public void inOrderTraversel(TreeNode root){
        if (root != null){
            inOrderTraversel(root.left);
            System.out.println(root.val+" ");
            inOrderTraversel(root.right);
        }
    }

    /**
     * 非递归中序遍历二叉树
     * @param root 二叉树跟节点
     * @return 中序遍历结果
     */
    public void inOrderTraversel2(TreeNode root){
        if (root == null)
            return;

    }
    public void postOrderTraversel(TreeNode root){
        if (root != null){
            postOrderTraversel(root.left);
            postOrderTraversel(root.right);
            System.out.println(root.val+" ");
        }
    }
    public void postOrderTraversel2(TreeNode root){
        if (root != null){
            postOrderTraversel(root.left);
            postOrderTraversel(root.right);
            System.out.println(root.val+" ");
        }
    }
    public void levelTraverse(TreeNode root){
        if (root == null)
            return;
        LinkedList<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()){
            TreeNode node = queue.poll();
            System.out.println(node.val+" ");
            if (node.left!= null){
                queue.offer(node.left);
            }
            if (node.right != null){
                queue.offer(node.right);
            }
        }
    }
}
