package src.P8;

public class ExtendsExercise03 {
    public static void main(String[] args) {
        NotePad notePad1 = new NotePad("yellow","intel","32GB","500GB");
        PC pc1 = new PC("DELL","intel","32GB","500GB");
        System.out.println("----------notePad1 info:----------");
        notePad1.getDetails();
        System.out.println("----------pc1 info:---------------");
        pc1.getDetails();

    }
}
class Computer {
    String CPU;
    String internal_storage;
    String disc;
    public Computer(String CPU,String internal_storage,String disc){
        this.CPU = CPU;
        this.internal_storage = internal_storage;
        this.disc = disc;
    }
    public void getDetails(){
        System.out.println(this.CPU+"\n"+this.internal_storage+"\n"+this.disc);
    }

}
class PC extends Computer{
    String brand;
    public PC(String brand,String CPU,String internal_storage,String disc){
        super(CPU,internal_storage,disc);
        this.brand = brand;
    }
    @Override
    public void getDetails(){
        super.getDetails();
        System.out.println(this.brand);
    }
}
class NotePad extends Computer{
    String color;
    public NotePad(String color,String CPU,String internal_storage,String disc){
        super(CPU,internal_storage,disc);
        this.color = color;
    }

    @Override
    public void getDetails() {
        super.getDetails();
        System.out.println(this.color);

    }
}
