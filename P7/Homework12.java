package P7;

public class Homework12 {
    public static void main(String[] args) {
        Employee e1 = new Employee("xdqiang","man",21,"boss",999999);
        Employee e2 = new Employee("xdqiang","man",21);
        Employee e3 = new Employee("boss",999999);


    }
}
class Employee{
    String name;
    String sex;
    int age;
    String pos;
    double salary;
    public Employee(String name,String sex,int age,String pos,double salary){
        this(name, sex, age);//构造器的调用应该放在第一行，只能调用一个构造器
        this.pos=pos;
        this.salary=salary;
    }
    public Employee(String name,String sex,int age){
        this.name=name;
        this.sex=sex;
        this.age=age;
    }
    public Employee(String pos,double salary){
        this.pos=pos;
        this.salary=salary;
    }

}
