package src.p15.ticketingsystem;

/*
 *   @author : xdqiang
 *   使用多线程模拟三个窗口同时售票
 *   总数：100
 */
public class SellTicket {
    public static void main(String[] args) {
//        SellTicket01 sellTicket01 = new SellTicket01();
//        SellTicket01 sellTicket02 = new SellTicket01();
//        SellTicket01 sellTicket03 = new SellTicket01();
//        //会出现互斥同步问题
//        sellTicket01.start();
//        sellTicket02.start();
//        sellTicket03.start();
        //把同一个对象放入不同线程中
        SellTicket02 sellTicket021 = new SellTicket02();
        Thread thread1 = new Thread(sellTicket021);
        Thread thread2 = new Thread(sellTicket021);
        Thread thread3 = new Thread(sellTicket021);
        //还是会出现互斥同步问题
        thread1.start();
        thread2.start();
        thread3.start();

    }
}
//使用Thread
class SellTicket01 extends Thread{
    private static int ticketNun = 100;
    @Override
    public void run() {
        while(true){
            if(ticketNun<=0){
                System.out.println("售票结束");
                break;
            }
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("窗口"+Thread.currentThread()+"售出一张票\n"+
                    "剩余"+(--ticketNun)+"张票");

        }

    }
}
class SellTicket02 extends Thread{
    private int ticketNun = 50;
    private boolean loop = true;
    public /*synchronized*/ void sell() {//加锁(synchronized是非公平锁)，在同一时刻只能有一个线程来执行run()
        synchronized (this) {//这里的this可以是其他对象（同一个）
            if (ticketNun <= 0) {
                System.out.println("售票结束");
                loop = false;
                return;
            }
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("窗口" + Thread.currentThread() + "售出一张票\n" +
                    "剩余" + (--ticketNun) + "张票");
        }
    }
    @Override
    public void run() {
        while(loop){
            sell();
        }

    }
}