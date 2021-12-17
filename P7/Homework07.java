package P7;

public class Homework07 {
    public static void main(String[] args) {
        Dog dog = new Dog("hap","yellow",2);
        dog.show();

    }
}

class Dog{
    String name;
    String color;
    int age;
    public Dog(String name,String color,int age){
        this.name=name;
        this.age=age;
        this.color=color;
    }
    public void show(){
        System.out.println("姓名："+this.name);
        System.out.println("年龄："+this.age);
        System.out.println("颜色："+this.color);
    }

}
