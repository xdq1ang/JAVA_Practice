package src.P8.poly;

public class main {
    public static void main(String[] args) {
        Master master = new Master("xdqiang");
        Dog dog = new Dog("大黄");
        Bone bone = new Bone("骨头");
        master.feed(dog,bone);
        Cat cat = new Cat("timi");
        Fish fish = new Fish("小鱼");
        master.feed(cat,fish);
    }
}

/*
* 20
* 20
* true
* 10
* 20
*
*
* */