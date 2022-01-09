package src.P13.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
 *   @author : xdqiang
 */
public class CollectionExercise {
    public static void main(String[] args) {
        Dog dog1 = new Dog("dog1",2);
        Dog dog2 = new Dog("dog2", 3);
        Dog dog3 = new Dog("dog3", 4);
        List dogs = new ArrayList();
        dogs.add(dog1);
        dogs.add(dog2);
        dogs.add(dog3);
        Iterator it = dogs.iterator();
        while (it.hasNext()) {
            Object next =  it.next();
            System.out.println(next);
        }
        for (Object d:
             dogs) {
            System.out.println(d);
        }
    }
}

class Dog{
    private String name;
    private int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
