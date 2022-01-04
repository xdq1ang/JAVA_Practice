package src.P11.exception;

import java.util.Scanner;

/*
 *   @author : xdqiang
 */
public class Exception02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true){
            try{
                int n= scanner.nextInt();
                System.out.println("输入的整数为："+n);
                return;
            }catch (Exception e){
                scanner.next();
                System.out.println("请输入整数");
            }
        }
    }
}

