package src.P16.outputstream;

import java.io.Serializable;

// 类实现Serializable接口
public class Dog implements Serializable {
    // 属性也应该是可以序列化的对象（实现serializable）
    private String name;
    private int age;
    // static 和 transient属性不会被序列化，反序列化时会输出null
    private static String nation;
    private transient String color;

    public Dog(String name, int age, String color, String nation) {
        this.name = name;
        this.age = age;
        this.color = color;
        this.nation = nation;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                ", nation='" + nation+"\'"+
                '}';
    }
}
