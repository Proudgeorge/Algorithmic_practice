package Point_to_offer.question21to30;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * 数组中有一个数字出现的次数超过数组长度的一半，请找出这个数字
 * @author simba@onlying.cn
 * @date 2019/7/20 17:10
 */
public class Question29 {
    /**
     * 法1：借助hashmap存储数组中每个数出现的次数，最后看是否有数字出现次数超过数组长度的一半；
     * 法2：排序。数组排序后，如果某个数字出现次数超过数组的长度的一半，则一定会数组中间的位置。
     * 所以我们取出排序后中间位置的数，统计一下它的出现次数是否大于数组长度的一半；
     * 法3：某个数字出现的次数大于数组长度的一半，意思就是它出现的次数比其他所有数字出现的次数和还要多。
     * 因此我们可以在遍历数组的时候记录两个值：1. 数组中的数字;2. 次数。遍历下一个数字时，若它与之前
     * 保存的数字相同，则次数加1，否则次数减1；若次数为0，则保存下一个数字，并将次数置为1。遍历结束后，
     * 所保存的数字即为所求。最后再判断它是否符合条件。
     * @param array
     * @return
     */
    public int MoreThanHalfNum_Solution1(int [] array) {
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        int length = array.length;
        for (int i=0;i<length;i++){
            if (!map.containsKey(array[i]))
                map.put(array[i],1);
            else
                map.put(array[i],map.get(array[i])+1);
        }
        for (Map.Entry<Integer,Integer> entry:map.entrySet()){
            if (entry.getValue()*2 >length)
                return entry.getKey();
        }
        return 0;
    }
    public int MoreThanHalfNum_Solution2(int [] array) {
        Arrays.sort(array);
        int half = array.length/2;
        int count = 0;
        for (int i =0;i<array.length;i++) {
            if (array[i] == array[half])
                count++;
        }
        if (count > half)
            return array[half];
        else
            return 0;
        }
    public int MoreThanHalfNum_Solution3(int [] array) {
        int res = array[0],count = 1;
        for (int i=1;i<array.length;i++){
            if (array[i] == res)
                count++;
            else
                count--;
            if (count == 0){
                res = array[i];
            }
        }
        count = 0;
        for (int i=0;i<array.length;i++){
            if (array[i] == count)
                count++;
        }
        return count > array.length/2?res:0;
    }

}
