package src.P9.abstract_;

import javax.xml.namespace.QName;

public class AbstractExercise01 {
    public static void main(String[] args) {
        new Manager("xdqing","13456",9000,5000).work();
        new CommonEmployee("xd","13456",9000).work();

    }
}

abstract class Employee{
    private String name;
    private String id;
    private double salary;

    public Employee(String name, String id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }
    public abstract void work();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}

class Manager extends Employee{
    double bonus;
    public Manager(String name,String id,double salary,double bonus){
        super(name,id,salary);
        this.bonus=bonus;
    }

    @Override
    public void work() {
        System.out.println("Manager: "+ this.getName()+" is working" );
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
}

class CommonEmployee extends Employee{

    public CommonEmployee(String name, String id, double salary) {
        super(name, id, salary);
    }

    @Override
    public void work() {
        System.out.println("CommonEmployee: "+getName()+" is working");
    }
}