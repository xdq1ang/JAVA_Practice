package src.P16.inputstream;

import org.junit.jupiter.api.Test;

import java.io.FileInputStream;
import java.io.IOException;

/*
 *   @author : xdqiang
 */
public class FileInputStream_ {
    public static void main(String[] args) {
        // 字节输入流： 文件--> 程序
        new FileInputStream_().readFile01();
    }
    @Test
    public void readFile01() {
        String filePath = "D:\\JAVA_Practice\\src\\P16\\inputstream\\hello.txt";
        int read;
        FileInputStream fileInputStream = null;
        try {
            //创建文件输入流对象
            fileInputStream = new FileInputStream(filePath);
            //一次性读取i一个。读取的内容以int形式返回。如果文件读取完毕，则返回-1
            // 注意：此方法不能读取汉字，有汉字时会乱码
            // 因为一个中文由3个字符组成，而字节流一次性只是读取单个字符（会破环汉字完整性导致乱码）
            while ((read = fileInputStream.read()) != -1){
                System.out.print((char)read);
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //关闭文件流释放资源
            try {
                fileInputStream.close();
            }catch (Exception e){
                e.printStackTrace();
            }
        }

    }
    @Test
    public void readFile02() {
        String filePath = "P16\\inputstream\\hello.txt";
        //定义一个字节数组。一次性存储8个字节
        byte[] buf = new byte[80];
        int readLength = 0;
        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream(filePath);
            //read(buf)返回实际读取的字节数
            while ((readLength = fileInputStream.read(buf)) != -1){
                System.out.print(new String(buf,0,readLength));
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //关闭文件流释放资源
            try {
                fileInputStream.close();
            }catch (Exception e){
                e.printStackTrace();
            }
        }

    }

}
