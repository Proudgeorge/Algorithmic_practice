package IO;

import javax.xml.crypto.Data;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author simba@onlying.cn
 * @date 2019/9/10 16:47
 */
public class A2 {
    public static void main(String[] args) {
        A2 a2 = new A2();
        //电脑d盘中的abc.txt文档
        String filepath = "F:/JavaWorkspace3/Algorithmic_practice/src/IO/abc.txt";
        //要写入的内容
        String temp_str ="";
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss aa");
        temp_str = sdf.format(date);
        String content = "今天是"+temp_str+",天气很好！！";
        a2.writeFile(filepath,content);


    }
    public void writeFile(String filePath,String content){
        FileOutputStream fos = null;
        try {
            //1.根据文件路径创建输出流
            fos = new FileOutputStream(filePath);
            //2.把string转换为byte数组
            byte[] array = content.getBytes();
            //3.把byte数组输出
            fos.write(array);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (fos == null){
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
