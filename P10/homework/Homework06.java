package src.P10.homework;

public class Homework06 {
    public static void main(String[] args) {
        Person person0= new Person("唐僧", "大河");
        Person person1 = new Person("唐僧", "一般");
        System.out.println(person1);
        person0.vehicles.work();
        person1.vehicles.work();
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
    public static Boat getBoat(){
        return new Boat();
    }
}

class Person{
    private String name;
    Vehicles vehicles;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", vehicles=" + vehicles +
                '}';
    }

    public Person(String name, String road) {
        this.name = name;
        if(road.equals("大河")){
            this.vehicles=Util.getBoat();
        }else{
            this.vehicles = Util.getHorse();
        }

    }
}