package src.P9.Innerclass;

public class InnerClassExercise02 {
    public static void main(String[] args) {
        new Cellphone().alarmClock(new Bell(){
            @Override
            public void ring() {
                System.out.println("懒猪起床！");
            }
        });
        new Cellphone().alarmClock(new Bell(){
            @Override
            public void ring() {
                System.out.println("小伙伴上课啦！");
            }
        });

    }
}
interface Bell{
    void ring();
}
class Cellphone{
    public void alarmClock(Bell bell){
        bell.ring();
    }
}