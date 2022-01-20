package src.tankgame;

import src.tankgame.tanks.Hero;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/*
 *   @author : xdqiang
 */
public class MyPanel extends JPanel implements KeyListener {
    //定义我的坦克
    //初始化位置
    int x = 100;
    int y = 100;
    Hero hero = null;
    public MyPanel(){
        hero = new Hero(x,y);//初始化坦克
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.fillRect(0,0,1000,750);//绘制游戏地图：填充矩形，黑色
        drawTank(hero.getX(),hero.getY(),g,0,0);

    }
    //坦克
    /*
    * x,y:坦克的左上角坐标
    * direction：坦克方向
    * type：坦克类型
    * */
    public void drawTank(int x, int y, Graphics g, int direction, int type){
        switch(type){
            case 0://我们的坦克
                g.setColor(Color.CYAN);
                break;
            case 1://敌方坦克
                g.setColor(Color.YELLOW);
                break;
        }
        //根据坦克的方向绘制坦克
        switch(direction){
            case 0://向上
                g.fill3DRect(x,y,10,60,false);
                g.fill3DRect(x+30,y,10,60,false);
                g.fill3DRect(x+10,y+10,20,40,false);
                g.fillOval(x+10,y+20,20,20);
                g.drawLine(x+20,y,x+20,y+30);
                break;
            default:
                System.out.println("暂不处理");
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        if(e.getKeyCode()==KeyEvent.VK_RIGHT){
            hero.setX(hero.getX()+5);
            repaint();
        }else if(e.getKeyCode()==KeyEvent.VK_LEFT){
            hero.setX(hero.getX()-5);
            repaint();
        }else if(e.getKeyCode()==KeyEvent.VK_DOWN){
            y++;
            hero.setY(hero.getY()+5);
            repaint();
        }else if(e.getKeyCode()==KeyEvent.VK_UP){
            hero.setY(hero.getY()-5);
            repaint();
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
