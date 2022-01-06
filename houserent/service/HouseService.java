package src.houserent.service;

/*
* 定义House[]，保存House对象
* 1. 响应HouseView的调用
* 2. 完成对房屋信息的各种操作（crud）
*
* */

import src.houserent.domain.House;

import java.util.Scanner;

public class HouseService {
    private final House[] houses;
    private int houseNum=1;
    private int idCounter = 1;//记录id自增长
    private final Scanner scanner = new Scanner(System.in);

    public HouseService(int size){
        houses = new House[size];
        houses[0]=new House(1,"jack","1222","shanghai",1899,"未出租");
    }
    public House[] list(){
        return houses;
    }
    public boolean add(House house){
        if(houseNum==houses.length){
            System.out.println("数组已经满了，不能再添加了");
            return false;
        }else{
            houses[houseNum++]=house;
            //更新house的id
            house.setId(++idCounter);
            return true;
        }
    }
    public boolean del(int id){
        int index = -1;
        for(int i=0;i<houseNum;i++){
            if(houses[i].getId()==id){//找到要删除元素的index
                index = i;
            }
        }
        if(index==-1){
            System.out.println("删除失败！，不存在这个id\n输入任意键结束");
            //输入任意值结束
            boolean exist = false;
            do{
                exist = scanner.hasNext();
            }while(!exist);
            return false;
        }else{
            //index后面所有元素向前移动一个位置。把最后一个元素置空
            for(int i=index;i<houseNum-1;i++){
                houses[i]=houses[i+1];
            }
            houses[--houseNum]=null;
            System.out.println("删除成功");
            return true;
        }
    }
    //查找房源信息
    public void search(int id){
        boolean found =false;
        for(House h:houses){
            if(h!=null && h.getId()==id){
                found = true;
                System.out.println(h);
            }

        }
        if(!found){
            System.out.println("不存在！");
        }
    }
    public void modify(int id){
        //判断id是否存在
        int index = -1;
        for(int i=0;i<houses.length;i++){
            if(houses[i]!=null && houses[i].getId()==id){
                index=i;
                break;
            }
        }
        if(index==-1){
            System.out.println("不存在");
            return;
        }
        System.out.println("请选择要修改的信息：\n1.姓名\n2.电话\n3.地址\n4.租金\n5.状态");
        int choice;
        while(true){
            try{
                choice = scanner.nextInt();
                break;
            }catch(Exception e){
                scanner.next();
                System.out.println("请输入整数！");
            }
        }
        switch (choice) {
            case 1 -> {
                System.out.println("请输入新姓名");
                houses[index].setName(scanner.next());
                System.out.println("修改成功");
            }
            case 2 -> {
                System.out.println("请输入新电话");
                houses[index].setPhone(scanner.next());
                System.out.println("修改成功");
            }
            case 3 -> {
                System.out.println("请输入新地址");
                houses[index].setAddress(scanner.next());
                System.out.println("修改成功");
            }
            case 4 -> {
                System.out.println("请输入新租金");
                houses[index].setRent(scanner.nextInt());
                System.out.println("修改成功");
            }
            case 5 -> {
                System.out.println("请输入新状态");
                houses[index].setState(scanner.next());
                System.out.println("修改成功");
            }
        }

    }


}
