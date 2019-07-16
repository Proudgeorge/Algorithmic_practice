package question_conclude;

import org.junit.Test;

/**
 快速找出一个数组中的最大数、第二大数
 */
public class Question1 {

    /**
     * @author simba@onlying.cn
     * @date 2019/7/6 23:36
     * @return
     */
    int Arr[] = {12,43,55,22,11,7,8,5};

    public int[] GetSecondMaxNumber(int[] arr, int n){
        int i,max,second_max;
        max = arr[0];
        second_max = 0x80000000;
        for (i=1;i<n;++i){
            if (arr[1]>max){
                second_max = max;
                max = arr[i];
            }else {
               if (arr[i]>second_max){
                   second_max = arr[i];
               }
            }

        }
        return arr;
    }

//    void Arrange(int arr[],int n){
//        int i,k=n-1;
//
//    }

}
