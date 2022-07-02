package src.P16.standard;

import java.util.Scanner;

public class InputAndOutput {
    public static void main(String[] args) {
        // System.in的编译类型：InputStream
        // System.in的运行类型：BufferedInputStream
        // 表示键盘
        System.out.println(System.in.getClass());// 输出运行类型

        // System.out的编译类型：PrintStream
        // System.out的运行类型：PrintStream
        // 表示显示器
        System.out.println(System.out.getClass());


        System.out.println("hello xdqiang");


        // scanner从键盘读取数据
        Scanner scanner = new Scanner(System.in);
        String next = scanner.next();
        System.out.println(next);

    }
}
