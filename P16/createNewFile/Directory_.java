package src.P16.createNewFile;

import org.junit.jupiter.api.Test;

import java.io.File;

/*
 *   @author : xdqiang
 */
public class Directory_ {
    public static void main(String[] args) {

    }
    @Test
    public void m1(){
        //判断是否存在file01.txt 存在则删除
        String filePath = "src/P16/createNewFile/file01.txt";
        File file = new File(filePath);
        if(file.exists()){
            System.out.println("删除："+file.delete());
        }else {
            System.out.println("不存在该文件");
        }
    }
    //判断目录是否存在，存在则删除（java中目录也被视作文件），操作方法与上相同
    //实现过程：略
    @Test
    public void m2(){
        //创建目录
        String filePath = "src/P16/createNewFile/createPath";
        File file = new File(filePath);
        if(file.exists()){
            System.out.println("目录已经存在");
        }else {
            System.out.println("创建："+file.mkdir());


        }
    }
}


