package src.P16.filewriter;

import org.junit.jupiter.api.Test;

import java.io.FileWriter;
import java.io.IOException;

/*
 *   @author : xdqiang
 */
public class FileWriter_ {
    public static void main(String[] args) {

    }
    @Test
    public void fileWriter01(){
        String path = "P16/filewriter/file.txt";
        FileWriter fileWriter = null;
        char[] chrs = new char[]{'a','b','c'};
        try {
            fileWriter = new FileWriter(path);
            fileWriter.write('H');
            fileWriter.write(chrs);
            fileWriter.write(chrs,0,1);
            fileWriter.write(" xdqiang da da");
            fileWriter.write(" xdqiang da da",0,5);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally {
            try {
                //对于FileWriter一定要close() 或者 flush()才能真正写入文件
                fileWriter.flush();
//                fileWriter.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
