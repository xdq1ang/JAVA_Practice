package P7;

public class Homework03 {
    public static void main(String[] args) {
        Book b = new Book();
        b.updatePrice();
        System.out.println(b.price);

    }
}

class Book{
    String name;
    double price=90.0;
    public void updatePrice(){
        if(this.price>=150){
            this.price=150;
        }else if(this.price>100){
            this.price=100;
        }

    }

}
