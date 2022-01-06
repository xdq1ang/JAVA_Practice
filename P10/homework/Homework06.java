package src.P10.homework;

public class Homework06 {
    public static void main(String[] args) {
        Person person= new Person("唐僧");
        person.common();
        person.passRiver();
    }
}

interface Vehicles{
    //属性          public static final
    void work();// public abstract
}

class Horse implements Vehicles{

    @Override
    public void work() {
        System.out.println("Horse is working");
    }
}
class Boat implements Vehicles{

    @Override
    public void work() {
        System.out.println("Boat is working");
    }
}
class Util{
    public static Horse getHorse(){
        return new Horse();
    }
    public static Boat getBoat() { return new Boat(); }
}

class Person{
    private final String name;
    private Vehicles vehicles;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", vehicles=" + vehicles +
                '}';
    }

    public Person(String name) {
        this.name = name;
    }
    public void passRiver(){
        if(!(this.vehicles instanceof Boat)){
            this.vehicles=Util.getBoat();
        }
        this.vehicles.work();
    }
    public void common(){
        if(!(this.vehicles instanceof Horse)){
            this.vehicles=Util.getHorse();
        }
        this.vehicles.work();
    }
}