package src.houserent.service;

/*
* 定义House[]，保存House对象
* 1. 响应HouseView的调用
* 2. 完成对房屋信息的各种操作（crud）
*
* */

import src.houserent.domain.House;
public class HouseService {
    private House[] houses;
    private int houseNum=1;
    private int idCounter = 1;//记录id自增长

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
}
