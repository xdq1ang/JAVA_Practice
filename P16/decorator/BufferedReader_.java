package src.P16.decorator;

public class BufferedReader_ extends Reader_{
    private Reader_ reader_;

    public BufferedReader_(Reader_ reader_) {
        this.reader_ = reader_;
    }

    // 让方法更加灵活， 多次读取文件, 或者加缓冲区
    public void readFiles(int num){
        for (int i = 0; i < num; i++) {
            reader_.readFile();
        }
    }
    public void readStrings(int num){
        for (int i = 0; i < num; i++) {
            reader_.readString();
        }
    }
}
