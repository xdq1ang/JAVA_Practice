package P5;

import java.util.Arrays;
import java.util.Random;

public class Homework5 {
    public static void main(String[] args) {
        int sum=0;
        int[] arr = new int[10];
        for(int i = 0 ; i<10 ; i++){
            //Math.Random()*max+min
            int x = (int)(Math.random()*100+1);//Random生产的浮点数[0,1)
            arr[i]=x;
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("============倒序打印================");
        int max_index=0;
        int min_index=0;
        int min = arr[0];
        int max = arr[0];
        for(int i = arr.length-1;i>=0;i--){
            if(arr[i] < min){
                min_index=i;
                min = arr[i];
            }
            if(arr[i]>max){
                max_index=i;
                max = arr[i];
            }
            System.out.print(arr[i]+"\t");
            sum+=arr[i];
        }
        System.out.println("\n");
        System.out.println("平均值："+(double)sum/arr.length);
        System.out.println("最大值："+max+" index为："+max_index);
        System.out.println("最小值："+min+" index为："+min_index);


    }
}
