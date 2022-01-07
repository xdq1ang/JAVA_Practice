package src.P12.homework;

/*
 *   @author : xdqiang
 */
public class Homework02 {
    public static void main(String[] args) {
        try{
            Account xdqiang = new Account("xdq", "123455", "125@qq.com");
            System.out.println("注册成功");
            System.out.println(xdqiang.toString());
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}

class Account{
    private String name;
    private String password;
    private String email;

    public Account(String name, String password, String email) throws Exception{
        nameCheck(name) ;
        passwordCheck(password);
        emailCheck(email);
        this.name = name;
        this.password = password;
        this.email = email;

    }
    private void nameCheck(String name) throws Exception{
        if(!(name!=null && name.length() >= 2 && name.length()<=4)){
            throw new Exception("用户名格式不正确（用户名长度2-4）");
        }
    }

    private void passwordCheck(String password) throws Exception{
        char[] chr = password.toCharArray();
        //位数判断
        if(chr.length!=6){
            throw new Exception("密码必须是6位数");
        }
        //必须是数值
        for (char c:
             chr) {
            if(!(c>='0' && c<='9')){
                throw new Exception("密码必须为数字组成");
            }
        }
    }
    private  void emailCheck(String email) throws Exception{
        int index1=email.indexOf("@");
        int index2=email.indexOf(".");
        if(!(email!=null && index1!=-1 && index2!=-1 && index2>index1)){
            throw new Exception("邮箱格式错误");
        }
    }

    @Override
    public String toString() {
        return "Account{" +
                "name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
