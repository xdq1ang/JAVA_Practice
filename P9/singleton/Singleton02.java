package src.P9.singleton;

public class Singleton02 {
    public static void main(String[] args) {
        GirlFriend2.getInstance();
        GirlFriend2.getInstance();

    }
}

class GirlFriend2{
    private String name;
    private static GirlFriend2 gf;
    private GirlFriend2(){

    }
    public static GirlFriend2 getInstance(){
        if(gf==null){
            System.out.println("创建实例");
            gf = new GirlFriend2();}
        return gf;
    }
}

/*
* 懒汉式：
* 1.构造函数私有化
* 2.在类内部提供公有方法进行实例申请（如果已经创建过则不在重复实例化）
*
*
* */