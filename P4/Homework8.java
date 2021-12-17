package P4;

public class Homework8 {
    public static void main(String[] args) {
        double sum=0;
        for(int i = 1;i<=100;i++){
            sum+=(1.0/i)*Math.pow(-1,i-1);

        }
        System.out.println(sum);
    }
}
