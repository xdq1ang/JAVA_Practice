package src.houserent.view;
/*
* 1. 显示界面
* 2. 接收用户的输入
* 3. 调用HouseService完成对房屋信息的各种操作
*
* */

import java.util.Scanner;

public class HouseView {
    private boolean loop=true;//控制显示菜单
    private int key;//接收用户选择
    Scanner scanner = new Scanner(System.in);
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
                case 1 -> System.out.println("新增房源");
                case 2 -> System.out.println("查找房源");
                case 3 -> System.out.println("删除房源");
                case 4 -> System.out.println("修改房源信息");
                case 5 -> System.out.println("显示房源信息");
                case 6 -> {
                    System.out.println("退出系统");
                    loop = false;
                }
                default -> System.out.println("输入有误");
            }


        }while(loop);

    }
}
