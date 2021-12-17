package P6;
public class MethodParameter01{
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        BB.swap(a,b);
        System.out.println("a="+a+" b="+b);

    }
}
class BB {
    public static void swap(int a,int b){
        int tmp = a;
        a=b;
        b=tmp;
        System.out.println("a="+a+"\tb="+b);
    }
}
