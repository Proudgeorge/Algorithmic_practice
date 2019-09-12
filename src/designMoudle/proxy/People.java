package designMoudle.proxy;

/**
 * @author simba@onlying.cn
 * @date 2019/9/12 8:55
 */
public class People implements BuyCar {
    private int cash;
    private String vip;
    private String username;

    @Override
    public void buycar() {
        System.out.println(username+" is vip so he/she can buy any car...");
    }

    public int getCash() {
        return cash;
    }

    public void setCash(int cash) {
        this.cash = cash;
    }

    public String getVip() {
        return vip;
    }

    public void setVip(String vip) {
        this.vip = vip;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
class ProxyBuyCar implements BuyCar{
    public People people;

    public People getPeople() {
        return people;
    }

    public void setPeople(People people) {
        this.people = people;
    }

    @Override
    public void buycar() {
        if (people.getVip().equals("vip")){
            people.buycar();
        }else if (people.getCash()>=50000){
            System.out.println(people.getUsername()+"buy a new car trade new over...");
        }else {
            System.out.println(people.getUsername()+"people cant't buy a car");
        }
    }
}
