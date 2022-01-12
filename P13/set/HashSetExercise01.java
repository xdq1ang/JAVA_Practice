package src.P13.set;

import java.util.HashSet;
import java.util.Objects;

/*
 *   @author : xdqiang
 */
public class HashSetExercise01 {
    public static void main(String[] args) {
        //当name和age相同时，视为相同对象则不能重复添加到hashset中
        /*
        * 1.保证返回的hashcode一样（在table中索引相同）
        * 2.重写equals（使得比较的内容是name,age）
        *
        * */
        Employee employee1 = new Employee("xdqiang",20);
        Employee employee2 = new Employee("xdqiang",20);
        Employee employee3 = new Employee("xdq",20);
        HashSet hashSet = new HashSet();
        hashSet.add(employee1);
        hashSet.add(employee2);
        hashSet.add(employee3);
        System.out.println(hashSet);

    }
}
class Employee{
    private String name;
    private int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return age == employee.age && Objects.equals(name, employee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
