package src.P13.homework;

import java.util.ArrayList;
import java.util.Iterator;

/*
 *   @author : xdqiang
 */
public class Homework02 {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        Car car1 = new Car("迈凯伦", 986456354);
        Car car2 = new Car("宝马", 987645454);
        Car car3 = new Car("大众", 987664354);
        Car car4 = new Car("沃尔沃", 987646454);
        Car car5= new Car("兰博基尼", 987646454);
        Car car6 = new Car("宾利", 987646454);
        ArrayList arrayList1 = new ArrayList();
        arrayList1.add(car5);
        arrayList1.add(car6);
        Car[] cars = new Car[]{car5,car6};
        arrayList.add(car1);
        arrayList.add(car2);
        arrayList.add(car3);
        arrayList.add(car4);
        arrayList.remove(car1);
        arrayList.contains(car1);
        System.out.println(arrayList.size());
        System.out.println(arrayList.isEmpty());
        //arrayList.clear();
        arrayList.addAll(arrayList1);
        System.out.println(arrayList);
        arrayList.removeAll(arrayList1);
        System.out.println(arrayList);
        for (Object o :arrayList) {
            System.out.println(o);
        }
        Iterator iterator = arrayList.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

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
}
