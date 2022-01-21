package src.tankgame.tanks;

/*
 *   @author : xdqiang
 */
public class Enemy extends Tank{
    /*
    * 敌人坦克数量多，可以放入集合中Vector（线程安全）
    *
    *
    * */
    public Enemy(int x, int y, int direction) {
        super(x, y, direction);
    }

}
