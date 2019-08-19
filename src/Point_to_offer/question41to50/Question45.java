package Point_to_offer.question41to50;

import java.util.LinkedList;

/**
 * 孩子们的游戏(圆圈中最后剩下的数)
 * @author simba@onlying.cn
 * @date 2019/8/7 15:52
 */
public class Question45 {
    /**
     * 用环形链表模拟圆圈。创建一个总共有 n 个结点的环形链表，然后每次在这个链表中删除第 m 个结点。
     * 注意，起步是-1 不是 0
     * @param n
     * @param m
     * @return
     */
    public int LastRemaining_Solution(int n, int m) {
        if (n<1||m<1)
            return -1;
        LinkedList<Integer> linkedList = new LinkedList<>();
        for (int i=0;i<n;i++){
            linkedList.add(i);
        }
        int index = -1;  //起步是-1，不是0
        while (linkedList.size() >1){
            index = (index+m)%linkedList.size(); //对linkedList长度求余不是对n
            linkedList.remove(index);
            index--;
        }
        return linkedList.get(0);
    }

    public static void main(String[] args) {
        System.out.println(5%9);
    }
}
