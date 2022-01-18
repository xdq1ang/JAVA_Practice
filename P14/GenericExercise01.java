package src.P14;

import java.util.*;

/*
 *   @author : xdqiang
 */
public class GenericExercise01 {
    public static void main(String[] args) {
        HashMap<String, Student> hashMap = new HashMap<>();
        hashMap.put("xdqiang",new Student("xdqiang"));
        hashMap.put("Cai Lan",new Student("Cai Lan"));
        hashMap.put("xero",new Student("xero"));
        Set<String> keySet = hashMap.keySet();
        for (String key :keySet) {
            System.out.println(hashMap.get(key));
        }
        Collection<Student> values = hashMap.values();//values是一个Student Collection集合
        Iterator<Student> iterator = values.iterator();
        while (iterator.hasNext()) {
            Student next = iterator.next();
            System.out.println(next);
        }
        Set<Map.Entry<String, Student>> entries = hashMap.entrySet();//存储的是Entry，Entry存储的一对节点地址（地址指向键和值）
        Iterator<Map.Entry<String, Student>> iterator1 = entries.iterator();
        while (iterator1.hasNext()) {
            Map.Entry<String, Student> next =  iterator1.next();
            System.out.println(next);
        }
    }
}
class Student{
    private String name;

    public Student(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                '}';
    }
}