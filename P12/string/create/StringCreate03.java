package src.P12.string.create;

/*
 *   @author : xdqiang
 */
public class StringCreate03 {
    public static void main(String[] args) {
        String s1 =  "xdqiang";
        String s2 = "java";
        String s4 = "java";
        String s3 = "java";
        System.out.println(s2==s3);//false
        System.out.println(s2==s4);//true
        System.out.println(s2.equals(s3));//true
        System.out.println(s1==s2);//false
    }
}
