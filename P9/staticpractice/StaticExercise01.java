package src.P9.staticpractice;

public class StaticExercise01 {
    static int count =9;
    public void count(){
        System.out.println("count="+(count++));//非静态方法可以使用所有成员（静态和非静态）
    }
    public static void main(String[] args){
        new StaticExercise01().count();//count=9
        new StaticExercise01().count();//count=10
        System.out.println(StaticExercise01.count);//11
    }

}

