package P7;

public class Homework06 {
    public static void main(String[] args) {
        Cale C = new Cale(10,0);
        System.out.println(C.shang());

    }
}

class Cale{
    double a;
    double b;
    public Cale(double a, double b){
        a=a;
        b=b;
    }
    public double sum(){
        return a+b;
    }
    public double cha(){
        return a-b;
    }
    public double ji(){
        return a*b;
    }
    public Double shang(){
        if(b!=0) {
            return a / b;
        }else{
            System.out.println("除数不能为0");
            return null;
        }
    }
}
