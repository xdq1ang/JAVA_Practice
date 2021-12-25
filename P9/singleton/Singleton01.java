package src.P9.singleton;

public class Singleton01 {
    public static void main(String[] args) {
        GirlFriend gf1 = GirlFriend.getInstance();
        gf1.setName("CL");
        System.out.println(gf1.getName());
        GirlFriend gf2 = GirlFriend.getInstance();
        gf2.setName("XC");
        System.out.println(gf2.getName());
        System.out.println(gf1.getName());
        System.out.println(gf1.equals(gf2));
        //操作的始终是这一个实例
    }

}

/*
* 饿汉式单例模式
* 1.构造器私有化
* 2.在类的内部直接创建静态实例
* 3.提供一个静态方法返回这个静态实例
*
* 注意：操作的始终是这一个实例
*
* */
class GirlFriend{
    private String name;
    private static GirlFriend gf = new GirlFriend("xiao hong");
    private GirlFriend(String name){
        this.name = name;
    }
    public static GirlFriend getInstance(){
        return gf;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static GirlFriend getGf() {
        return gf;
    }

    public static void setGf(GirlFriend gf) {
        GirlFriend.gf = gf;
    }
}




