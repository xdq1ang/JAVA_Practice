package src.P16.filereader;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReader_ {
    public static void main(String[] args) {
        String path = "P16/filereader/code.txt";
        // 创建节点流
        FileReader fileReader = null;
        try {
            fileReader = new FileReader(path);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        // 创建包装流
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line = "";
        try {
            while((line = bufferedReader.readLine()) != null){
                System.out.println(line);
                // 按照行读取文件，返回空时读取结束
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally {
            try {
                bufferedReader.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
