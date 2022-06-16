package src.P16.createNewFile;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;

/*
 *   @author : xdqiang
 */
public class FileCreate {
    public static void main(String[] args){
        FileCreate fileCreate = new FileCreate();
        fileCreate.create01();
        fileCreate.create02();
        fileCreate.create03();

    }
    //方式1：
    @Test
    public void create01(){
        String filePath = "src\\P16\\createNewFile\\file01.txt";
        //只是在内存中创建对象
        File file = new File(filePath);
        //在磁盘中创建文件
        try {
            file.createNewFile();
            System.out.println("文件创建成功");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    //方式2：
    @Test
    public void create02(){
        File fatherFile = new File("src\\P16\\createNewFile");
        String fileName = "file02.txt";
        //只是在内存中创建对象
        File file = new File(fatherFile, fileName);
        //在磁盘中创建文件
        try {
            file.createNewFile();
            System.out.println("文件创建成功");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    //方式3：
    @Test
    public void create03(){
        String father = "src\\P16\\createNewFile";
        String filePath = "file03.txt";
        try {
            new File(father,filePath).createNewFile();
            System.out.println("文件创建成功");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
