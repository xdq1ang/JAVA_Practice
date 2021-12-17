package src.P7;

public class VarParameterExercise {
    public static void main(String[] args) {
        new HspMethod().showScore("xdqiang",50,60,30,90,100);
    }
}

class HspMethod{//可变参数必须放在最后
    public void showScore(String name,double...args){
        double sum=0;
        System.out.println("name:"+name);
        for(double d:args){
            sum+=d;
        }
        System.out.println("总成绩："+sum);
    }
}
