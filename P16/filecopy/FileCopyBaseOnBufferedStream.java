package src.P16.filecopy;

import java.io.*;

public class FileCopyBaseOnBufferedStream {
    // 对视频进行拷贝（使用缓冲流）
    public static void main(String[] args) throws IOException {
        String oldPath = "P16/filecopy/infinity-23429683.jpg";
        String newPath = "P16/filecopy/infinity-23429683-copy.jpg";
        BufferedInputStream oldFile = new BufferedInputStream(new FileInputStream(oldPath));
        BufferedOutputStream newFile = new BufferedOutputStream(new FileOutputStream(newPath));
        byte[] bytes = new byte[20];
        int readLen = 0;
        while((readLen = oldFile.read(bytes,0,bytes.length)) != -1){
            newFile.write(bytes,0,readLen);
        }
        oldFile.close();
        newFile.close();
        // 字节流可以处理二进制文件，字符文件（但是如果分段读取的字节转化为字符串时可能会产生乱码）
        // 字符流只能处理字符文件，但是不能处理二进制文件（会造成文件损坏）


    }
}

