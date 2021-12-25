package src.P9.codeblock;

public class CodeBlockExercise02 {
    public static void main(String[] args) {
        CodeBlockExercise02 codeBlockExercise02 = new CodeBlockExercise02();
    }
    Sample sam1 = new Sample("sam1成员初始化");
    static Sample sam = new Sample("静态成员sam初始化");
    static{
        System.out.println("static代码块执行");
        if(sam==null){
            System.out.println("sam is null");
        }
    }
    CodeBlockExercise02(){
        System.out.println("test 默认的构造函数被调用");
    }
}

class Sample{
    Sample(String s){
        System.out.println(s);
    }
    Sample(){
        System.out.println("sample默认构造函数被调用");
    }
}

/*
* 静态成员sam初始化
* static代码块执行
* sam1成员初始化
* test 默认的构造函数被调用
*
*
* */