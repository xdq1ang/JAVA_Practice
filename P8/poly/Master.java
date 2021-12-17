package src.P8.poly;

public class Master {
    private String name;

    public Master(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    //用多态可以解决多个feed问题
    public void feed(Animal animal , Food food){
        System.out.println(animal.getName()+"吃"+food.getName());

    }

}
