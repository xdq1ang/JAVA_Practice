package src.P12.arrays;

import java.util.Arrays;
import java.util.Comparator;

/*
 *   @author : xdqiang
 */
public class ArrayExercise {
    public static void main(String[] args) {
        Book b1 = new Book("b1",100.0);
        Book b2 = new Book("b2",90.0);
        Book b3 = new Book("b3",5.0);
        Book b4 = new Book("b4",300.0);
        Book b5 = new Book("b5",20.0);

        Book[] books = {b1,b2,b3,b4,b5};
        Arrays.sort(books, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                Book b1 = (Book)o1;
                Book b2 = (Book)o2;
                return (int)(b1.getPrice()- b2.getPrice());
            }
        });
        for (Book b:
             books) {
            System.out.println(b);
        }
    }
}

class Book{
    private String name;
    private Double price;

    public Book(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
