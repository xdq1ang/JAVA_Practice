package src.P16.homework;

import java.io.File;
import java.io.IOException;

public class Homework01 {
    public static void main(String[] args) throws IOException {
        //1. 判断当前路径下是否存在文件mytemp，没有则创建。
        File file = new File("P16/homework/mytemp.txt");
        if(!file.exists()){
            System.out.println("该文件不存在，正在创建！");
            file.createNewFile();
            System.out.println("文件创建成功！");
        }
        // 该命令不会重复创建文件，文件存在时则放弃创建，返回值为false
        System.out.println(file.createNewFile());
        //2.创建文件hello.txt    (略)
        //3.如果问价你已经存在则不在重复创建 (略)
    }
}
