package src.P11.exception;

public class Homework01 {
    public static void main(String[] args){
            EcmDef.cal(args);

    }
}

class EcmDef{
    public static void cal(String[] args) {
        try {
            if (args.length != 2) {
                throw new ArrayIndexOutOfBoundsException("参数个数必须为2");
            }
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("参数个数必须为2");
        }

        try{
            double d1 = Double.parseDouble(args[0]);
            double d2 = Double.parseDouble(args[1]);
            System.out.println(d1/d2);
        }catch (NumberFormatException e){
            System.out.println("请输入整数");;
        }catch (ArithmeticException e){
            System.out.println("除数不能为0");
        }

    }
}
