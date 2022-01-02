package src.P10.homework;

public class Homework04 {
    public static void main(String[] args) {
        new Cellphone().testWork(new ICal(){
            @Override
            public void work(){
                System.out.println("手机计算了一下");
            }
        });

    }
}

interface ICal {
    void work();
}
class Cellphone{
    public void testWork(ICal ical){
        ical.work();
    }
}
