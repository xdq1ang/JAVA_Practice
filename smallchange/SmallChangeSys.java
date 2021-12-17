package src.smallchange;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class SmallChangeSys {
    //1. 显示菜单
    //2. 完成零钱通明细。可以保存到数组，可以使用对象，可以用字符串拼接
    //3. 收益入账。定义新的变量
    //4. 消费
    public static void main(String[] args) throws IOException {
        boolean loop = true;
        Scanner scanner = new Scanner(System.in);
        String key = "";
        String details = "";
        double money = 0;
        double balance = 0;
        Date date = null;
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        String note = "";
        //加载账单
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
                    System.out.println("零钱通明细");
                    System.out.println(details);
                    break;
                case "2":
                    System.out.println("收益入账金额");
                    money = scanner.nextDouble();
                    //money的值应该校验
                    if(money<=0){
                        System.out.println("收益金额应该大于0");
                        break;
                    }
                    balance += money;
                    //拼接收益入账信息
                    date=new Date();//获取当前时间
                    details+="\n收益入账\t"+money+"\t"+sdf.format(date)+"\t余额:"+balance;
                    //System.out.println(details);
                    break;
                case "3":
                    date = new Date();
                    System.out.println("消费明细");
                    System.out.println("请输入消费金额");
                    money = scanner.nextDouble();
                    //消费范围的校验
                    if(money>balance){
                        System.out.println("消费金额大于了余额");
                        break;
                    }else if(money<=0){
                        System.out.println("消费金额应该大于0");
                        break;
                    }
                    System.out.println("请输入消费备注");
                    note = scanner.next();
                    balance -= money;
                    details +="\n"+ note + "\t-" + money +"\t" +sdf.format(date)+"\t余额:"+balance;
                    break;
                case "4":
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
                    break;
                default:
                    System.out.println("输入有误");
            }
        }while (loop);
        //账单持久化存储
        FileOutputStream out = new FileOutputStream("src/smallchange/bill.txt");
        out.write(details.getBytes(StandardCharsets.UTF_8));
        out.flush();
        out.close();
        System.out.println("退出了零钱通");
    }
}
