package src.P12.string.create;

/*
 *   @author : xdqiang
 */
public class StringCreate08 {
        String str = new String("hsp");
        final char[] ch = {'j','a','v','a'};
        public void change(String str,char ch[]){
            //这里的str是新建的局部变量，运行完后会被销毁
            str = "java";
            ch[0] = 'h';
        }

    public static void main(String[] args) {
        StringCreate08 ex = new StringCreate08();
        ex.change(ex.str,ex.ch);
        System.out.println(ex.str+"and");  //javaand
        System.out.println(ex.ch);         //hava
    }


}
