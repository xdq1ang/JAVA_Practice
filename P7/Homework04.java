package P7;

import java.util.Arrays;

public class Homework04 {
    public static void main(String[] args){
        double[] arr = {1,2,3};
        double[] arrN=Arr.arrCopy(arr);
        System.out.println(Arrays.toString(arrN));
        System.out.println(arr.equals(arrN));

    }
}

class Arr{
    public static double[] arrCopy(double[] arr){
        if(arr!=null && arr.length!=0){
            int len=arr.length;
            double[] arrN = new double[len];
            for(int i = 0; i<len;i++){
                arrN[i]=arr[i];
            }
            return arrN;
        }else{
            return null;
        }
    }
}
