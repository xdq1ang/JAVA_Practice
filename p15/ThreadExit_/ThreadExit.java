package src.p15.ThreadExit_;

/*
 *   @author : xdqiang
 *   希望main线程去控制t1线程的终止，可以定义一个控制变量控制循环的终止
 *   通知t1退出run()方法从而终止t1线程（通知方式）
 *
 */
public class ThreadExit {
    public static void main(String[] args) throws InterruptedException {
        T t = new T();
        t.start();
        Thread.sleep(10000);
        t.setLoop(false);
    }
}

class T extends Thread{
    private int count;
    //设置一个控制变量
    private boolean loop = true;//控制循环的结束
    @Override
    public void run() {
        while(loop){
            System.out.println("hello! "+(++count));
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void setLoop(boolean loop) {
        this.loop = loop;
    }
}
