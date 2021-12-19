package src.P8.homework04;

public class Homework04 {
    public static void main(String[] args) {
        new Manager("xdqiang",500,1.2,30).showSalary();
        new Staff("xdqiang",500,1.0,30).showSalary();
    }
}

abstract class Worker{
    String name;
    double daySalary;
    double salaryLevel;
    int day;
    public abstract void showSalary();
}
class Manager extends Worker{
    public Manager(String name,double daySalary,double salaryLevel,int day) {
        this.name = name;
        this.daySalary = daySalary;
        this.salaryLevel = salaryLevel;
        this.day = day;
    }

    @Override
    public void showSalary(){
        System.out.println(name+"'s salary is:"+(1000+(daySalary*day*salaryLevel)));
    }
}

class Staff extends Worker{
    public Staff(String name, double daySalary, double salaryLevel, int day) {
        this.name = name;
        this.daySalary = daySalary;
        this.salaryLevel = salaryLevel;
        this.day = day;
    }

    @Override
    public void showSalary(){
        System.out.println(name+"'s salary is:"+daySalary*day*salaryLevel);
    }
}