package src.P10.homework;

public class Homework07 {
    public static void main(String[] args) {
        Car1 car1 = new Car1(-20);
        Car1.Air air = car1.new Air();
        air.autoWork();
    }
}
class Car1{
    private final double temperature;

    public Car1(double temperature) {
        this.temperature = temperature;
    }
    class Air{
        public void flow(int mode){
            if(mode==0){
                System.out.println("制冷");
            }else if(mode==1){
                System.out.println("制热");
            }
        }
        public void autoWork(){
            if(temperature>40){
                flow(0);
            }else if(temperature<0){
                flow(1);
            }else{
                System.out.println("关机");
            }
        }
    }
}