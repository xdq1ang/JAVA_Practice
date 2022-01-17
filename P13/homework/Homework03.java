package src.P13.homework;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
 *   @author : xdqiang
 */
public class Homework03 {
    public static void main(String[] args) {
        Map map = new HashMap();
        Employee jack = new Employee("jack", 650);
        Employee tom = new Employee("tom", 1200);
        Employee smith = new Employee("smith",2900);
        map.put(jack.getName(),jack.getSal());
        map.put(tom.getName(),tom.getSal());
        map.put(smith.getName(),smith.getSal());
        System.out.println(map);
        jack.addSal(100);
        jack.setSal(2600);
        Set set = map.keySet();
        for (Object key :set) {
            System.out.println(key);
            System.out.println(map.get(key));
        }



    }
}
class Employee{
    private String name;
    private double sal;

    public Employee(String name, double sal) {
        this.name = name;
        this.sal = sal;
    }
    public void addSal(double money){
        this.sal += money;
    }

    public String getName() {
        return name;
    }

    public double getSal() {
        return sal;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", sal=" + sal +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }
}
