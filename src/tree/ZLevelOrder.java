package tree;

import Point_to_offer.question1to10.TreeNode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**Z字型层次遍历
 * @author simba@onlying.cn
 * @date 2019/9/14 0:39
 */
public class ZLevelOrder {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root){
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        LinkedList<TreeNode> linkedList = new LinkedList<>();
        boolean flag = true;
        if (root ==null){
            return res;
        }
        linkedList.add(root);
        while (linkedList.size()!=0){
            flag = !flag;
            int size = linkedList.size();
            List<Integer> list = new ArrayList<Integer>();
            for (int i=0;i<size;i++){
                TreeNode temp = linkedList.remove();
                list.add(temp.val);
                if (temp.left != null)
                    linkedList.add(temp.left);
                if (temp.right!= null)
                    linkedList.add(temp.right);
            }
            if (flag){
                Collections.reverse(list);
            }
            res.add(list);
        }
        return res;
    }
}
