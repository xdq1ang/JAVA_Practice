package src.P16.filecopy;

import java.io.*;

// 字符流不要操作二进制文件（声音，视频，dox, pdf ...），会造成文件损坏

public class FileCopyBaseOnBufferedReaderWriter {
    public static void main(String[] args) throws IOException {
        String oldPath = "P16/outputstream/file.txt";
        String newPath = "P16/filecopy/file.txt";
        BufferedReader bufferedReader = new BufferedReader(new FileReader(oldPath));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(newPath, true));
        String line = "";
        while ((line = bufferedReader.readLine()) != null){
            // 注意：读取一行不会读取后面的换行符
            bufferedWriter.write(line);
            bufferedWriter.newLine();
        }
        // 关闭之前可以判断是否为空
        bufferedReader.close();
        bufferedWriter.close();

    }
}
