package src.P14;

import java.util.ArrayList;

/*
 *   @author : xdqiang
 */
public class GenericWildcard {
    public static void main(String[] args) {
        /*
        * 泛型不具备继承性
        *
        * */
        ArrayList<String> strings = new ArrayList<>();
        ArrayList<A1> list1 = new ArrayList<>();
        ArrayList<A2> list2 = new ArrayList<>();
        ArrayList<A3> list3 = new ArrayList<>();
        ArrayList<? super A1> list4 = new ArrayList<>();
        list4.add(new A1());


    }
}
class A1{}
class A2 extends A1{}
class A3 extends A2{}


