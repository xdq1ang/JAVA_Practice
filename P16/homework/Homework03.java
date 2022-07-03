package src.P16.homework;

import java.io.*;
import java.util.Properties;

public class Homework03 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        /*
        * (1)
        * 创建一个dog.properties文件内容如下:
        * name=tom
        * age=5
        * color=red
        *
        * (2)
        * 编写Dog类(name, age, color)
        * 创建一个dog对象， 读取dog.properties用相应的内容完成属性初始化并输出
        *
        * (3)
        * 将dog对象序列化
        *
        * */
        String path = "P16/homework/dog.properties";
        Properties properties = new Properties();
        properties.load(new FileInputStream(path));
        properties.list(System.out);
        String name = properties.getProperty("name");
        int age = Integer.parseInt(properties.getProperty("age"));
        String color = properties.getProperty("color");
        Dog dog = new Dog(name, age, color);
        System.out.println(dog);

        // 序列化实现
        // Dog类需要实现Serializable接口实现序列化
        // 1.创建ObjectOutputStream对象
        // 2.创建节点流放入对象输出流中
        ObjectOutputStream obj = new ObjectOutputStream(new FileOutputStream("P16/homework/dog.obj"));
        // 在对象输出流中写入对象
        obj.writeObject(dog);
        obj.close();

        // 反序列化
        ObjectInputStream obj1 = new ObjectInputStream(new FileInputStream("P16/homework/dog.obj"));
        Object o = obj1.readObject();
        System.out.println(o);
        // 向下转型
        Dog dog1 = (Dog)o;
        System.out.println(dog1);


    }
}

class Dog implements Serializable {
    String name = "";
    int age = 0;
    String color = "";
    public Dog(String name, int age, String color){
        this.name = name;
        this.age = age;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }
}
