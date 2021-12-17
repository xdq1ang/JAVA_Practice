package src.P8.equalsoverride;

public class Person {
    private String name;
    private int age;
    private char gender;
    public Person(String name,int age,char gender){
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    @Override
    public boolean equals(Object obj) {
        if(((Person)obj).name.equals(this.name) && ((Person)obj).age==this.age && ((Person)obj).gender == this.gender){
            return true;
        }else{
            return false;
        }
    }
}
