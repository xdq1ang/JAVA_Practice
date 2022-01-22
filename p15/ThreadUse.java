package src.p15;

/*
 *   @author : xdqiang
 */
public class ThreadUse {
    public static void main(String[] args) throws Exception{
        //Thread实现了Runnable接口
        Cat cat = new Cat();
        cat.start();//启动线程
        for (int i = 0; i < 500; i++) {
            System.out.println("主线程执行中："+i);
            Thread.sleep(1000);
        }
    }
}

class Cat extends Thread{
    int times;
    @Override
    public void run() {//重写run()方法
        while(true){
            System.out.print("线程名："+Thread.currentThread());
            System.out.println(String.format(" 线程循环了%d次",++times));
        System.out.println("maio maio 我是小猫咪");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        if(times==500){
            break;//线程退出
        }
    }
}
}
