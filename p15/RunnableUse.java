package src.p15;

/*
 *   @author : xdqiang
 */
public class RunnableUse {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Thread thread = new Thread(dog);//把dog放入Thread实例
        thread.start();

    }
}
//java是单继承，所以还可以通过是实现Runnable接口来实现多线程

class Dog implements Runnable{
    int count;
    @Override
    public void run() {
        while (true){
            System.out.println("小狗旺旺叫！"+(++count)+" "+Thread.currentThread());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}


//静态代理类（一个对象没有start方法，但是可以依靠Rannable的start方法执行）
class ThreadProxy implements Runnable{

    private  Runnable target = null;
    @Override
    public void run() {
        if(target!=null){
            target.run();
        }
    }

    public ThreadProxy(Runnable target) {
        this.target = target;
    }
    public void start(){
        start0();
    }
    public void start0(){
        run();
    }
}