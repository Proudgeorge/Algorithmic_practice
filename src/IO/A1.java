package IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @author simba@onlying.cn
 * @date 2019/9/10 16:27
 */
public class A1 {
    public static void main(String[] args) {
        A1 a1 = new A1();
        //从电脑d盘中的abc.txt文档
        String filePath = "F:/JavaWorkspace3/Algorithmic_practice/src/IO/abc.txt";
        String result = a1.readFile(filePath);
        System.out.println(result);
    }
    public String readFile(String filePath){
        FileInputStream fis = null;
        String result = "";
        try {
            //根据path路径实例化一个输入流对象
            fis = new FileInputStream(filePath);
            //2. 返回这个输入流中可以被读的剩下的bytes字节的估计值
            int size = fis.available();
            //3.根据输入流中的字节数创建byte数组
            byte[] array = new byte[size];
            //4.把数据读入到数组中
            fis.read(array);
            //5.根据获取到的数组Byte数组新建一个字符串，然后输出
            result = new String(array);
        } catch (FileNotFoundException e){
            e.printStackTrace();
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }finally {
            if (fis == null){
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return result;
    }
}
