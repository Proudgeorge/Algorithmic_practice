package Point_to_offer.question31to40;

import java.util.HashMap;

/**
 * @author simba@onlying.cn
 * @date 2019/7/25 22:48
 */
public class Question40 {
    //num1,num2分别为长度为1的数组。传出参数
    //将num1[0],num2[0]设置为返回结果
    public void FindNumsAppearOnce1(int [] array,int num1[] , int num2[]) {
        HashMap<Integer,Integer> temp = new HashMap<Integer, Integer>();
        for (int i=0;i<array.length;i++){
            if (temp.containsKey(array[i]))
                temp.remove(array[i]);
            else
                temp.put(array[i],1);
        }
        int[] a = new int[array.length];
        int i = 0;
        for (Integer k:temp.keySet()){
            a[i] = k;
            i++;
        }
        num1[0] = a[0];
        num1[0] = a[1];
    }


    public void FindNumsAppearOnce2(int [] array,int num1[] , int num2[]) {
        /**
         *如果数组中只一个数字是只出现一次的，其他数字都是成双成对出现的，那么我们从头到尾依次异或数组
         *中的每个数字，最终的结果刚好就是那个只出现一次的数字，因为那些成对出现两次的数字全部在异或中抵消了
         */
        num1[0] = 0;
        num2[0] = 0;
        if (array.length == 0){
            return;
        }
        int num = 0;
        for (int i=0;i<array.length;i++){
            num ^= array[i];
        }
        int index = 0;
        while ((num&1)==0&&index < 8){
            num = num >> 1;
            index ++;
        }
        for (int i=0;i<array.length;i++){
            if (isa1(array[i],index))
                num1[0] ^= array[i];
            else
                num2[0] ^= array[i];
        }
    }
    public boolean isa1(int i,int index){
        i = i >> index;
        return (i&1)==1;
    }
}
