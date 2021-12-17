package src.smallchange;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/*
* 该类完成零钱通的各个功能
* 使用面向对象编程
* 把各个功能对应一个方法
* */
public class SmallChangeSysOOP {
    boolean loop = true;
    Scanner scanner = new Scanner(System.in);
    String key = "";
    String details = "";
    double money = 0;
    double balance = 0;
    Date date = null;
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
    String note = "";
    public void mainMenu() throws IOException {
        System.out.println("正在加载历史账单...");
        loadBill();
        do{
            System.out.println("=============零钱通菜单==============");
            System.out.println("\t\t\t1.零钱通明细");
            System.out.println("\t\t\t2.收益入账");
            System.out.println("\t\t\t3.消费");
            System.out.println("\t\t\t4.退出");

            System.out.print("请输入你的选择1-4");
            key = scanner.next();
            switch(key){
                case "1":
                    this.detail();
                    break;
                case "2":
                    this.income();
                    break;
                case "3":
                    this.pay();
                    break;
                case "4":
                    this.exit();
                    break;
                default:
                    System.out.println("输入有误");
            }
        }while (loop);
        saveBill();
    }

    public void detail(){
        System.out.println(details);
    }
    public void income(){
        System.out.println("收益入账金额");
        money = scanner.nextDouble();
        //money的值应该校验
        if(money<=0){
            System.out.println("收益金额应该大于0");
            return;//退出方法体
        }
        balance += money;
        //拼接收益入账信息
        date=new Date();//获取当前时间
        details+="\n收益入账\t"+money+"\t"+sdf.format(date)+"\t余额:"+balance;
        //System.out.println(details);
    }
    public void pay(){
        date = new Date();
        System.out.println("消费明细");
        System.out.println("请输入消费金额");
        money = scanner.nextDouble();
        //消费范围的校验
        if(money>balance){
            System.out.println("消费金额大于了余额");
            return;
        }else if(money<=0){
            System.out.println("消费金额应该大于0");
            return;
        }
        System.out.println("请输入消费备注");
        note = scanner.next();
        balance -= money;
        details +="\n"+ note + "\t-" + money +"\t" +sdf.format(date)+"\t余额:"+balance;
    }
    public void exit(){
        System.out.println("你确定是要退出吗？y/n");
        while(loop){
            String choice = scanner.next();
            if(choice.equals("y")){
                loop = false;
            }else if(choice.equals("n")){
                break;
            }else{
                System.out.println("输入有误！你确定是要退出吗？y/n");
            }
        }
    }
    public void loadBill() throws IOException {
        FileInputStream in = new FileInputStream("src/smallchange/bill.txt");
        byte[] b = new byte[200];
        int len;
        while((len = in.read(b))!=-1){
            details+=new String(b,0,len);
        }

        if(!details.equals("")){
            String[] details_list =details.split("\n");
            String[] YE = details_list[details_list.length-1].split("\t");
            balance = Double.parseDouble(YE[YE.length-1].split(":")[1]);
        }
        System.out.println("历史账单：\n"+details);
    }
    public void saveBill() throws IOException {
        FileOutputStream out = new FileOutputStream("src/smallchange/bill.txt");
        out.write(details.getBytes(StandardCharsets.UTF_8));
        out.flush();
        out.close();
    }
}
