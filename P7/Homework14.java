package src.P7;
import java.util.Random;

public class Homework14 {
    public static void main(String[] args) {
        Person012 Tom = new Person012("Tom");
        Person012 Jack = new Person012("Jack");
        GameRule gr = new GameRule();
        for(int i=0;i<3;i++){
            Tom.play();
            Jack.play();
            gr.judge(Tom,Jack);
        }



    }
}
class Person012{
    String name;
    int gameValue= (int)(Math.random()*3);
    public Person012(String name){this.name=name;}
    public void play(){
        this.gameValue=(int)(Math.random()*3);
        //System.out.println(gameValue);
    }

}
class GameRule{
    int TomCount=0;
    public void judge(Person012 Tom,Person012 Jack){

        if(Tom.gameValue==0 && Jack.gameValue==1){
            System.out.println("--------------Gaming-------------------");
            ++TomCount;
            System.out.println("Tom出了石头，Jack出了剪刀");
            System.out.println(Tom.name+" 赢了!  次数为："+TomCount);
        }else if(Tom.gameValue==1 && Jack.gameValue==2){
            System.out.println("--------------Gaming-------------------");
            ++TomCount;
            System.out.println("Tom出了剪刀，Jack出了布");
            System.out.println(Tom.name+" 赢了!  次数为："+TomCount);
        }else if(Tom.gameValue==2 && Jack.gameValue==0){
            System.out.println("--------------Gaming-------------------");
            ++TomCount;
            System.out.println("Tom出了布，Jack出了石头");
            System.out.println(Tom.name+" 赢了!  次数为："+TomCount);
        }

    }
}
