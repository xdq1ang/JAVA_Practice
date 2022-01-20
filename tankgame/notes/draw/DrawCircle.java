package src.tankgame.notes.draw;

import javax.swing.*;
import java.awt.*;

/*
 *   @author : xdqiang
 */
public class DrawCircle extends JFrame {//JFrame对应的窗口，可以理解为画框
    //定义一个面板
    private MyPanel mp =null;
    public DrawCircle()  {
        mp = new MyPanel();
        this.add(mp);
        this.setSize(400,300);
        this.setVisible(true);//可以显示
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//点击窗口的小叉，程序退出（不设置的话不会自动退出）
    }

    public static void main(String[] args) {
        new DrawCircle();
        System.out.println("退出");


    }
}

//1.定义一个面板MyPanel,继承JPanel类。
class MyPanel extends JPanel{
    @Override
    public void paint(Graphics g) {//Graphics可以理解为画笔，提供了很多绘图的方法
        super.paint(g);//调用父类的方法完成初始化
        System.out.println("调用了paint()");
        //椭圆
        g.drawOval(10,10,100,100);
        //直线
        g.drawLine(200,10,200,200);
        //矩形
        g.drawRect(10,10,100,100);
        //填充矩形
        g.setColor(Color.BLUE);//设置颜色
        g.fillRect(100,100,100,100);
        //填充椭圆
        g.setColor(Color.RED);//设置颜色
        g.fillOval(200,200,100,50);
        //画图片
        //1.加载图片资源(图片要放在Out文件夹下)
        Image image = Toolkit.getDefaultToolkit().getImage(MyPanel.class.getResource("img.png"));//在项目的根目录去找图片
        g.drawImage(image,500,500,500,313,this);
        //画字符串
        g.setColor(Color.GREEN);
        g.setFont(new Font("宋体",Font.BOLD,100));
        g.drawString("蔡兰",100,100);//是字符串的左下角

    }
}
