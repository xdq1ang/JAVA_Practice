package P4;

public class Homework6 {
    public static void main(String[] args) {
        int n = 0;
        for(int i = 1;i<=100;i++){
            if(i%5!=0){
                n++;
                if(n%5==0){
                    System.out.println(i);
                }else{
                    System.out.print(i+"\t");
                }

            }
        }
    }
}
