package tree;

import Point_to_offer.question1to10.TreeNode;
import jdk.nashorn.internal.objects.NativeUint8Array;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author simba@onlying.cn
 * @date 2019/8/24 22:30
 */
public class LevelOrder {
    public List<List<Integer>> levelOrder(TreeNode root){
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        LinkedList<TreeNode> queue = new LinkedList<TreeNode>();
        if (root == null){
            return res;
        }
        queue.offer(root);
        while (queue.size() != 0){
            List<Integer> list = new ArrayList<Integer>();
            int size = queue.size();
            for (int i=0;i<size;i++){
                TreeNode temp = queue.poll();
                list.add(temp.val);
                if (temp.left != null){
                    queue.offer(temp.left);
                }
                if (temp.right != null){
                    queue.offer(temp.right);
                }
            }
            res.add(list);
        }
        return res;
    }
}
