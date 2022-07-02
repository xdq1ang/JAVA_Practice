package src.P16.decorator;

public class Test {
    public static void main(String[] args) {
        BufferedReader_ bufferedReader_ = new BufferedReader_(new FileReader_());
        bufferedReader_.readFiles(10);
        bufferedReader_.readStrings(10);
        System.out.println("---------------");
        BufferedReader_ bufferedReader2_ = new BufferedReader_(new StringReader());
        bufferedReader2_.readFiles(10);
        bufferedReader2_.readStrings(10);

    }
}
