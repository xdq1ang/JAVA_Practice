package P6;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(CalFibonacci.CalFibonacci(40));

    }
}
class CalFibonacci{
    public static int CalFibonacci(int n ){
        if(n==1 | n==2){
            return 1;
        }else{
            return CalFibonacci(n-1)+CalFibonacci(n-2);
        }

    }
}