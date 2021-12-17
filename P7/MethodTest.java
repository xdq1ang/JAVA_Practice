package P7;

public class MethodTest {
    public static void main(String[] args) {
        Method M = new Method();
        M.m1(2);
        M.m2(2,3);
        M.m3("good morning");
        System.out.println(M.max(1,3,5));


    }

}
class Method{
    public void m1(int n){
        System.out.println(n*n);
    }
    public void m2(int n,int m){
        System.out.println(m*n);
    }
    public void m3(String s){
        System.out.println(s);
    }
    public int max(int m,int n){
        return m>n?m:n;
    }
    public double max(double m,double n){
        return m>n?m:n;
    }
    public  double max(double m,double n,double j){
        return m>n?m>j?m:j:n>j?n:j;
    }
}