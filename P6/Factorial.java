package P6;
public class Factorial{
    public static void main(String[] args) {
        F f = new F();
        f.Factorial(10);
        System.out.println(f.result);
    }
}

class F {
    int result=1;
    public void Factorial(int n){
        if(n>=2){
            Factorial(n-1);
        }
        result=result*n;
        System.out.println("乘"+n);
    }

}
