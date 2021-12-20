package src.P8.homework09;

public class Homework09 {
    public static void main(String[] args) {
        Point point = new Point(1929,230.07);
        LabeledPoint labeledPoint = new LabeledPoint("Black Thursday",1929,230.07);
        System.out.println(labeledPoint.getLabel());

    }
}

class Point{
    double x;
    double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
}

class LabeledPoint extends Point{
    String label;
    public LabeledPoint(String label ,double x, double y) {
        super(x, y);
        this.label = label;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }
}