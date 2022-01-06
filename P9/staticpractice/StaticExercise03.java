package src.P9.staticpractice;

public class StaticExercise03 {
    public static void main(String[] args) {
        Person1.setTotalPerson(3);
        new Person();
    }
}

class Person1{
    private final int id;
    private static int total=0;
    public static void setTotalPerson(int total){
        //this.total = total;//静态变量属于整个类。
        Person1.total = total;
    }
    public Person1(){
        total++;
        id = total;
    }
}
/*
* 静态方法只能访问静态成员
* 非静态放法可以访问静态以及非静态成员
* 在编写代码时仍然要遵守访问权限
*
*
* */
