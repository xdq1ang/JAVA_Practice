package src.P8;

public class ExtendsTheory {
    public static void main(String[] args) {
        Son son = new Son();
        //按照查找关系返回信息
        //（1）先看子类是否有此属性且可以访问，则返回
        //（2）如果子类没有，则看看父类有没有这个属性（如果父类有，且可以访问，就返回信息）
        //（2）...
        System.out.println(son.getHobby());
        //如果没有权限访问，可以通过公有的方法访问。

    }
}
class GrandPa{
    String name="大头爷爷";
    private String hobby="旅游";
    public String getHobby(){
        return this.hobby;
    }
}
class Father extends GrandPa{
    String name = "大头爸爸";
    int age = 39;
}
class Son extends Father{
    String name = "大头儿子";
}

