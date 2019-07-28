package Point_to_offer.question21to30;

import javax.imageio.metadata.IIOMetadataNode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * 输入n个整数，找出其中最小的K个数。
 * @author simba@onlying.cn
 * @date 2019/7/20 20:38
 */
public class Question30 {
    public ArrayList<Integer> GetLeastNumbers_Solution1(int[] input,int k){
        ArrayList<Integer> res = new ArrayList<Integer>();
        if (input == null||k ==0||k>input.length)
            return res;
        Arrays.sort(input);
        for (int i=0;i<k;i++)
            res.add(input[i]);

        return res;
    }

    public ArrayList<Integer> GetLeastNumbers_Solution2(int[] input,int k){
        ArrayList<Integer> res = new ArrayList<>();
        if (input == null||k==0||k>input.length)
            return res;
        PriorityQueue<Integer> maxHeap = new PriorityQueue<Integer>(k, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        });
        for (int i=0;i<input.length;i++){
            if (maxHeap.size() != k)
                maxHeap.offer(input[i]);
            else{
                if (maxHeap.peek() > input[i]){
                    maxHeap.poll();
                    maxHeap.offer(input[i]);
                }
            }
        }
        for (Integer i:maxHeap){
            res.add(i);
        }
        return res;
    }
}
