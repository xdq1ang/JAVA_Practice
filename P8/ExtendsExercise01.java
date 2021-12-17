package src.P8;

public class ExtendsExercise01 {
    public static void main(String[] args) {
        B b = new B();
        // a
        // b name
        // b
    }
}
class A{
    A(){
        System.out.println("a");
    }
    A(String name){
        System.out.println("a name");
    }
}
class B extends A{
    B(){
        this("abc");//含有this就没有super了
        System.out.println("b");
    }
    B(String name){
        System.out.println("b name");//子类会默认调用父类的无参构造器super()
    }
}