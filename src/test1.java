import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;

/**
 * @author simba@onlying.cn
 * @date 2019/6/23 19:31
 */
public class test1 {
    public static void main(String[] args) {
        File file = new File("F:\\JavaWorkspace3\\Algorithmic_practice\\src\\result\\Result1_10050.txt");
        BufferedReader reader = null;
        String flag1 = null;
        try{
            System.out.println("以行为单位读取文件内容，一次读一整行：");
            reader = new BufferedReader(new FileReader(file));
            String tempstring = null;
            int line = 1;
            int i=0;

            // 数组大小
            int size = 10;
            // 定义数组
            int[] myList1 = new int[30];

            int[] f1 = new int[size];
            int[] f2 = new int[size];
            int[] f3 = new int[size];
            double[] F= new double[size];

            // 一次读入一行，直到读入null为文件结束
            while ( (tempstring = reader.readLine())!= null){
                //显示行号
                System.out.println("line " + line + ": " + tempstring);
                myList1[i]=Integer.parseInt(tempstring);
//                String[] strings = tempstring.split(":|,");
                i++;
                line++;
            }
            for (int j=0;j<10;j++){
                f1[j]=myList1[j*3+0];
                f2[j]=myList1[j*3+1];
                f3[j]=myList1[j*3+2];

                //System.out.println(0.5*f1[j]+0.3*f2[j]+0.2*f3[j]);
            }
//                int f1min = Arrays.stream(f1).min().getAsInt();
                int min1 = Arrays.stream(f1).min().getAsInt();
                int max1 = Arrays.stream(f1).max().getAsInt();
                int min2 = Arrays.stream(f2).min().getAsInt();
                int max2 = Arrays.stream(f2).max().getAsInt();
                int min3 = Arrays.stream(f3).min().getAsInt();
                int max3 = Arrays.stream(f3).max().getAsInt();
                System.out.println(max1+":"+min1);
            System.out.println("===============");

//                min2 = Collections.min(Arrays.asList(ArrayUtils.toObject(f1)));
//                System.out.println(min2);
//
//                Arrays.sort(f1);
//                System.out.println(f1[0]);
//            System.out.println(max1+":"+f1min+"=="+f2max+":"+f2min+"=="+f3max+":"+f3min);
            for (int j=0;j<size;j++){
//                System.out.println(item);
                 F[j] = 0.5* (f1[j]-min1)/(max1-min1)+0.3*(f2[j]-min2)/(max2-min2)+0.2*(f3[j]-min3)/(max3-min3);
                System.out.println((j+1)+":"+F[j]);
            }
            System.out.println("===============");
            System.out.println(minV(F));
//            int f1min = Arrays.stream(f1).min().getAsInt();
//            int f2min = Arrays.stream(f2).min().getAsInt();
//            int f3min = Arrays.stream(f3).min().getAsInt();
//            System.out.println(f1min+":"+f2min+":"+f3min);
//            System.out.println(minV(f1));










            reader.close();
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            if (reader != null){
                try {
                    reader.close();
                }catch (IOException e1){
                }
            }
        }


    }



    private static int minV(double[] array){
        double min=array[0];//默认第一个最小
        for(int i=0;i<array.length;i++)
        {
            if(array[i]<min)
            {
                min=array[i];//如果有比min小的数就让min记录下小的数
            }
        }
//        System.out.println("min="+min);
        return (int) min;
    }
}
