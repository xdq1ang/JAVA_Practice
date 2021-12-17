package P6;

public class Peach {
    public static void main(String[] args) {
        EatPeach.EatPeach(1);
    }
}

class EatPeach{
    public static int EatPeach(int day){
        if(day==10){
            System.out.println("第"+day+"天还剩下桃子：1个");
            return 1;

        }else{
            int g=(EatPeach(day+1)+1)*2;
            System.out.println("第"+day+"天还剩下桃子："+g+"个");
            return g;
        }

    }
}
