package Point_to_offer.question31to40;

/**
 * HZ偶尔会拿些专业问题来忽悠那些非计算机专业的同学。今天测试组开完会后,他又发话了:在古老的一维
 * 模式识别中,常常需要计算连续子向量的最大和,当向量全为正数的时候,问题很好解决。但是,如果向量中
 * 包含负数,是否应该包含某个负数,并期望旁边的正数会弥补它呢？例如:{6,-3,-2,7,-15,1,2,2},连
 * 续子向量的最大和为8(从第0个开始,到第3个为止)。你会不会被他忽悠住？(子向量的长度至少是1)
 * @author simba@onlying.cn
 * @date 2019/7/21 14:23
 */
public class Question31 {
    public int FindGreatestSumOfSubArray(int[] array) {
        if (array.length == 0)
            return 0;
        int cur = array[0],max = array[0];
        for (int i=1;i<array.length;i++){
            cur = cur>0?cur +array[i]:array[i];
            if (max <cur)
                max = cur;
        }
        return max;
    }
}
