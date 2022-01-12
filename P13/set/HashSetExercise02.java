package src.P13.set;

import java.util.HashSet;
import java.util.Objects;

/*
 *   @author : xdqiang
 */
public class HashSetExercise02 {
    public static void main(String[] args) {
        Employee1 xdqiang = new Employee1("xdqiang", 6000, new MyDate("1997", "12", "28"));
        Employee1 xdqiang1 = new Employee1("xdqiang", 6050, new MyDate("1997", "12", "28"));
        Employee1 xdq = new Employee1("xdq", 6000, new MyDate("1997", "12", "28"));
        HashSet hashSet = new HashSet();
        hashSet.add(xdqiang);
        hashSet.add(xdqiang1);
        hashSet.add(xdq);
        for (Object o :hashSet) {
            System.out.println(o);
        }

    }
}

class Employee1 {
    private String name;
    private double sal;
    private MyDate birthday;

    public Employee1(String name, double sal, MyDate birthday) {
        this.name = name;
        this.sal = sal;
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "Employee1{" +
                "name='" + name + '\'' +
                ", sal=" + sal +
                ", birthday=" + birthday +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee1 employee1 = (Employee1) o;
        return Objects.equals(name, employee1.name) && Objects.equals(birthday, employee1.birthday);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, birthday);
    }
}

class MyDate{
    private String year;
    private String month;
    private String day;

    public MyDate(String year, String month, String day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyDate myDate = (MyDate) o;
        return Objects.equals(year, myDate.year) && Objects.equals(month, myDate.month) && Objects.equals(day, myDate.day);
    }

    @Override
    public int hashCode() {
        return Objects.hash(year, month, day);
    }

    @Override
    public String toString() {
        return "MyDate{" +
                "year='" + year + '\'' +
                ", month='" + month + '\'' +
                ", day='" + day + '\'' +
                '}';
    }
}
