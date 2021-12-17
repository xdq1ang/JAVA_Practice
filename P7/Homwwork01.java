package P7;

public class Homwwork01 {
    public static void main(String[] args) {
        double[] arr = {1.0,2.0,13.0};
        System.out.println(A01.max(arr));

    }

}
class A01{
    public static Double max(double[] arr){
            if (arr != null && arr.length > 0) {
                double tmp = arr[0];
                for (double d : arr) {
                    if (d > tmp) {
                        tmp = d;
                    }

                }
                return tmp;//将double自动装箱为Double
            } else {
                return null;
            }
    }
}
/*
* Double可以接受double和null
*
*
* */
