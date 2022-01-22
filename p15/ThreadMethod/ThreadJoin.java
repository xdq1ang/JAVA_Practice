package src.p15.ThreadMethod;

/*
 *   @author : xdqiang
 */
public class ThreadJoin {
    public static void main(String[] args) throws InterruptedException {
        int count=0;
        Hello hello = new Hello();
        hello.start();
        while(true){
            System.out.println("hi "+(++count));
            Thread.sleep(1000);
            if(count==20){
                break;
            }
            if(count==5){
                hello.join();//hello插队执行，执行完毕后主线程再继续执行
                //Thread.yield();//礼让，但是不一定成功
            }
        }

    }
}
class Hello extends Thread{
    int count;
    @Override
    public void run() {
        while(true){
        System.out.println("hello "+(++count));
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        if(count==20){
            break;
        }
    }
    }
}
