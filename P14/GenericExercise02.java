package src.P14;

import java.util.ArrayList;
import java.util.Comparator;

/*
 *   @author : xdqiang
 */
public class GenericExercise02 {
    public static void main(String[] args) {
        Employee adqiang1 = new Employee("adqiang10", 5000, new MyDate("05", "21", "1997"));
        Employee bdqiang2 = new Employee("bdqiang10", 4001, new MyDate("02", "22", "1997"));
        Employee cdqiang3 = new Employee("cdqiang03", 5002, new MyDate("03", "23", "1997"));
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(adqiang1);
        employees.add(bdqiang2);
        employees.add(cdqiang3);
        employees.sort(new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o1.compareTo(o2);
            }
        });
        for (Employee employee :employees) {
            System.out.println(employee);
        }


    }
}

class Employee implements Comparable<Employee>{
    private String name;
    private double sal;
    private MyDate birthday;

    public Employee(String name, double sal, MyDate birthday) {
        this.name = name;
        this.sal = sal;
        this.birthday = birthday;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }

    public MyDate getBirthday() {
        return birthday;
    }

    public void setBirthday(MyDate birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", sal=" + sal +
                ", birthday=" + birthday +
                '}';
    }

    @Override
    public int compareTo(Employee o) {
        if(!this.name.equals(o.getName())){
            return this.name.compareTo(o.getName());
        }else{
            return this.birthday.compareTo(o.getBirthday());
        }

    }
}



class MyDate implements Comparable<MyDate>{
    private String month;
    private String day;
    private String year;

    public MyDate(String month, String day, String year) {
        this.month = month;
        this.day = day;
        this.year = year;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return year+"/"+month+"/"+day;
    }

    @Override
    public int compareTo(MyDate o) {
        return o.toString().compareTo(this.toString());
    }
}