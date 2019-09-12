package designMoudle.factory;

/**工厂模式
 * @author simba@onlying.cn
 * @date 2019/9/11 23:26
 */
public class Factory {
    //创建相应的产品 根据产品类型
    public Sender produceSender(String senderType){
        if (senderType==null){
            return null;
        }else if (senderType.equals("sms")){
            return new SMSSender();
        }else if (senderType.equals("email")){
            return new EmailSender();
        }else {
            System.out.println("invaild senderType...");
            return null;
        }
    }
}
//具体的Emai产品 实现统一的产品接口
class EmailSender implements Sender{
    @Override
    public void send() {
        System.out.println("sending a email...");
    }
}
//具体的SMS产品类 实现统一的产品接口
class SMSSender implements Sender{

    @Override
    public void send() {
        System.out.println("sending a sms...");
    }
}
