package src.p15;

/*
 *   @author : xdqiang
 *   当主线程结束后，子线程（守护线程）自动结束
 */
public class DaemonThread {
    public static void main(String[] args) throws InterruptedException {
        MyDaemonThread myDaemonThread = new MyDaemonThread();
        myDaemonThread.setDaemon(true);//设置为守护线程
        myDaemonThread.start();
        for (int i = 0; i < 50; i++) {
            System.out.println("主线程正在运行："+i);
            Thread.sleep(30);
        }

    }
}

class MyDaemonThread extends Thread{
    @Override
    public void run() {
        while(true){
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("守护中...");
        }
    }
}
