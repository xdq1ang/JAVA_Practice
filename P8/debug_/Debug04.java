package src.P8.debug_;

public class Debug04 {
    public static void main(String[] args) {
        Person jack = new Person("jack",20);
        System.out.println(jack);

    }
}
class Person{
    private final String name;
    private final int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
