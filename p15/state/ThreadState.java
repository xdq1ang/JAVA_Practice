package src.p15.state;

/*
 *   @author : xdqiang
 */
public class ThreadState {
    public static void main(String[] args) throws InterruptedException {
        T t = new T();
        System.out.println(t.getName()+" 状态 "+ t.getState());
        t.start();
        while(Thread.State.TERMINATED!=t.getState()){
            System.out.println(t.getName()+" 状态 "+ t.getState());
            Thread.sleep(100);
        }
        System.out.println(t.getName()+" 状态 "+ t.getState());
    }
}

class T extends Thread{
    @Override
    public void run() {
            for (int i = 0; i < 10; i++) {
                System.out.println("hi"+i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
            }
        }
    }
}
