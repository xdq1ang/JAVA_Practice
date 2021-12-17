package P7;

public class Homework05 {
    public static void main(String[] args){
        Circle c = new Circle(10);
        c.len();
        c.area();

    }
}
class Circle{
    double r;
    public Circle(double r){
        this.r=r;
    }
    public void len(){
        System.out.println(2*3.14*r);
    }
    public void area(){
        System.out.println(3.14*r*r);
    }
}
