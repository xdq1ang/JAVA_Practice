package src.tankgameV0d5.tanks;

import src.tankgame.bomb.Bomb;
import src.tankgame.bullet.Bullet;

import java.util.ArrayList;
import java.util.Vector;

/*
 *   @author : xdqiang
 */
public class Tank {
    private int x;
    private int y;
    private int direction;
    private int speed=1;
    private boolean isLive=true;


    public Tank(int x, int y, int direction) {
        this.x = x;
        this.y = y;
        this.direction=direction;
    }

    //移动
    public void moveUp(){
        if(y>0){
            y-=10*speed;
        }
        this.direction=0;
    }
    public void moveDown(){
        if(y+60<750){
            y+=10*speed;
        }
        this.direction=2;
    }
    public void moveLeft(){
        if(x>0){
            x-=10*speed;
        }
        this.direction=3;
    }
    public void moveRight(){
        if(x+60<1000){
            x+=10*speed;
        }

        this.direction=1;
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
            int y2 = getY()+20;
            if(bullet.getX() > x1 && bullet.getX() < x2 && bullet.getY() > y1 && bullet.getY() < y2){
                System.out.println("被击中");
                isLive = false;
                return true;
            }else{
                return false;
            }
        }

    }
}
