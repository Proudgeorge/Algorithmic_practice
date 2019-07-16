package question_conclude;

/**
 * JAVA经典算法面试40题及答案
 * https://blog.csdn.net/tang_MrTang/article/details/80788121
 * @author simba@onlying.cn
 * @date 2019/7/7 0:18
 */
public class Question2 {
    public static void main(String[] args) {
        int i=0;
        math mymath = new math();
        for(i=100;i<=999;i++){
            if (mymath.isshuixianhua(i)==true)
            System.out.println(i);

        }
    }
}
class math{
    /**
     * 兔子繁殖递归问题
     * @param x
     * @return
     */
    public int f(int x){
        if (x==1 ||x==2)
            return 1;
        else
            return f(x-1)+f(x-2);
    }
    public boolean issushu(int x)
    {
        for(int i=2;i<=x/2;i++)
            if (x % i==0 )
                return false;
        return true;
    }
    public boolean isshuixianhua(int x){
        int i=0,j=0,k=0;
        i = x/100;
        j = (x%100)/10;
        k = x%10;
        if (x == i*i*i+j*j*j+k*k*k)
            return true;
        else
            return false;
    }
}
