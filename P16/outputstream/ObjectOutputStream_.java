package src.P16.outputstream;

import java.io.*;

public class ObjectOutputStream_ {
    public static void main(String[] args) throws IOException {
        // 完成对数据的序列化
        // 序列化后保存的文件格式不是文本的，是按照序列化1格式存储。后缀可以自定义
        String filePath = "P16/outputstream/object.ob";
        ObjectOutputStream obj = new ObjectOutputStream(new FileOutputStream(filePath));

        // 序列化数据到文件中
        // int 会自动装箱为Integer。它实现了序列化接口
        obj.writeInt(100);
        // 一些会自动装箱的例子
        obj.writeBoolean(true);
        obj.writeChar('d');
        obj.writeUTF("xdqiang 向德强");
        // 保存自己的对象
        Dog ccc = new Dog("ccc",20,"yellow","china");
        obj.writeObject(ccc);

    }

}

