package src.P12.homework;

import java.util.Arrays;

/*
 *   @author : xdqiang
 */
public class Homework03 {
    public static void main(String[] args) {
        String newName=NameFormat.format("Han Shun Ping");
        System.out.println(newName);
    }
}
class NameFormat{
    public static String format(String name){
        String[] nameList = name.split(" ");
        String firstName = nameList[nameList.length-1];
        String lastName="";
        if(nameList.length==2){
            lastName = nameList[0];
        }
        if(nameList.length>2){
            for(int i=1;i<nameList.length-1;i++){
                lastName += "."+nameList[i].charAt(0);
            }
            lastName=nameList[0]+lastName;
        }

        String newName = firstName+","+lastName;
        return newName;
    }
}