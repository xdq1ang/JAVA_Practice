package P4;
/*
* 水仙花数是三位数
* */
public class Homework4 {
    public static void main(String[] args) {
        IsShuiXianHua.is(153);
    }


}

class IsShuiXianHua{
    public static void is(int num){
        //先取得num的百位，十位，个位
        //然后求立方和
        int bai = num/100;
        int shi = num%100/10;
        int ge = num%10;
        if(bai*bai*bai+shi*shi*shi+ge*ge*ge==num){
            System.out.println("水仙花！");
        }
        }
    }
