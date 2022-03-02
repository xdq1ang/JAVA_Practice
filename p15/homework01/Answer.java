package src.p15.homework01;

import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

/*
 *   @author : xdqiang
 */
public class Answer {
    public static void main(String[] args) {
        PrintNum printNum = new PrintNum();
        ScanQ scanQ = new ScanQ(printNum);
        scanQ.start();
        printNum.start();
    }
}


class PrintNum extends Thread{
    private boolean loop = true;

    public void setLoop(boolean loop) {
        this.loop = loop;
    }

    @Override
    public void run() {
        //输出数字
        while(loop){
            System.out.println((int)(((new Random()).nextDouble())*101));
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class ScanQ extends Thread{
    private PrintNum printNum;
    private Scanner scanner = new Scanner(System.in);

    public ScanQ(PrintNum printNum) {
        this.printNum = printNum;
    }

    @Override
    public void run() {
        while (true) {
            System.out.println("请输入指令");
            char key = scanner.next().toUpperCase().charAt(0);
            if(key=='Q'){
                //以通知的方式结束字符打印线程
                printNum.setLoop(false);
                break;
            }
        }
    }
}
