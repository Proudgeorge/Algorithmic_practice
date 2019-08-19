package Point_to_offer.question51to60;

/**
 * @author simba@onlying.cn
 * @date 2019/8/8 22:44
 */
public class Question51 {
    /**
     * 因为数组中的数字都在0~n-1的范围内，所以，如果数组中没有重复的数，那当数组排序后，数字i将出现
     * 在下标为i的位置。现在我们重排这个数组，从头到尾扫描每个数字，当扫描到下标为i的数字时，首先比
     * 较这个数字(记为m)是不是等于i。如果是，则接着扫描下一个数字；如果不是，则再拿它和m 位置上的数
     * 字进行比较，如果它们相等，就找到了一个重复的数字（该数字在下标为i和m的位置都出现了），返回true；
     * 如果它和m位置上的数字不相等，就把第i个数字和第m个数字交换，把m放到属于它的位置。接下来再继续循环，
     * 直到最后还没找到认为没找到重复元素，返回false。
     * @param numbers
     * @param length
     * @param duplication
     * @return
     */
    // Parameters:
    //    numbers:     an array of integers
    //    length:      the length of array numbers
    //    duplication: (Output) the duplicated number in the array number,length of duplication array is 1,so using duplication[0] = ? in implementation;
    //                  Here duplication like pointor in C/C++, duplication[0] equal *duplication in C/C++
    //    这里要特别注意~返回任意重复的一个，赋值duplication[0]
    // Return value:       true if the input is valid, and there are some duplications in the array number
    //                     otherwise false
    public boolean duplicate(int numbers[],int length,int [] duplication) {
        if (length == 0)
            return false;
        for (int i=0;i<length;i++){
            while (i != numbers[i]){
                if (numbers[i]==numbers[numbers[i]]){
                    duplication[0] = numbers[i];
                    return true;
                }else {
                    int temp = numbers[numbers[i]];
                    numbers[numbers[i]] = numbers[i];
                    numbers[i] = temp;
                }
            }
        }
        return false;
    }
}
