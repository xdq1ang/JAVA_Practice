package src.tankgame.bullet;

import src.tankgame.tanks.Enemy;
import src.tankgame.tanks.Hero;

import java.util.Iterator;
import java.util.Vector;

/*
 *   @author : xdqiang
 */
public class Bullet extends Thread {//内部类
    private int x;
    private int y;
    private int direction;
    private int speed = 20;
    private boolean isLive = true;
    private int type;

    public Bullet(int x, int y, int direction,int type) {//输入坦克坐标和方向
        this.direction = direction;
        //计算子弹坐标
        if (this.direction == 0) {//上
            this.x=x+15;
            this.y=y;
        } else if (direction == 1) {//右
            this.x=x+60;
            this.y=y+15;
        } else if (direction == 2) {//下
            this.x=x+15;
            this.y=y+60;
        } else {//左
            this.x=x;
            this.y=y+15;
        }
        this.type = type;
        //System.out.println("子弹坐标为："+this.x+","+this.y);

    }
    @Override
    public void run() {
        while(true) {

            if (this.direction == 0) {
                this.y = this.y - speed;
            }else if(this.direction == 1){
                this.x = this.x + speed;
            }else if(this.direction == 2){
                this.y = this.y + speed;
            }else if(this.direction == 3) {
                this.x = this.x - speed;
            }
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            //System.out.println("子弹当前位置：" + this.x + "," + this.y);
            if(this.x>=1000||this.x<=0||this.y>=750||this.y<=0){
                //System.out.println("子弹已经销毁");
                isLive = false;
                return;
            }
        }
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getDirection() {
        return direction;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setDirection(int direction) {
        this.direction = direction;
    }
}
