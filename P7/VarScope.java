package src.P7;

public class VarScope {
    public static void main(String[] args) {
        new Person().say();
    }
}
class Person{
    //属性和方法的变量可以重名，访问时就近访问
    String name="jack";
    public void say(){
        String name = "king";
        System.out.println(name);
    }
}