package src.houserent;

import src.houserent.domain.House;
import src.houserent.view.HouseView;

public class HouseRentApp {
    public static void main(String[] args) {
        //创建HouseView对象，并显示主菜单，是程序的入口
        House house1 = new House(1,"WJ","12345678911","上海",5000,"未出租");
        System.out.println(house1.toString());
        new HouseView().mianMenu();
    }
}
