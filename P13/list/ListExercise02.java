package src.P13.list;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/*
 *   @author : xdqiang
 */
public class ListExercise02 {
    public static void main(String[] args) {
        Book book1 = new Book("book1", 200, "xdqiang");
        Book book2 = new Book("book2", 100, "cc");
        Book book3 = new Book("book3", 56, "vv");
        List list = new ArrayList();
        list.sort(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                Book book1 =(Book)o1;
                Book book2 =(Book)o2;
                return (int)(book2.getPrice()-book1.getPrice());
            }
        });
        list.add(book1);
        list.add(book2);
        list.add(book3);
        for (Object o :list) {
            System.out.println("=========");
            System.out.println(o);

        }


    }
}

class Book{
    private String name;
    private double price;
    private String author;

    public Book(String name, double price, String author) {
        this.name = name;
        this.price = price;
        this.author = author;
    }

    @Override
    public String toString() {
        return "name = " + name + "\nprice = " + price + "\nauthor = " + author;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getAuthor() {
        return author;
    }
}
