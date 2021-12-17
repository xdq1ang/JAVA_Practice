package src.P8;


public class Account {
    private String name="";
    private double money=0;
    private String passWord="111111";

    public Account(String name, double money, String passWord) {
        setName(name);
        setMoney(money);
        setPassWord(passWord);
    }
    public void showInfo(){
        System.out.println("name :"+getName());
        System.out.println("money :"+getMoney());
        System.out.println("password :"+getPassWord());

    }

    public void setName(String name){
        if(name.length()>=2 && name.length()<=4){
            this.name = name;
        }else{
            System.out.println("输入的姓名长度必须在2-3");
        }
    }
    public void setMoney(double money){
        if(money>20){
            this.money=money;
        }else{
            System.out.println("余额必须大于20");
        }
    }
    public void setPassWord(String passWord){
        if(passWord.length()==6){
            this.passWord=passWord;
        }else{
            System.out.println("密码长度必须是6位");
        }
    }

    public String getName() {
        return name;
    }

    public double getMoney() {
        return money;
    }

    public String getPassWord() {
        return passWord;
    }
}
