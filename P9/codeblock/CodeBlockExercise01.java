package src.P9.codeblock;

public class CodeBlockExercise01 {
    public static void main(String[] args) {
        System.out.println("total = "+Person.total);
        System.out.println("total = "+Person.total);

    }
}
class Person{
    public static int total;
    static{
        total = 100;
        System.out.println("in static block!");
    }
}


// in static block!   静态代码块和静态属性初始化只会在类加载时调用。只会调用一次
// total = 100
// total = 100