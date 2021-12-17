package P6;

public class MethodExercise01 {
    public static void main(String[] args) {
        System.out.println(AA.isOdd(2));
        AA.printChar(2,3,'#');

    }
}
class AA{
    public static boolean isOdd(int num){
        return num%2==0?false:true;
    }
    public static void printChar(int h,int l,char c){
        for(int i=0;i<h;i++){
            for(int j=0;j<l;j++){
                System.out.print(c);
            }
            System.out.println('\n');
        }

    }
}
