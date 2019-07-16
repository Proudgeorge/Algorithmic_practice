package Point_to_offer.question11to20;

import java.util.ArrayList;

/**
 * 输入一个矩阵，按照从外向里以顺时针的顺序依次打印出每一个数字，
 * 例如，如果输入如下矩阵： 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16
 * 则依次打印出数字1,2,3,4,8,12,16,15,14,13,9,5,6,7,11,10.
 * @author simba@onlying.cn
 * @date 2019/7/11 11:30
 */
public class Question20 {
    public ArrayList<Integer> printMatrix(int [][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        ArrayList<Integer> list = new ArrayList<>();
        //输入的二维数组非法，返回空数组
        if (row==0||col==0)
            return list;
        //定义四个关键变量，表示左上和右下的打印范围
        int left = 0,top = 0,right= col-1,bottom = row-1;
        while (left <= right&&top<=bottom){
            //left to right
            for (int i= left;i<=right;i++)
                list.add(matrix[top][i]);

            //top to bottom
            for(int i=top+1;i<=bottom;i++)
                list.add(matrix[i][right]);
            //right to left
            if (top != bottom){
                //防止单行情况
                for (int i=right-1;i>=left;i--)
                    list.add(matrix[bottom][i]);
            }
            //bottom to top
            if (left != right){
                //防止单列情况
                for (int i=bottom-1;i>top;i--)
                    list.add(matrix[i][left]);
            }
            left++;right--;top++;bottom--;
        }
        return list;
    }
}
