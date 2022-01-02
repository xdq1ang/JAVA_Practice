package src.P10.homework;

public class Homework02 {
    public static void main(String[] args) {
        Fork fork1 = new Fork();
        Fork fork2 = new Fork();
        Fork fork3 = new Fork();
        System.out.println(fork1.getSerialNumber());
        System.out.println(fork2.getSerialNumber());
        System.out.println(fork3.getSerialNumber());



    }
}

class Fork{
    private static int currentNum=100000;
    private int serialNumber;
    public static int getNextNum(){
        currentNum+=100;
        return currentNum;
    }

    public int getSerialNumber() {
        return serialNumber;
    }


    public Fork() {
        this.serialNumber = getNextNum();
    }
}
