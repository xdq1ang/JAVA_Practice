package P5;

public class Homework6 {
    public static void main(String[] args) {
        char[] arr1 = {'a','z','b','c'};
        char[] arr2 = arr1;
        arr1[2]='韩';
        for(int i = 0;i<arr2.length;i++){
            System.out.println(arr1[i]+","+arr2[i]);
        }
    }
}
