package src.P12.homework;

/*
 *   @author : xdqiang
 */
public class Homework01 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("123456789");
        System.out.println("old String:"+sb);
        try{
            Util.reverseString(sb,0,5);
            System.out.println("new String:"+sb);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
class Util{
    public static void reverseString(StringBuilder sb, int index1, int index2) throws Exception {
        if(!(sb!=null && index1>=0 && index2<sb.length())){
            throw new Exception("下标越界");
        }

        //取出子串
        String subStr=sb.substring(index1,index2);
        //子串转化为字符数组
        char[] chr = subStr.toCharArray();
        //数组逆置
        int mid = chr.length/2;
        char tmp=' ';
        for (int i = 0; i < mid; i++) {
            tmp=chr[i];
            chr[i]=chr[chr.length-1-i];
            chr[chr.length-1-i]=tmp;
        }
        //把数组元素拼接成String
        String chr1="";
        for (char c:
             chr) {
            chr1+=c;
        }
        //用逆置后的子串替换原来的字串
        sb.replace(index1,index2,chr1);
    }
}
