package src.P16.transformation;

import java.io.*;

public class CodeQuestion {
    public static void main(String[] args) throws IOException {
        // 字符流方式
        // 读取文件
        String path = "P16/transformation/file.txt";
        // 创建输入流
        BufferedReader bufferedReader = new BufferedReader(new FileReader(path));
        String s = bufferedReader.readLine();
        System.out.println(s);
        bufferedReader.close();
        // 默认情况读取文件是按照utf-8编码读取文件，但是文件不是utf-8就会出现问题

        // 字节流方式
        System.out.println("----------------------");
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(path));
        byte[] bytes = new byte[3];
        int len = 0;
        while((len = bufferedInputStream.read(bytes,0,bytes.length))!=-1){
            System.out.print(new String(bytes,0,len));
        }

        // 字节流， 字符流都不能自动识别文件编码方式
    }
}
