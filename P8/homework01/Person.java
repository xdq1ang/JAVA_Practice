package src.P8.homework01;

public class Person {
    String name;
    int age;
    String job;

    public Person(String name, int age, String job) {
        this.name = name;
        this.age = age;
        this.job = job;
    }

    @Override
    public String toString() {
        return "name:"+name+"\tage:"+age+"\tjob:"+job;
    }
}

