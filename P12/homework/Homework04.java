package src.P12.homework;

import java.io.OutputStream;

/*
 *   @author : xdqiang
 */
public class Homework04 {
    public static void main(String[] args) {
        StringCount("ffHSDFH454shsdf5h45sdfGSFG");

    }
    public static void StringCount(String s){
        int cntUpper=0;
        int cntLower=0;
        int cntNum=0;
        char[] chr = s.toCharArray();
        for (char c:
             chr) {
            if(c>='A' && c<='Z'){
                cntUpper++;
            }else if(c>='a' && c<='z'){
                cntLower++;
            }else if(c>='0' && c<='9'){
                cntNum++;
            }
        }
        String output = String.format("大写字母：%d\n小写字母：%d\n数字：%d",cntUpper,cntLower,cntNum);
        System.out.println(output);
    }
}

