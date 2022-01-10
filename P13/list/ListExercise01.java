package src.P13.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/*
 *   @author : xdqiang
 */
public class ListExercise01 {
    public static void main(String[] args) {
        List list = new ArrayList();
        String[] str = {"1","2","3","4","5","6","7","8","9","10"};
        Iterator iterator = Arrays.stream(str).iterator();
        while (iterator.hasNext()) {
            Object next =  iterator.next();
            list.add(next);
        }
        System.out.println(list);
        list.add(1,"韩顺平教育");
        System.out.println(list);
        System.out.println(list.get(4));
        list.remove(5);
        System.out.println(list);
        list.set(6,"good job");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Object next =  it.next();
            System.out.println(next);
        }
    }
}
