package src.P16.createNewFile;

import org.junit.jupiter.api.Test;

import java.io.File;

/*
 *   @author : xdqiang
 */
public class FileInformation {
    public static void main(String[] args) {

    }
    @Test
    public void info(){
        //创建文件对象
        File file = new File("src/P16/createNewFile/file01.txt");
        //调用相应的方法得到对应信息
        System.out.println("文件名："+file.getName());
        System.out.println("绝对路径："+file.getAbsolutePath());
        System.out.println("文件父级目录："+file.getParent());
        System.out.println("文件大小（字节）"+file.length());
        System.out.println("文件是否存在："+file.exists());
        System.out.println("是不是文件："+file.isFile());
        System.out.println("是不是目录："+file.isDirectory());
    }
}
