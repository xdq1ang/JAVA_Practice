package src.P13.set;

import java.util.LinkedHashSet;
import java.util.Objects;

/*
 *   @author : xdqiang
 */
public class LinkedHashSetExercise {
    public static void main(String[] args) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(new Car("宝马",500));
        linkedHashSet.add(new Car("宝马",500));
        System.out.println(linkedHashSet);
    }
}

class Car{
    private String name;
    private double price;

    public Car(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        //如果名字和价格相同则返true
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Double.compare(car.price, price) == 0 && Objects.equals(name, car.name);
    }

    @Override
    public int hashCode() {
        //如果名字和价格相同则返回相同哈希
        return Objects.hash(name, price);
    }
}