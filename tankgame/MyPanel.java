package src.tankgame;

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
    int enemySize=3;
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
                    if(enemy.Dead(bullet)){
                        it0.remove();
                    }
                }
            //我方坦克阵亡
            for (Bullet bullet:Enemy.bullets) {
                if(hero.Dead(bullet)){
                    System.out.println("我军阵亡");
                }
            }
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
