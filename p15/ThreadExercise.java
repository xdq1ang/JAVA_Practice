package src.p15;

/*
 *   @author : xdqiang
 */
public class ThreadExercise {
    public static void main(String[] args) {
        Hello hello = new Hello();
        Thread thread = new Thread(hello);
        thread.start();
        Hi hi = new Hi();
        hi.start();

    }
}

class Hello implements Runnable{
    int count;
    @Override
    public void run() {
        while (true){
            System.out.println("hello world");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if(++count==10){
                break;
            }
        }
    }
}

class Hi extends Thread{
    int count;
    @Override
    public void run() {
        while(true){
            System.out.println("hi");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if(++count==5){
                break;
            }
        }
    }
}
