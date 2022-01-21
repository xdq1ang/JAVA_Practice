package src.tankgame.tanks;

/*
 *   @author : xdqiang
 */
public class Tank {
    private int x;
    private int y;
    private int direction;
    private int speed=1;

    public Tank(int x, int y, int direction) {
        this.x = x;
        this.y = y;
        this.direction=direction;
    }

    //移动
    public void moveUp(){
        y-=10*speed;
    }
    public void moveDown(){
        y+=10*speed;
    }
    public void moveLeft(){
        x-=10*speed;
    }
    public void moveRight(){
        x+=10*speed;
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
    //设置速度
    public void setSpeed(int speed){
        if(speed==0){
            System.out.println("速度值必须是正整数！");
            return;
        }
        this.speed = speed;
    }
}
