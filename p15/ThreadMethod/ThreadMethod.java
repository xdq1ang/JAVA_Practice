package src.p15.ThreadMethod;

/*
 *   @author : xdqiang
 */
public class ThreadMethod {
    public static void main(String[] args) {
        ThreadD threadD = new ThreadD();
        threadD.start();
        threadD.setName("EatBaoZi");
        try {
            Thread.sleep(50);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        threadD.interrupt();//可以终止休眠，继续运行线程代码

    }
}

class ThreadD extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(ThreadD.currentThread().getName()+" 吃包子。。。"+i);
        }
        System.out.println(Thread.currentThread().getName()+" 休眠中。。。");
        try {
            Thread.sleep(20000);
        } catch (InterruptedException e) {//中断时捕获异常
            System.out.println(Thread.currentThread().getName()+"被interrupt了休眠");
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(ThreadD.currentThread().getName()+" 接着吃包子。。。"+i);
        }
    }

}