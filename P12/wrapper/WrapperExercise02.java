package src.P12.wrapper;

import java.sql.SQLOutput;

/*
 *   @author : xdqiang
 */
public class WrapperExercise02 {
    public static void main(String[] args) {
        method1();
    }
    public static void method1(){
        Integer i = new Integer(1);
        Integer j = new Integer(1);
        System.out.println(i==j);//false

        Integer m = 1;
        Integer n = 1;
        System.out.println(m==n);//true

        Integer x = 128;
        Integer y = 128;
        System.out.println(x==y);//false
    }
}

