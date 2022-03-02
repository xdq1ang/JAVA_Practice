package src.tankgame.tanks;

import src.tankgame.bullet.Bullet;

import java.util.ArrayList;
import java.util.Vector;

/*
 *   @author : xdqiang
 */
public class Hero extends Tank{
    public static Vector<Bullet> bullets= new Vector<>();//子弹集合
    public Hero(int x, int y,int direction) {
        super(x, y,direction);
    }

    @Override
    public void shot() {
        Bullet bullet = new Bullet(this.getX(),this.getY(),this.getDirection(),0);
        bullets.add(bullet);
        bullet.start();
    }
}
