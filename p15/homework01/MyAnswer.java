package src.p15.homework01;

import java.util.Random;
import java.util.Scanner;

/*
 *   @author : xdqiang
 */
public class MyAnswer {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new Runnable1());
        Thread thread2 = new Thread(new Runnable2());
        thread1.start();
        thread2.start();
        while(thread2.isAlive()){

        }
        thread1.stop();



    }
}

class Runnable1 implements Runnable{
    @Override
    public void run() {
        while(true){
            Random random = new Random();
            int num = (int)((random.nextDouble())*101);
            System.out.println(num);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}

class Runnable2 implements Runnable{
    @Override
    public void run() {
        Scanner scanner = new Scanner(System.in);
        while(true){
            String s = scanner.next();
            if(s.equals("Q")){
                return;
            }
        }
    }
}
