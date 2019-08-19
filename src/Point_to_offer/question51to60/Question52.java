package Point_to_offer.question51to60;

/**
 * @author simba@onlying.cn
 * @date 2019/8/8 23:09
 */
public class Question52 {
    public int[] multiply(int[] A) {
        if (A.length <= 1)
            return A;
        int[] B = new int[A.length];
        B[0] = 1;
        for (int i=1;i<A.length;i++){
            B[i] = B[i-1]*A[i-1];
        }
        int temp = 1;
        for (int j = A.length-2;j>=0;j--){
            temp *= A[j+1];
            B[j] *= temp;
        }
        return B;
    }
}
