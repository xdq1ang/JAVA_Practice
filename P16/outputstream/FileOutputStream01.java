package src.P16.outputstream;

import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

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
            // 这种创建方式会覆盖原来的内容
            // 可以添加创建方式参数，以追加模式创建文件内容。new FileOutputStream(filePath, true)
            fileOutputStream = new FileOutputStream(filePath, true);
            // 写入一个字节
            fileOutputStream.write('a');
            //写入字符串（字节数组）
            String str = " hello xdqiang";
            fileOutputStream.write(str.getBytes());
            // 写入字节数组的一部分
            fileOutputStream.write(str.getBytes(),0,2);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                fileOutputStream.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
