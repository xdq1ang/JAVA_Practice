package src.P16.inputstream;
import java.io.*;
import src.P16.outputstream.Dog;

public class ObjectInputStream_ {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        // 反序列化
        String path = "P16/outputstream/object.ob";
        ObjectInputStream obj = new ObjectInputStream(new FileInputStream(path));
        // 反序列化的顺序一定要和序列化的顺序一致
        int num = obj.readInt();
        System.out.println(num);

        Boolean bool = obj.readBoolean();
        System.out.println(bool);

        char chr = obj.readChar();
        System.out.println(chr);

        String str = obj.readUTF();
        System.out.println(str);

        Object dog = obj.readObject();
        System.out.println(dog.toString());
        // Object dog向下转型
        Dog dog1 = (Dog)dog;
        System.out.println(dog1);
        obj.close();

    }
}



