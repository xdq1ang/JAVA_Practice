package src.P8.debug_;

import java.util.Arrays;

public class Debug03 {
    public static void main(String[] args) {
        int[] arr = {0,12,6,8,7};
        Arrays.sort(arr);
        for(int n:arr){
            System.out.print(n+"\t");
        }
    }
}
