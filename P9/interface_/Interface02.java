package src.P9.interface_;

public class Interface02 {
    public static void main(String[] args) {
        new A().hi();

    }
}
interface AInterface{
    int n1 = 10;
    //在接口中可以省略abstract关键词
    void hi();
    static void ok(){
        System.out.println("ok!");
    }
    default void ok1(){
        System.out.println("ok1!");
    }
}

class A implements AInterface{
    @Override
    public void hi(){
        System.out.println("hello java");
    }
}