package src.P9.staticpractice;

public class StaticExercise02 {
    public static void main(String[] args) {
        System.out.println("Number of total is "+Person.getTotalPerson());//id=1,total=0
        Person p1 = new Person();//id=1  total=1
        System.out.println("Number of total is "+Person.getTotalPerson());//id=2 total=1

    }
}
class Person{
    private static int id;
    private static int total = 0;
    public static int getTotalPerson(){
        id++;
        return total;
    }
    public Person(){
        total++;
        id = total;
    }
}
