package src.P16.printstream;

/*
*
* 演示PrintStream
*
* */

import java.io.IOException;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

public class PrintStream_ {
    public static void main(String[] args) throws IOException {
        System.setOut(new PrintStream("P16/printstream/setOut.txt"));
        PrintStream out = System.out;
        // 在默认情况下输出数据的位置是 标准输出（即显示器）
        out.print("hello xdqiang");
        // out.print()的底层使用的是write,可以直接调用write()
        out.write("哈哈哈哈".getBytes(StandardCharsets.UTF_8));
        out.close();
        // 可以修改系统标出输出位置/设备
        // 和上述代码等价 System.out.print()
        System.setOut(new PrintStream("P16/printstream/setOut.txt"));
        System.out.println("hhhhh xdqiang  吃饭去");

        // 修改打印流输出位置
        PrintStream ps = new PrintStream("P16/printstream/ps.txt");
        ps.print("this is ps.out");


    }
}
