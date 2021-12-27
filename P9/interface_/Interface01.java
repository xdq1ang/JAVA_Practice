package src.P9.interface_;

public class Interface01 {
    public static void main(String[] args) {
        new Computer().work(new Phone());
    }

}

interface UsbInterface{
    public void start();
    public void stop();
}

class Phone implements UsbInterface{

    @Override
    public void start() {
        System.out.println("Phone USB is starting");
    }

    @Override
    public void stop() {
        System.out.println("Phone USB us stopping");
    }
}

class Computer{
    public void work(UsbInterface usbInterface){
        usbInterface.start();
    }
}