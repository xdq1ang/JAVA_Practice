package src.P16.filecopy;

import org.junit.jupiter.api.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 *   @author : xdqiang
 */
public class FileCopy {
    @Test
    public static void main(String[] args) {
        // 完成文件拷贝，将outputstream下的file.txt拷贝到当前目录
        // 思路
        // 1. 创建文件输入流，读取文件
        // 2. 创建文件输出流，写入文件
        // 3. 文件读取写入方式为循环读写
        String oldPath = "src/P16/outputstream/file.txt";
        String newPath = "src/P16/filecopy/file.txt";
        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;
        try {
            fileInputStream = new FileInputStream(oldPath);
            fileOutputStream = new FileOutputStream(newPath);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        // 循环读写
        byte[] b = new byte[10];
        int len = 0;
        try {
            while((len = fileInputStream.read(b,0, b.length)) != -1){
                    fileOutputStream.write(b,0,len);
            }
        } catch (IOException e) {
                throw new RuntimeException(e);
        } finally {
            try {
                if (fileOutputStream != null){
                        fileOutputStream.close();
                }
                if(fileInputStream != null){
                    fileInputStream.close();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        }

    }
}


