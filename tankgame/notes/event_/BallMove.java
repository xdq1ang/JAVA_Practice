package src.tankgame.notes.event_;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/*
 *   @author : xdqiang
 */
public class BallMove extends JFrame{
    /*
    * 通过键盘控制小球移动
    *
    * */

    MyPanel mp = null;
    public BallMove(){
        mp = new MyPanel();
        this.add(mp);
        this.setSize(400,300);
        //在JFrame添加关于mp的监听器
        this.addKeyListener(mp);//事件监听接口，接收并处理事件
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
    public static void main(String[] args) {
        BallMove ballMove = new BallMove();
    }
}

//KeyListener是监听器，可以监听键盘事件
class MyPanel extends JPanel implements KeyListener {
    int x = 10;
    int y = 10;
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.fillOval(x,y,50,50);
    }

    @Override
    public void keyTyped(KeyEvent e) {//有字符输出时该方法会触发

    }

    @Override
    public void keyPressed(KeyEvent e) {//当某个键按下时会触发这个方法
        System.out.println((char)e.getKeyCode()+" 被按下！");
        //按向下的箭头向下移动
        if(e.getKeyCode()==KeyEvent.VK_DOWN){
            y+=5;
            repaint();//重绘面板
        }else if(e.getKeyCode()==KeyEvent.VK_UP){
            y-=5;
            repaint();
        }else if(e.getKeyCode()==KeyEvent.VK_LEFT){
            x-=5;
            repaint();
        }else if(e.getKeyCode()==KeyEvent.VK_RIGHT){
            x+=5;
            repaint();
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {//当某个键释放时会触发这个方法

    }
}
