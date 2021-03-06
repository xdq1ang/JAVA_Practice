package src.tankgame.tanks;

import org.junit.jupiter.api.Test;
import src.tankgame.bomb.Bomb;
import src.tankgame.bullet.Bullet;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Vector;

/*
 *   @author : xdqiang
 */
public class Tank {
    private int tankId = 0;
    public static int allTanksNum = 0;
    private int x;
    private int y;

    private HashMap<String,ArrayList<Integer>> loc = new HashMap<>();
    public static HashMap allTanksLoc = new HashMap();
    private int direction;
    private int speed=1;
    private boolean isLive=true;



    public Tank(int x, int y, int direction) {
        this.x = x;
        this.y = y;
        this.direction=direction;
        allTanksNum++;
        this.tankId = allTanksNum;
        updateLocations();
    }

    //移动
    public void moveUp(){
        if(y>0){
            y-=10*speed;
        }
        this.direction=0;
        updateLocations();
    }
    public void moveDown(){
        if(y+60<750){
            y+=10*speed;
        }
        this.direction=2;
        updateLocations();
    }
    public void moveLeft(){
        if(x>0){
            x-=10*speed;
        }
        this.direction=3;
        updateLocations();
    }
    public void moveRight(){
        if(x+60<1000){
            x+=10*speed;
        }

        this.direction=1;
        updateLocations();
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getDirection() {
        return direction;
    }

    public void setDirection(int direction) {
        this.direction = direction;
    }

    public int getSpeed() {
        return speed;
    }

    public boolean isLive() {
        return isLive;
    }

    public void setLive(boolean live) {
        isLive = live;
    }

    //设置速度
    public void setSpeed(int speed){
        if(speed==0){
            System.out.println("速度值必须是正整数！");
            return;
        }
        this.speed = speed;
    }
    //射击
    public void shot(){
        //在子类中实现
    }

    public boolean Dead(Bullet bullet){
        if(getDirection()==0 || getDirection()==2){
            int x1 = getX();
            int x2 = getX()+40;
            int y1 = getY();
            int y2 = getY()+60;
            if(bullet.getX() > x1 && bullet.getX() < x2 && bullet.getY() > y1 && bullet.getY() < y2){
                System.out.println("被击中");
                isLive = false;
                return true;
            }else{
                return false;
            }
        }else{
            int x1 = getX();
            int x2 = getX()+60;
            int y1 = getY();
            int y2 = getY()+40;
            if(bullet.getX() > x1 && bullet.getX() < x2 && bullet.getY() > y1 && bullet.getY() < y2){
                System.out.println("被击中");
                isLive = false;
                return true;
            }else{
                return false;
            }
        }

    }
    public void updateLocations(){
        HashMap<String, ArrayList<Integer>> locations = new HashMap<>();
        ArrayList<Integer> loc_zero = new ArrayList<>();
        ArrayList<Integer> loc_one = new ArrayList<>();
        ArrayList<Integer> loc_two = new ArrayList<>();
        ArrayList<Integer> loc_three = new ArrayList<>();
        loc_zero.add(this.x);
        loc_zero.add(this.y);
        //向上/下
        if(this.direction==0 || this.direction==2){
            loc_one.add(this.x + 40);
            loc_one.add(this.y);
            loc_two.add(this.x);
            loc_two.add(this.y + 60);

            loc_three.add(this.x + 40);
            loc_three.add(this.y + 60);
        //向右/左
        }else if(this.direction==1 || this.direction==3){
            loc_one.add(this.x + 60);
            loc_one.add(this.y);

            loc_two.add(this.x);
            loc_two.add(this.y + 40);

            loc_three.add(this.x + 60);
            loc_three.add(this.y + 40);
        }
        this.loc.put("loc0",loc_zero);
        this.loc.put("loc1",loc_one);
        this.loc.put("loc2",loc_two);
        this.loc.put("loc3",loc_three);
        allTanksLoc.put(tankId,loc);
        System.out.println(allTanksLoc);
    }
}
