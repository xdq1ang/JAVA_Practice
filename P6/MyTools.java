package P6;

import java.util.Arrays;

public class MyTools{
    public static void main(String[] args) {
        double[][] arr = new double[][]{{1,2,3},{4,5,6},{7,8,9}};
        double[][] arr1 = new double[3][3];
        double[][] arr3 = new double[1][];
        double[][] arr2 = {{1,2,3},{4,5,6},{7,8,9}};
        Arrays2D.output(arr);

    }
}
class Arrays2D{
    public static void output(double[][] arr){
        int l = arr.length;
        int c = arr[0].length;
        for(int i = 0;i<l;i++){
            for(int j=0;j<c;j++){
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println("\n");
        }
    }
}
