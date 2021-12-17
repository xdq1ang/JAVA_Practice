package P5;

import java.util.Arrays;

public class Homework4 {
    public static void main(String[] args) {
         int[] arr = {10,12,45,90};
         int inSertNum = -5;
         int index = -1;
         for(int i = 0 ; i<arr.length ; i++ ){
             if(inSertNum < arr[i]){
                 index=i;
                 break;
             }
         }
         if(index==-1){
             index=arr.length;
         }
         System.out.println(index);
         int[] arr1 = new int[arr.length+1];
         int j=0;
         for(int num:arr){
             if(j==index){
                 arr1[index]=inSertNum;
                 j++;
             }
             arr1[j]=num;
             j++;
         }
         arr = arr1;//原来的arr变成垃圾被销毁
         System.out.println(Arrays.toString(arr1));
    }

}



