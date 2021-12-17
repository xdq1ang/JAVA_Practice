package src.P8.ployarr;

public class PloyArray {
    public static void main(String[] args) {
        Person person1 = new Person("人",20);
        Student student1 = new Student("xdqiang",21,100);
        Student student2 = new Student("zx",22,100);
        Tescher tescher1 = new Tescher("lc",30,9000);
        Tescher teacher2 = new Tescher("cv", 32, 9500);
        Person[] peoples = new Person[]{person1,student1,student2,tescher1,teacher2};
        for(Person p : peoples){
            p.say();
        }
        ((Tescher)(peoples[3])).teach();
        //把子类对象传入父类数组中会自动向上转型
        //如果想调用向上转型后的特有方法，要先向下转型



    }
}

class Person{
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void say(){
        System.out.println("我的名字是："+name+" 今年年龄："+age);
    }
}


class Student extends Person{
    private double score;

    public Student(String name, int age, double score) {
        super(name, age);
        this.score = score;
    }

    public double getScore() {
        return score;
    }

    @Override
    public void say() {
        super.say();
        System.out.println("分数："+score);
    }
    public void learn(){
        System.out.println("learning...");
    }
}

class Tescher extends Person{
    private double salary;

    @Override
    public void say() {
        super.say();
        System.out.println("工资："+salary);
    }

    public double getSalary() {
        return salary;
    }

    public Tescher(String name, int age, double salary) {
        super(name, age);
        this.salary = salary;
    }
    public void teach(){
        System.out.println("teaching....");
    }
}