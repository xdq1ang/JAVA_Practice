package src.P16.homework;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Homework02 {
    public static void main(String[] args) throws IOException {
        // 使用缓冲字符输入流读取一个文件，为每行加上行号，再连同内容一起输出到屏幕
        BufferedReader br = new BufferedReader(new FileReader("P16/homework/mytemp.txt"));
        String line = "";
        int lineId = 0;
        while ((line = br.readLine())!=null){
            lineId++;
            String newLine = "line: " + lineId + " " + line;
            System.out.println(newLine);
        }
    }
}
