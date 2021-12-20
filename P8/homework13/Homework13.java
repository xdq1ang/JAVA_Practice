package src.P8.homework13;


public class Homework13 {
    public static void main(String[] args) {
        Student student1 = new Student("XDQ",1,21,"足球");
        student1.study();
        student1.play();
        Teacher teacher1 = new Teacher("xdqiang",1,29,"象棋");
        teacher1.teach();
        teacher1.play();
        Student student2 = new Student("CL",1,20,"足球");
        Teacher teacher2 = new Teacher("fgb",1,30,"象棋");

        Person[] arr = new Person[]{student1,student2,teacher1,teacher2};
        for(Person p: Tool.sort(arr)){
            System.out.println(p.age);
        }
        Tool.work(student1);
        Tool.work(teacher1);

    }
}

class Person{
    String name;
    int sex;
    int age;
    String game;

    public Person(String name, int sex, int age, String game) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.game = game;
    }

    public void play(){
        System.out.println(name+"爱玩"+game);
    }

}

class Student extends Person {
    private String stu_id;
    public Student(String name, int sex, int age, String game) {
        super(name, sex, age, game);
    }

    public void study(){
        System.out.println("我承诺，我会好好学习");
    }
}
class Teacher extends Person{
    private int work_age;
    public Teacher(String name, int sex, int age, String game) {
        super(name, sex, age, game);
    }

    public void teach(){
        System.out.println("我承诺，我会认真教学");
    }
}

class Tool{
    public static Person[] sort(Person[] arr){

        for(int i = 0; i < arr.length-1; i++){
            Person tmp;
            for(int j=0;j< arr.length-i-1;j++){
                if(arr[j].age<arr[j+1].age){
                    tmp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=tmp;
                }
            }


        }
        return arr;
    }
    public static void work(Person p){
        if(p instanceof Student){
            ((Student)p).study();
        }else if(p instanceof Teacher){
            ((Teacher)p).teach();
        }
    }
}