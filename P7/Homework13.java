package P7;

public class Homework13 {
    public static void main(String[] args) {
        new PassObject().printAreas(new CircLE2(),10);

    }
}
class CircLE2 {
    private double radius;
    public double findArea(){
        return Math.PI*radius*radius;
    }
    public void setRadius(double radius){
        this.radius=radius;
    }
    public double getRadius(){
        return this.radius;
    }
}
class PassObject{
    public void printAreas(CircLE2 c, int times){
        System.out.println("Radius\tArea");
        for(int i=1;i<=times;i++){
            c.setRadius(i);
            System.out.println(c.getRadius()+"\t"+c.findArea());

        }
    }
}
