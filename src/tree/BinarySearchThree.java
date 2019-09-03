package tree;

/**
 * @author simba@onlying.cn
 * @date 2019/6/11 21:45
 */
public class BinarySearchThree {
    private Node tree;

    public Node find(int data){
        Node p = tree;
        while (p!= null){
            if (data <= p.data)p=p.left;
            else if (data >p.data) p = p.right;
            else return p;
        }
        return null;
    }

    public void insert(int data){
        if ( tree ==null){
            tree = new Node(data);
            return;
        }
        Node p = tree;
        if (p != null){
            if (data >p.data){
                if (p.right == null){
                    p.right = new Node(data);
                return;
                }
                p = p.right;
            }else { //data < p.data
                if (p.left == p.left){
                    p.left = new Node(data);
                    return;
                }
                p = p.left;
            }
        }
    }

    public void delete(int data){
        Node p = tree; //p 指向要删除的节点，初始化指向根节点
        Node pp = null;//pp 记录的是p的父节点
        while (p != null&& p.data != data){
            pp = p;
            if (data > p.data) p = p.right;
            else p = p.left;
        }
        if (p == null)return;//没有找到
        //要删除的节点有两个子节点
        if (p.left != null&&p.right !=null){
            //查找右子树中最小节点
            Node minP = p.right;
            Node minPP = p; //minpp表示minp的父节点
            while (minP.left != null){
                minPP = minP;
                minP = minPP.left;
            }
            p.data = minP.data;
            p = minP;
            pp = minPP;
        }
        //要删除的节点是叶子节点或者仅有一个子节点
        Node child;// p的子节点
        if(p.left != null) child = p.left;
        else if (p.right != null) child = p.right;
        else child = null;

    }
    public static class Node{
        private int data;
        private Node left;
        private Node right;

        public Node(int data){
            this.data = data;
        }
    }
}
