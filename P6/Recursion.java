package P6;

public class Recursion {
    public static void main(String[] args) {
        RecursionPrint.RecursionPrint(5);

    }
}

class RecursionPrint{
    public static void RecursionPrint(int n){
        if(n>2){
            RecursionPrint(n-1);
        }
        System.out.println(n);


    }

}
