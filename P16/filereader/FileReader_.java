package src.P16.filereader;

import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/*
 *   @author : xdqiang
 */
public class FileReader_ {
    public static void main(String[] args) {


    }
    public void fileReader01(){
        int chr =0;
        FileReader fileReader = null;
        // 1. 创建FileReader对象
        try {
            fileReader = new FileReader("src/P16/filereader/code.txt");
            // 单个字符读取
            while((chr = fileReader.read()) != -1){
                System.out.print((char)chr);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally {
            try {
                fileReader.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
    @Test
    public void fileReader02(){
        char[] chars = new char[10];
        int readLen = 0;
        FileReader fileReader = null;
        try {
            fileReader = new FileReader("src/P16/filereader/code.txt");
            while ((readLen = fileReader.read(chars,0,chars.length)) != -1){
                for (int i = 0; i < readLen; i++){
                    System.out.print(chars[i]);
                }
                //输出2
                System.out.println(new String(chars,0,readLen));
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally {
            try {
                fileReader.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }


    }
}

