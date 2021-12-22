package src.houserent.view;
/*
* 1. 显示界面
* 2. 接收用户的输入
* 3. 调用HouseService完成对房屋信息的各种操作
*
* */

import src.houserent.domain.House;
import src.houserent.service.HouseService;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class HouseView {
    private boolean loop=true;//控制显示菜单
    private int key;//接收用户选择
    Scanner scanner = new Scanner(System.in);
    private HouseService houseService = new HouseService(3);
    //编写listHouse()显示房屋信息
    public void listHouse(){
        System.out.println("=============房屋列表=============");
        System.out.println("编号\t\t房主\t\t电话\t\t地址\t\t月租\t\t状态");
        House[] houses = houseService.list();
        for(House h : houses){
            if(h==null){
                break;
            }
            System.out.println(h);
        }
        System.out.println("房屋列表显示完毕");
    }
    //接收输入，创建house对象，调用add方法
    public void addHouse(){
        System.out.println("==============添加房屋==============");
        System.out.println("姓名:");
        String name = scanner.next();
        System.out.println("电话:");
        String phone = scanner.next();
        System.out.println("地址:");
        String address = scanner.next();
        System.out.println("月租:");
        int rent = scanner.nextInt();
        System.out.println("状态:");
        String state = scanner.next();
        House house = new House(0,name,phone,address,rent,state);
        houseService.add(house);
    }
    //接受输入的id,调用Service的del方法
    public void delHouse() {
        System.out.println("===============删除房屋信息===============");
        System.out.println("请输入房屋编号(-1退出)");

        //如果输入的是整数，跳出循环
        //如果不是整数会报错，继续循环
        int delId =-999;

        while(true){
            try {
                delId = scanner.nextInt();
                break;
            } catch (InputMismatchException e) {
                scanner.next();//;貌似是把之前那个输入字符给顶走了。就可以在输入了
                System.out.println("请输入整数！");
            }
        }

        if (delId == -1) {
            System.out.println("放弃删除");
            return;
        }
        //如果输入Y/N，停止循环输入。如果不是则继续循环。
        String isDel;//是否删除
        System.out.println("请确认是否删除(Y/N)");
        while (true) {
            isDel = scanner.next().toUpperCase(Locale.ROOT);
            if (isDel.equals("Y") || isDel.equals("N")) {
                break;
            } else {
                System.out.println("输入有误！请输入Y/N");
            }
        }
        //如果Y,删除，如果N取消删除
        if (isDel.equals("N")) {
            System.out.println("取消删除");
            return;
        } else if (isDel.equals("Y")) {
            houseService.del(delId);
        }


    }

    //显示主菜单
    public void mianMenu(){
        do{
            System.out.println("========房屋出租系统菜单========");
            System.out.println("\t\t\t1. 新 增 房 源");
            System.out.println("\t\t\t2. 查 找 房 源");
            System.out.println("\t\t\t3. 删 除 房 屋");
            System.out.println("\t\t\t4. 修 改 房 源 信 息");
            System.out.println("\t\t\t5. 显 示 房 源 信 息");
            System.out.println("\t\t\t6. 退 出 系 统");
            System.out.println("请输入你的选择(1-6)");
            key =scanner.nextInt();
            switch (key) {
                case 1 -> addHouse();
                case 2 -> System.out.println("查找房源");
                case 3 -> delHouse();
                case 4 -> System.out.println("修改房源信息");
                case 5 -> listHouse();
                case 6 -> {
                    System.out.println("退出系统");
                    loop = false;
                }
                default -> System.out.println("输入有误");
            }


        }while(loop);

    }
}
