package src.P16.printwriter;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.io.PrintWriter;

public class PrintWriter_ {
    public static void main(String[] args) throws FileNotFoundException {
        // 输出位置为标准输出（显示器）
        PrintWriter printWriter = new PrintWriter(System.out);
        printWriter.println("xdqiang");
        printWriter.close();
        // 输出位置为文件（将系统的标准输出位置设置为文件）
        System.setOut(new PrintStream("P16/printwriter/sys_out.txt"));
        System.out.println("ggggggg");

        // 设置字符打印流的输出位置
        PrintWriter pw = new PrintWriter("P16/printwriter/pw_out.txt");
        pw.write("hhhhhhh   测试pw的输出");
        pw.close();
    }
}
