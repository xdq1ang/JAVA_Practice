package src.P8.homework03;

public class Homework03 {
    public static void main(String[] args) {
        new Teacher("xdqiang",20,"年级主任",9500).introduce();
        new Professor("xdqiang_pro",35,"教授",95000).introduce();
        new lecturer("xdqiang_lec",25,"讲师",9900).introduce();
    }
}

class Teacher{
    String name;
    int age;
    String post;
    double salary;

    public Teacher(String name, int age, String post, double salary) {
        this.name = name;
        this.age = age;
        this.post = post;
        this.salary = salary;
    }

    public void introduce(){
        System.out.println(String.format("name: %s, age: %d, post: %s, salary: %g",name,age,post,salary));
    }
}

class Professor extends Teacher{
    double salary_level=1.3;
    public Professor(String name,int age,String post,double salary){
        super(name,age,post,salary);
    }
    @Override
    public void introduce(){
        super.introduce();
        System.out.println("salary_level: " + salary_level);
    }


}

class AssProfessor extends Teacher{
    double salary_level=1.2;
    public AssProfessor(String name,int age,String post,double salary){
        super(name,age,post,salary);
    }
    @Override
    public void introduce(){
        super.introduce();
        System.out.println("salary_level: " + salary_level);
    }


}

class lecturer extends Teacher{
    double salary_level=1.1;
    public lecturer(String name,int age,String post,double salary){
        super(name,age,post,salary);
    }
    @Override
    public void introduce(){
        super.introduce();
        System.out.println("salary_level: " + salary_level);
    }


}
