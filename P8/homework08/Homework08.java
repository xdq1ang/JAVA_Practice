package src.P8.homework08;

public class Homework08 {
    public static void main(String[] args) {
        System.out.println("-----------a1--------------");
        BankAccount a1 = new BankAccount(0);
        a1.deposit(0.5);
        System.out.println("存款后余额："+a1.getBalance());
        a1.withdraw(20);
        System.out.println("取款后余额："+a1.getBalance());

        System.out.println("-----------a2--------------");
        CheckingAccount a2 = new CheckingAccount(0);
        a2.deposit(1.5);
        System.out.println("存款后余额："+a2.getBalance());
        a2.withdraw(1);
        System.out.println("取款后余额："+a2.getBalance());

        SavingsAccount a3 = new SavingsAccount(0);
        a3.setBalance(500);
        a3.earnMonthlyInterest(20);//这个每个月调用一次收取月租
        a3.withdraw(10);
        a3.withdraw(10);
        a3.withdraw(10);
        a3.withdraw(10);
        //一个月之后执行earnMonthlyInterest收取月租和重置免手续费次数
        a3.earnMonthlyInterest(20);
        a3.withdraw(1);
        System.out.println(a3.getBalance());

    }
}

class BankAccount{
    private double balance;
    public BankAccount(double initialBalance){
        this.balance = initialBalance;
    }
    public void deposit(double amount){
        balance += amount;
    }
    public void withdraw(double amount){
        if(amount<=getBalance()){
            balance -=amount;
        }else{
            System.out.println("余额不足");
        }
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}

class CheckingAccount extends BankAccount{

    public CheckingAccount(double initialBalance) {
        super(initialBalance);
    }

    @Override
    public void deposit(double amount) {
        if(getBalance()+amount-1>0){
            super.deposit(amount-1);
            System.out.println("收取了1元手续费");
        }else{
            System.out.println("余额不足以扣取手续费，存款失败，请多存储一点");
        }
    }

    @Override
    public void withdraw(double amount) {
        if(getBalance()-amount-1>0){
            super.withdraw(amount+1);
            System.out.println("收取了1元的手续费");
        }else{
            System.out.println("余额不足以扣取手续费，存款失败，请多存储一点");
        }

    }
}

class SavingsAccount extends CheckingAccount{
    int in_cnt=3;
    int out_cnt=3;
    public SavingsAccount(double initialBalance) {
        super(initialBalance);
    }
    public void earnMonthlyInterest(double amount){
        this.in_cnt = 3;//免手续费次数
        this.out_cnt = 3;
        this.setBalance(this.getBalance()-amount);

    }

    @Override
    public void deposit(double amount) {
        //不收手续费
        if(in_cnt>0){
            System.out.println("不收手续费");
            setBalance(getBalance()+amount);
            in_cnt-=1;
        }else{
            //收取手续费,直接调用父类方法
            System.out.println("收取手续费");
            super.deposit(amount);
        }
    }

    @Override
    public void withdraw(double amount) {
        //不收手续费
        if(out_cnt>0){
            System.out.println("不收手续费");
            setBalance(getBalance()-amount);
            out_cnt-=1;
        }else{
            //收取手续费,直接调用父类方法
            System.out.println("收取手续费");
            super.withdraw(amount);
        }
    }
}