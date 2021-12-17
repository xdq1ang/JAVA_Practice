package P7;

public class Homework02 {
    public static void main(String[] args) {
        String[] s = new String[]{"1","2","1"};
        System.out.println(A02.find(s,"1"));

    }
}

class A02{
    public  static String find(String[] s,String s1){
        String INDEX="";
        for(int index=0;index<s.length;index++){
            if(s[index].equals(s1)){
                INDEX=INDEX+" "+index;
            }

        }
        if(INDEX.equals("")){
            return "-1";
        }else {
            return INDEX;
        }
    }
}
