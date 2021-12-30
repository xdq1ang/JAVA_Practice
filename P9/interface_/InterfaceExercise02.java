package src.P9.interface_;


interface A1{
    int x = 0;//public static final
}
class B1{
    int x = 1;
}
public class InterfaceExercise02 extends B1 implements A1{
    public void pX(){
        System.out.println(A1.x);//这里应该指明具体是谁的x
        System.out.println(super.x);//这里应该指明具体是谁的x
    }

    public static void main(String[] args) {
        new InterfaceExercise02().pX();
    }
}
