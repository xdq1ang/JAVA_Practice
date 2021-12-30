package src.P9.interface_;

public class InterfaceExercise01 {
    public static void main(String[] args) {
        ClassB classB = new ClassB();
        System.out.println(classB.a);
        System.out.println(IfA.a);
        System.out.println(ClassB.a);


    }
}

interface IfA{
    int a = 23; //public static final
}
class ClassB implements IfA{

}