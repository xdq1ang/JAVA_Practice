package src.tankgame.tanks;

import src.tankgame.bullet.Bullet;

import java.util.*;


/*
 *   @author : xdqiang
 */
public class Enemy extends Tank implements Runnable{
    /*
    * 敌人坦克数量多，可以放入集合中Vector（线程安全）
    *
    *
    * */

    private Collection<Hero> heroes;
    private Hero nearestHero;
    public static Vector<Bullet> bullets= new Vector<>();//子弹集合
    HashMap disMap = new HashMap();
    int countMove;
    Random random =new Random();
    double runDirection;

    public Enemy(int x, int y, int direction,HashMap<String,Hero> heros) {
        super(x, y, direction);
        this.heroes = heros.values();
    }


    @Override
    public void shot() {
        //随机发射
        Bullet bullet = new Bullet(this.getX(),this.getY(),this.getDirection(),1);
        bullet.setSpeed(5);
        bullets.add(bullet);
        bullet.start();

    }
    public void track(Collection<Hero> heroes){
        //从bombs中选取一个距离最近的坦克，
        int x0;
        int y0;
        int x1;
        int y1;
        double distance;
        if(countMove%5==0){
            runDirection = random.nextDouble();
        }else if(countMove==10){
            countMove=0;
        }
        countMove++;

        for (Hero hero : heroes) {
            x0 = hero.getX();
            y0 = hero.getY();
            x1 = this.getX();
            y1 = this.getY();
            distance = Math.pow(x0-x1,2)+Math.pow(y0-y1,2);
            disMap.put(distance,hero);
        }
        //获取值最大的key
        Collection keySet = disMap.keySet();
        nearestHero = (Hero) disMap.get(Collections.min(keySet));
        //移动
        //x方向移动
        if(nearestHero.isLive()){
            if(runDirection>0.5 ){
                if(this.getX()>nearestHero.getX()){
                    moveLeft();
                }else if(this.getX()<nearestHero.getX()){
                    moveRight();
                }else {
                    shot();
                }
            }else{
                //y方向移动
                if(this.getY()>nearestHero.getY()){
                    moveUp();
                }else if(this.getY()<nearestHero.getY()){
                    moveDown();
                }else {
                    shot();
                }
            }
        }



       // System.out.println("敌军坐标："+getX()+","+getY());

    }

    @Override
    public void run() {
        while(true){
            track(heroes);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if(!this.isLive()){
                break;
            }
        }

    }
}
