package src.P8.homework05;

public class Homework05 {
    public static void main(String[] args) {
        new Worker("x",4000).showSal();
        new Peasant("d",4500).showSal();
        new Waiter("q",4600).showSal();
        new Teacher("t",5000,100,30).showSal();
        new Scientist("xdqiang",8000,8000).showSal();

    }
}

abstract class Staff{
    String name;
    double baseSal;
    public abstract void showSal();

    public Staff(String name, double baseSal) {
        this.name = name;
        this.baseSal = baseSal;
    }
}
class Worker extends Staff{
    public Worker(String name, double baseSal) {
        super(name, baseSal);
    }

    @Override
    public void showSal() {
        System.out.println(name+"'s salary is "+baseSal);
    }
}

class Peasant extends Staff{
    public Peasant(String name, double baseSal) {
        super(name, baseSal);
    }

    @Override
    public void showSal() {
        System.out.println(name+"'s salary is "+baseSal);
    }
}

class Waiter extends Staff{
    public Waiter(String name, double baseSal) {
        super(name, baseSal);
    }

    @Override
    public void showSal() {
        System.out.println(name+"'s salary is "+baseSal);
    }
}

class Teacher extends Staff{
    double courseSal;
    int day;
    public Teacher(String name, double baseSal,double courseSal,int day) {
        super(name, baseSal);
        this.courseSal = courseSal;
        this.day = day;
    }

    @Override
    public void showSal() {
        System.out.println(name+"'s salary is "+(baseSal+courseSal*day));
    }
}

class Scientist extends Staff{
    double annualBonus;
    public Scientist(String name, double baseSal,double annualBonus) {
        super(name, baseSal);
        this.annualBonus = annualBonus;
    }

    @Override
    public void showSal() {
        System.out.println(name+"'s salary is "+(baseSal+annualBonus));
    }
}


/*
* super.name
* super.g1()
* this.name
* this.age//错误   私有属性不会被继承
* this.id
* this.score
* this.g1()
* this.f1()
*
* super.name
* super.id
* super.g1()
* super.f1()
* this.name
* this.age//错误   私有属性不会被继承
* this.g1()
* this.id
* this.score//错误   私有属性不会被继承
* this.f1()
*
*
* "Test"
* "Demo"
* "Rose"
* "Jack"
*
*
* john
* jack
*
*
*
* */