package P5;

import java.util.Arrays;

public class Homework7 {
    public static void main(String[] args) {
        Sort.BubbleSort(new double[]{10,1,3,8,0.1,-10});

    }
}

class Sort{
    public static void BubbleSort(double[] arr){
        int len = arr.length;
        int lost_len=len;
        double tmp;
        if(len==1 | len==0){
            System.out.println(Arrays.toString(arr));
            return;
        }else if(len>1) {
            for(int j=0;j<len-1;j++){
                for (int i = 0; i < lost_len-1; i++) {
                    if (arr[i] < arr[i + 1]) {
                        tmp = arr[i];
                        arr[i] = arr[i + 1];
                        arr[i + 1] = tmp;
                    }
                }
            }
            System.out.println(Arrays.toString(arr));
        }
    }
}
