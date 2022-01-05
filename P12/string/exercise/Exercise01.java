package src.P12.string.exercise;

import java.util.Scanner;

/*
 *   @author : xdqiang
 */
public class Exercise01 {
    public static void main(String[] args) {
        double d = Util.getPrice();
        System.out.println("\t"+Util.priceFormat(d));
    }

}

class Util{
    public static StringBuffer priceFormat(Double d){
        StringBuffer s =new StringBuffer(d.toString());
        int dotIndex = s.indexOf(".");
        while (true){
            if(dotIndex-3<=0){
                break;
            }else{
                dotIndex-=3;
                s.insert(dotIndex,",");
            }
        }
        return s;
    }
    public static double getPrice(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入商品名称：");
        String name = scanner.next();
        System.out.println("请输入价格");
        double price = scanner.nextDouble();
        System.out.print(name);
        return price;

    }
}

