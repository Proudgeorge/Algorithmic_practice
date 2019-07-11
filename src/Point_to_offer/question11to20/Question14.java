package Point_to_offer.question11to20;

/**
 * 输入一个整数数组，实现一个函数来调整该数组中数字的顺序，使得所有的奇数位于数组的前半部分，
 * 所有的偶数位于位于数组的后半部分，并保证奇数和奇数，偶数和偶数之间的相对位置不变
 * @author simba@onlying.cn
 * @date 2019/7/10 22:12
 */
public class Question14 {
    //解法1 移动偶数位置
    public void reOrderArray1(int[] array){
        if (array == null||array.length ==0){
            return;
        }
        for (int i= 1;i<array.length;i++){
            int j= i-1;
            if (array[i]%2!=0){
                while (j>=0){
                    if (array[j]%2!=0){
                        break;
                    }
                    if (array[j]%2==0){
                        int t = array[j+1];
                        array[j+1] =array[j];
                        array[j] = t;
                        j--;
                    }
                }
            }
        }
    }
    //解法2 有问题
    public void reOrderArray2(int[] array){
        for(int i= 0;i<array.length-1;i++){
            for(int j=0;j<array.length-1-i;j++){
                if(array[j]%2==0&&array[j+1]%2==1){
                    int t = array[j];
                    array[j]=array[j+1];
                    array[j+1]=t;
                }
            }
        }
    }
}
