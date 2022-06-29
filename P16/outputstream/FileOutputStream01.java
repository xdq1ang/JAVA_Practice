package src.P16.outputstream;

import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

/*
 *   @author : xdqiang
 */
public class FileOutputStream01 {
    public static void main(String[] args) {

    }
    //写入数据到文件中，不存在文件则创建
    @Test
    public void writeFile(){
        String filePath = "D:\\JAVA_Practice\\src\\P16\\outputstream\\file.txt";
        FileOutputStream fileOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream(filePath);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }finally {

        }
    }
}
