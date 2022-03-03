package src.tankgame;

import src.tankgame.bomb.Bomb;
import src.tankgame.bullet.Bullet;
import src.tankgame.tanks.Enemy;
import src.tankgame.tanks.Hero;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Vector;

/*
 *   @author : xdqiang
 */

//为了让Panel不停绘制子弹，要将Panel实现多线程
public class MyPanel extends JPanel implements KeyListener,Runnable {
    //定义我的坦克
    //初始化位置
    Hero hero ;//玩家自己
    Vector<Enemy> enemys = new Vector<>();//敌军坦克集合
    Vector<Bomb> bombs = new Vector<Bomb>();//存放炸弹(当子弹击中坦克时加入炸弹对象到Vector中)
    int enemySize=3;

    //定义三张图片用于显示炸弹爆炸效果
    Image image1 = null;
    Image image2 = null;
    Image image3 = null;
    Image image4 = null;

    public MyPanel(){
        //玩家坦克初始化
        hero = new Hero(500,500,0);//初始化坦克
        hero.setSpeed(2);
        //敌军坦克初始化
        for (int i = 0; i < enemySize; i++) {
            Enemy enemy = new Enemy(200*(i+1),100,2);
            enemy.shot();
            enemys.add(enemy);
        }
        //初始化图片对象
        image1 = Toolkit.getDefaultToolkit().getImage(MyPanel.class.getResource("bomb_1.gif"));
        image2 = Toolkit.getDefaultToolkit().getImage(MyPanel.class.getResource("bomb_2.png"));
        image3 = Toolkit.getDefaultToolkit().getImage(MyPanel.class.getResource("bomb_3.png"));
        image4 = Toolkit.getDefaultToolkit().getImage(MyPanel.class.getResource("bomb_4.png"));
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.fillRect(0,0,1000,750);//绘制游戏地图：填充矩形，黑色
        //绘制玩家坦克
        drawTank(hero.getX(),hero.getY(),g,hero.getDirection(),1);
        //绘制敌军坦克
        for(Enemy enemy : enemys){
            drawTank(enemy.getX(), enemy.getY(),g, enemy.getDirection(),0);
        }

        //绘制我方子弹
        if(hero.bullets!=null) {
            Iterator<Bullet> it = hero.bullets.iterator();
            while(it.hasNext()){
                Bullet bullet = it.next();
                if(bullet.isAlive()){
                    g.setColor(Color.YELLOW);
                    g.fill3DRect(bullet.getX(), bullet.getY(), 10, 10,true);
                }else {
                    it.remove();
                }
               // System.out.println(hero.bullets.size());
            }
        }
        //绘制敌军子弹
        if(enemys!=null){
            for (Enemy emeny:enemys) {
                if(emeny.bullets!=null) {
                    Iterator<Bullet> it = emeny.bullets.iterator();
                    while(it.hasNext()){
                        Bullet bullet = it.next();
                        if(bullet.isAlive()){
                            g.setColor(Color.CYAN);
                            g.fill3DRect(bullet.getX(), bullet.getY(), 10, 10,true);
                            //System.out.println(emeny.getBullets().size());
                        }else{
                            it.remove();
                        }
                    }
                }
            }

        }
        //绘制炸弹，如果有炸弹则绘制
        for (int i = 0; i < bombs.size(); i++) {
            Bomb bomb = bombs.get(i);
            //根据炸弹的life值绘制相应的图片
            if(bomb.getLife() > 6) {
                g.drawImage(image1, bomb.getX(), bomb.getY(), 60, 60, this);
            }else if(bomb.getLife()>4){
                g.drawImage(image2,bomb.getX(),bomb.getY(),60,60,this);
            }else if(bomb.getLife()>2){
                g.drawImage(image3,bomb.getX(),bomb.getY(),60,60,this);
            }else{
                g.drawImage(image4,bomb.getX(),bomb.getY(),60,60,this);
            }
            //炸弹的生命减少
            bomb.lifeDown();
            //如果炸弹 life为0 则删除这个炸弹
            if(bomb.getLife()==0){
                bombs.remove(bomb);
            }
        }

    }
    //坦克
    /*
    * x,y:坦克的左上角坐标
    * direction：坦克方向
    * type：坦克类型
    * */
    public void drawTank(int x, int y, Graphics g, int direction, int type){
        switch (type) {
            case 0 ->//敌人的坦克
                    g.setColor(Color.CYAN);
            case 1 ->//我方坦克
                    g.setColor(Color.YELLOW);
        }
        //根据坦克的方向绘制坦克
        switch (direction) {
            case 0 -> {//向上
                g.fill3DRect(x, y, 10, 60, false);
                g.fill3DRect(x + 30, y, 10, 60, false);
                g.fill3DRect(x + 10, y + 10, 20, 40, false);
                g.fillOval(x + 10, y + 20, 20, 20);
                g.drawLine(x + 20, y, x + 20, y + 30);
            }
            case 1 -> {//向右
                g.fill3DRect(x, y, 60, 10, false);
                g.fill3DRect(x, y + 30, 60, 10, false);
                g.fill3DRect(x + 10, y + 10, 40, 20, false);
                g.fillOval(x + 20, y + 10, 20, 20);
                g.drawLine(x + 30, y + 20, x + 60, y + 20);
            }
            case 2 -> {//向下
                g.fill3DRect(x, y, 10, 60, false);
                g.fill3DRect(x + 30, y, 10, 60, false);
                g.fill3DRect(x + 10, y + 10, 20, 40, false);
                g.fillOval(x + 10, y + 20, 20, 20);
                g.drawLine(x + 20, y + 60, x + 20, y + 30);
            }
            case 3 -> {//向左
                g.fill3DRect(x, y, 60, 10, false);
                g.fill3DRect(x, y + 30, 60, 10, false);
                g.fill3DRect(x + 10, y + 10, 40, 20, false);
                g.fillOval(x + 20, y + 10, 20, 20);
                g.drawLine(x + 30, y + 20, x, y + 20);
            }
            default -> System.out.println("暂不处理");
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        if(e.getKeyCode()==KeyEvent.VK_D){
            hero.moveRight();
            hero.setDirection(1);
            repaint();
        }else if(e.getKeyCode()==KeyEvent.VK_A){
            hero.moveLeft();
            hero.setDirection(3);
            repaint();
        }else if(e.getKeyCode()==KeyEvent.VK_S){
            hero.moveDown();
            hero.setDirection(2);
            repaint();
        }else if(e.getKeyCode()==KeyEvent.VK_W){
            hero.moveUp();
            hero.setDirection(0);
            repaint();
        }else if(e.getKeyCode()==KeyEvent.VK_J){
            //System.out.println("坦克坐标为："+hero.getX()+","+hero.getY());
            hero.shot();
            repaint();
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
    //击杀判断
    public void shot(Hero hero, Vector<Enemy> enemys){
        //敌方坦克阵亡
            Iterator<Enemy> it0 = enemys.iterator();
            while(it0.hasNext()){
                Enemy enemy = it0.next();
                for(Bullet bullet: Hero.bullets){
                    if(enemy.isLive()){
                        if(enemy.Dead(bullet)){
                            //创建炸弹并加入到Vector中
                            Bomb bomb = new Bomb(enemy.getX(),enemy.getY());
                            bombs.add(bomb);
                            bullet.setLive(false);
                            it0.remove();
                        }
                    }

                }
            //我方坦克阵亡
            for (Bullet bullet:Enemy.bullets) {
                if(hero.isLive()){
                    if(hero.Dead(bullet)){
                        bullet.setLive(false);
                        //创建炸弹并加入到Vector中
                        Bomb bomb = new Bomb(hero.getX(),hero.getY());
                        bombs.add(bomb);
                        System.out.println("我军阵亡");
                    }
                }

            }
                System.out.println("炸弹个数："+bombs.size());
        }


    }

    @Override
    public void run() {//每次30毫秒重绘制面板
        while(true){
            shot(hero,enemys);//击杀判断
            try {
                Thread.sleep(30);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            this.repaint();

        }


    }
}
