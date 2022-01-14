package src.P13.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
 *   @author : xdqiang
 */
public class MapExercise {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put("01",new Employee("xdqiang0",50000,"01"));
        map.put("02",new Employee("xdqiang1",51000,"02"));
        map.put("03",new Employee("xdqiang2",53000,"03"));
        Set keyset = map.keySet();
        for (Object o :keyset) {
            System.out.println(o.getClass());
            System.out.println(((Employee)(map.get(o))).getSal());
        }
        Set entrySet = map.entrySet();
        for (Object o :entrySet) {
            Map.Entry m = (Map.Entry)o;
            Employee e = (Employee)m.getValue();
            System.out.println(e.getSal());

        }


    }
}

class Employee{
    private String name;
    private double sal;
    private String id;

    public Employee(String name, double sal, String id) {
        this.name = name;
        this.sal = sal;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", sal=" + sal +
                ", id='" + id + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public double getSal() {
        return sal;
    }

    public String getId() {
        return id;
    }
}