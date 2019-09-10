import com.sun.org.apache.xpath.internal.functions.FuncFalse;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.*;

/**
 * @author simba@onlying.cn
 * @date 2019/6/8 0:25
 */
public class GreekTimeTest1 {
    @Test
    public void demo1() {
        HashMap<Integer, Integer> hashMap = new LinkedHashMap<>();
        hashMap.put(3, 11);
        hashMap.put(1, 12);
        hashMap.put(5, 23);
        hashMap.put(2, 22);
        for (Map.Entry e : hashMap.entrySet()) {
            System.out.println(e.getKey());
        }

    }

    @Test
    public void demo2() {
        HashMap<Integer, Integer> hashMap = new LinkedHashMap<>(10, 0.75f, true);
        hashMap.put(3, 11);
        hashMap.put(1, 12);
        hashMap.put(5, 23);
        hashMap.put(2, 22);

        hashMap.put(3, 26);
        hashMap.get(5);
        for (Map.Entry e : hashMap.entrySet()) {
            System.out.println(e.getKey());
        }

    }

    @Test
    public void demo3() {
        HashMap<String, ArrayList<String>> hashMap = new LinkedHashMap<>(10, 0.75f, true);

        ArrayList<String> arrayList1 = new ArrayList<String>();
        ArrayList<String> arrayList2 = new ArrayList<String>();
        ArrayList<String> arrayList3 = new ArrayList<String>();

        arrayList1.add("1");
        arrayList1.add("2");
        arrayList1.add("3");

        arrayList2.add("1");
        arrayList2.add("2");
        arrayList2.add("3");

        arrayList3.add("1");
        arrayList3.add("2");
        arrayList3.add("3");



        hashMap.put("A", arrayList1);
        hashMap.put("B", arrayList2);
        hashMap.put("C", arrayList3);
        arrayList3.add("7");
        hashMap.put("C",arrayList3);

        for (Map.Entry e : hashMap.entrySet()) {
            System.out.println(e.getKey() + ":" + e.getValue());
        }

    }
    @Test
    public void demo4(){
        HashMap<String,Integer> hashMap = new LinkedHashMap<>();
        hashMap.put("和玲玲",11);
        hashMap.put("米健腾",22);
        for (Map.Entry e:hashMap.entrySet()){
            System.out.println(e.getKey()+":"+e.getValue());
        }
    }
}
        /*
         *
         * */
    /*@Test
    public  String getMD5(String plainTest){
        //定义一个字节数组
        byte[] secreBytes = null;

        try {
            //生成一个MD5加密计算摘要
            MessageDigest md = MessageDigest.getInstance("MD5");
            //对字符串进行加密
            md.update(plainTest.getBytes());
            //获得加密后的数据
            secreBytes = md.digest();
        }catch (NoSuchAlgorithmException e){
            throw new RuntimeException("没有MD5这个算法");
        }
        //将加密后的数字转换为16进制数字
        String md5code = new BigInteger(1,secreBytes).toString(16);//16进制数字
        //如果生成数字为满32位，需要前面补0
        for (int i = 0; i <32-md5code.length() ; i++) {
            md5code = "0"+md5code;
        }
        return md5code;
    }*/


//    public static void main(String[] args) {
////        System.out.println(getMD5("123"));
//
//        HashMap<String,List<String>> hashMap = new LinkedHashMap<>(10,0.75f,true);
//        List<String>  list1 = new ArrayList<String>();
//
//        File file = new File("F:\\JavaWorkspace3\\Algorithmic_practice\\src\\xx.txt");
//        BufferedReader reader = null;
//        String flag1 = null;
//        try{
//            System.out.println("以行为单位读取文件内容，一次读一整行：");
//            reader = new BufferedReader(new FileReader(file));
//            String tempstring = null;
//            int line = 1;
//            // 一次读入一行，直到读入null为文件结束
//            while ( (tempstring = reader.readLine())!= null){
//                //显示行号
//                System.out.println("line " + line + ": " + tempstring);
//                String[] strings = tempstring.split(":|,");
//                if (flag1 != strings[0]){
//                    list1.clear();
//                    list1.add(strings[1]);
//                    flag1 = strings[0];
////                    hashMap.put(flag1,list1);
//                }
//                else{
//
//                    list1.add(strings[1]);
//                    hashMap.put(flag1,list1);
////                    list1.clear();
//                }
//                line++;
//            }
//            reader.close();
//        }catch (IOException e){
//            e.printStackTrace();
//        }finally {
//            if (reader != null){
//                try {
//                    reader.close();
//                }catch (IOException e1){
//                }
//            }
//        }
//        for (Map.Entry e: hashMap.entrySet()) {
//            System.out.println(e.getKey());
//            System.out.println(e.getValue());
//        }
//    }
//}
