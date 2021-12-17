package P4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Homework2 {
    public static void main (String[] args){
        //字符转换输入流。把字节转换为字符
        InputStreamReader is = new InputStreamReader(System.in);
        //把字转换流放在字符缓冲流中
        BufferedReader br = new BufferedReader(is);
        char [] c = new char[100];
        String s = "";
        try{
            while((s=br.readLine())!=null){
                int d = Integer.parseInt(s);
                System.out.println(d>0?"大于0":d==0?"等于0":"小于0");
            }
        }catch (Exception e){
            System.out.println(e.getStackTrace());
        }


    }
}
