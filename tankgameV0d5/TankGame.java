package src.tankgameV0d5;

import src.tankgame.MyPanel;

import javax.swing.*;

/*
 *   @author : xdqiang
 */
public class TankGame extends JFrame {
    src.tankgame.MyPanel mp = null;
    public static void main(String[] args) {
        TankGame tankGame = new TankGame();
    }
    public TankGame(){
        mp = new MyPanel();
        new Thread(mp).start();
        this.add(mp);
        this.setSize(1000,750);//窗口大小
        this.addKeyListener(mp);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}
