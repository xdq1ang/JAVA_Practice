package src.P14;

/*
 *   @author : xdqiang
 */
public class Generic03 {
    public static void main(String[] args) {
        Person<String> xdqiang = new Person<String>("xdqiang");
        Person<Integer> person = new Person<Integer>(123);
        xdqiang.showClass();
        person.showClass();
    }
}

class Person<E>{  // E是创建Person对象时指定的数据类型
    E name;
    public Person(E name) {
        this.name = name;
    }
    public E getName(){
        return this.name;
    }
    public void showClass(){
        System.out.println(name.getClass());
    }
}
