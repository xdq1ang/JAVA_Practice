package src.P11.exception;

public class Homework01 {
    public static void main(String[] args) {
        EcmDef.cal(Integer.parseInt(args[0]),Integer.parseInt(args[1]));

    }
}

class EcmDef{
    public static void cal(int n1,int n2){
        try{
            System.out.println( n1/n2);
        }catch (Exception e){
            System.out.println("除数不能为0");
        }

    }
}
