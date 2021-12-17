package src.P8.equalsoverride;

public class Test {
    public static void main(String[] args) {
        Person p1 = new Person("xdqiang",20,'男');
        Person p2 = new Person("xdqiang",20,'男');
        System.out.println(p1.equals(p2));
    }
}
