package src.P9.finial;

public class FinalExercise01 {
    public static void main(String[] args) {
        System.out.println(new Circle(2).getArea());

    }
}

class Circle{
    private final double r;
    private final double PI = 3.14;

    public Circle(double r) {
        this.r = r;
    }

    public double getArea(){
        return PI*r*r;
    }
}