package src.p15.homework02;

/*
 *   @author : xdqiang
 */
public class MyAns {
    public static void main(String[] args) {
        Card card = new Card("123456", "xdqiang", 10000);
        Withdraw withdraw = new Withdraw(card, 100);
        Thread thread1 = new Thread(withdraw);
        Thread thread2 = new Thread(withdraw);
        thread1.start();
        thread2.start();

    }
}

class Card{
    private String id;
    private String name;
    private double money;

    public Card(String id, String name, double money) {
        this.id = id;
        this.name = name;
        this.money = money;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }
}



class Withdraw implements Runnable{
    private Card card;
    private double Qmoney;
    private boolean enough = true;
    static Object object = new Object();

    public Withdraw(Card card,double qmoney) {
        this.card = card;
        Qmoney = qmoney;
    }
    public synchronized void withdraw() throws InterruptedException {
            if (card.getMoney() < Qmoney) {
                System.out.println(String.format("余额不足！余额为%f------" + Thread.currentThread().getName(), card.getMoney()));
                enough = false;
                return;
            } else {
                card.setMoney(card.getMoney() - Qmoney);
                System.out.println(String.format("取钱成功，余额为%f------%s", card.getMoney(), Thread.currentThread().getName()));
            }
            Thread.sleep(1000);
    }

    @Override
    public void run() {
        while (enough) {
            try {
                withdraw();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}