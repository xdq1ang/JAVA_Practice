package src.P16.filewriter;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriter_ {
    public static void main(String[] args) throws IOException {
        String path = "P16/filewriter/file.txt";
        String data = "\nhello xqiang";
        // 在节点流可以加入追加参数
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(path,true));
        bufferedWriter.write(data);
        bufferedWriter.newLine();// 根据系统插入换行符
        bufferedWriter.write(data);
        bufferedWriter.newLine();
        bufferedWriter.write(data);
        bufferedWriter.newLine();

        bufferedWriter.close();

    }
}
