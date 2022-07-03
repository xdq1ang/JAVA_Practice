package src.P16.transformation;


/*
*
* 字节流 -> 字符流
*
* */

import java.io.*;

public class InputStreamReader_ {
    public static void main(String[] args) throws IOException {
        String filePath = "P16/transformation/file.txt";
        // 创建字节流，用转换流将字节流转换为字符流并指定编码格式
        // 使用字符缓冲流包装字符流
        InputStreamReader isr = new InputStreamReader(new FileInputStream(filePath), "utf-8");
        BufferedReader bufferedReader = new BufferedReader(isr);
        String line = "";
        while((line = bufferedReader.readLine()) != null){
            System.out.println(line);
        }
        // 关闭外层流就ok了
        bufferedReader.close();

    }
}
