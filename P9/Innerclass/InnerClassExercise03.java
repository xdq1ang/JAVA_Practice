package src.P9.Innerclass;

public class InnerClassExercise03 {
    public static void main(String[] args) {
        Test t = new Test();//5
        Test.Inner r = t.new Inner();
        System.out.println(r.a);//5


    }
}

class Test{
    public Test(){
        Inner s1 = new Inner();
        s1.a = 10;
        Inner s2 = new Inner();
        System.out.println(s2.a);
    }
    class Inner{
        public int a = 5;
    }
}
