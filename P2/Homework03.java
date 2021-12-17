package P2;

public class Homework03 {
    public static void main(String[] args) {
    String bookName1 = "百年孤独";
    String bookname2 = "三体";
    String bookname3 = bookName1+bookname2;
    System.out.println(bookname3);//字符串的相加是拼接
    char c1 = '男';
    char c2 = '女';
    System.out.println(c1+c2);//字符相加的本质是码值相加

    double p1 = 123.60;
    double p2 = 125.01;
    System.out.println(p1+p2);
    }

}
