package src.P9.interface_;

public class ExtendsVsInterface {
    public static void main(String[] args) {
        LittleMonkey wukong = new LittleMonkey("悟空");
        wukong.climbing();
        wukong.swiming();

    }
}
interface Fishable{
    void swiming();//public 
}

class Monkey{
    private String name;

    public Monkey(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void climbing(){
        System.out.println("爬树");
    }
}

class LittleMonkey extends Monkey implements Fishable{

    public LittleMonkey(String name) {
        super(name);
    }

    @Override
    public void swiming() {
        System.out.println("游泳");
    }
}
