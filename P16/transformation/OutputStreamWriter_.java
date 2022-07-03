package src.P16.transformation;


import java.io.*;

/*
* 把FileOutputStream转为字符流
* 并指定编码格式
*
*
* */
public class OutputStreamWriter_ {
    public static void main(String[] args) throws IOException {
        String filePath = "P16/transformation/outputStreamWriter.txt";
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream(filePath), "utf8");
        osw.write("hello xdqiang 好好好");
        osw.close();

    }
}
