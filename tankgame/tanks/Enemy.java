package src.tankgame.tanks;

import src.tankgame.bullet.Bullet;

import java.util.Vector;


/*
 *   @author : xdqiang
 */
public class Enemy extends Tank{
    /*
    * 敌人坦克数量多，可以放入集合中Vector（线程安全）
    *
    *
    * */
    public static Vector<Bullet> bullets= new Vector<>();//子弹集合
    public Enemy(int x, int y, int direction) {
        super(x, y, direction);
    }

    @Override
    public void shot() {
        //随机发射
        Bullet bullet = new Bullet(this.getX(),this.getY(),this.getDirection(),1);
        bullet.setSpeed(5);
        bullets.add(bullet);
        bullet.start();

    }

}
