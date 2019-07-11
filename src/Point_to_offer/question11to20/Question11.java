package Point_to_offer.question11to20;

/**
 * 给定一个double类型的浮点数base和int类型的整数exponent。
 * 求base的exponent次方。
 * @author simba@onlying.cn
 * @date 2019/7/9 0:17
 */
public class Question11 {
    public double Power(double base, int exponent) {
        double result = 0;
        if (base == 0){
            return 0;
        }
        if (exponent ==0){
            return 1;
        }
        if (exponent>0){
            result = mutiply(base,exponent);
        }else {
            result = mutiply(1/base,-exponent);
        }
        return result;
    }
    public double mutiply(double base, int exponent) {
        double sum = 1;
        for (int i=0;i<exponent;i++){
            sum = sum * base;
        }
        return sum;
    }
    /*
    精度校验
    * */
    public boolean equal(double a, int b) {
        if (a-b<0.000001&&a-b>-0.000001){
            return true;
        }
        return false;
    }
}
