import java.io.File;

/**找到一个文件夹下面所以文件，包括子文件夹
 * @author simba@onlying.cn
 * @date 2019/9/14 0:31
 */
public class FindFiles {
    public static void main(String[] args) {
        //取得目标目录
        File file = new File("D:");
        //获取目标目录下子文件及其子文件夹
        File[] files = file.listFiles();
        readfile(files);
    }
    public static void readfile(File[] files){
        if (files ==null){//如果目录为空，直接退出
            return;
        }
        for (File f:files){
            //如果是文件，直接输出名字
            if (f.isFile()){
                System.out.println(f.getName());
            //如果是文件夹，递归调用
            }else if (f.isDirectory()){
                readfile(f.listFiles());
            }
        }
    }
}
