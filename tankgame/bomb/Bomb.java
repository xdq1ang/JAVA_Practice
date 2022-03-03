package src.tankgame.bomb;

/*
 *   @author : xdqiang
 */
public class Bomb {
    private int x,y;//炸弹的坐标
    private int life=9;//炸弹的生命周期
    Boolean isLive = true;//是否存活

    public Bomb(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getLife() {
        return life;
    }

    public Boolean getLive() {
        return isLive;
    }

    //减少生命值
    public void lifeDown(){
        if(life >0 ){
            life--;
        }else{
            isLive = false;
        }
    }
}
