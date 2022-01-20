package src.tankgame;

import javax.swing.*;

/*
 *   @author : xdqiang
 */
public class TankGame extends JFrame {
    MyPanel mp = null;
    public static void main(String[] args) {
        TankGame tankGame = new TankGame();
    }
    public TankGame(){
        mp = new MyPanel();
        this.add(mp);
        this.setSize(1000,750);//窗口大小
        this.addKeyListener(mp);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}
