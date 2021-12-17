package P4;

public class Homework1 {
    public static void main(String[] args){
        double money = 100000d;
        int i = 0;
        while(true){
            if(money>50000){
                money-=money*0.05;
                i++;
            }else if(money>=1000){
                money-=1000;
                i++;
            }else{
                break;
            }

        }
        System.out.println("可以经过："+i+"次路口");

    }
}
