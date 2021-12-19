package src.P8.homework01;


public class Homework01 {
    public static void main(String[] args) {
        Person person1 = new Person("x",26,"student");
        Person person2 = new Person("d",21,"teacher");
        Person person3 = new Person("q",2,"doctor");
        Person[] arr = {person1,person2,person3};
        Person[] arr2 =new BubbleSort().sort(arr);
        for (Person p: arr2){
            System.out.println(p);
        }

    }
}

class BubbleSort{
    public Person[] sort(Person[] arr) {
        if (arr.length <= 1) {
            return arr;
        }else {
            Person tmp ;
            for (int i = 0; i < arr.length-1; i++) {
                for(int j=0;j< arr.length-i-1;j++){
                    if(arr[j].age>arr[j+1].age){
                        tmp=arr[j+1];
                        arr[j+1]=arr[j];
                        arr[j]=tmp;
                    }
                }
            }
            return arr;
        }
    }
}
