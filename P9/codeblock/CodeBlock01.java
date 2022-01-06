package src.P9.codeblock;

public class CodeBlock01 {
    public static void main(String[] args) {
        Move move = new Move("Hi Mom !");
    }
    
}
class Move{
    private String name;
    private double price;
    private final String director;
    //构造器中有相同的语句（冗余），抽取到代码块中
    //不管调用哪个构造器前，都会调用这个代码块
    {
        System.out.println("电影屏幕打开");
        System.out.println("广告打开");
        System.out.println("电影开始");
    }
    public Move(String director) {
        this.director = director;
    }

    public Move(String name, String director) {
        this.name = name;
        this.director = director;
    }

    public Move(String name, double price, String director) {
        this.name = name;
        this.price = price;
        this.director = director;
    }
}
