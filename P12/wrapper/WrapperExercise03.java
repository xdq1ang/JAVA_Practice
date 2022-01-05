package src.P12.wrapper;

/*
 *   @author : xdqiang
 */
public class WrapperExercise03 {
    public static void main(String[] args) {

        Integer i1 = new Integer(127);
        Integer i2 = new Integer(127);
        System.out.println(i1==i2);//false    new出来的一定是不同对象

        Integer i3 = new Integer(128);
        Integer i4 = new Integer(128);
        System.out.println(i3==i4);//false    new出来的一定是不同对象

        Integer i5 = 126;
        Integer i6 = 126;
        System.out.println(i5==i6);//true     valueOf()

        Integer i7 = 128;
        Integer i8 = 128;
        System.out.println(i7==i8);//false

        Integer i9 = 127;    //valueOf()
        Integer i10 = new Integer(127);
        System.out.println(i9==i10);  // false

        Integer i11 = 127;     //valueOf()
        int i12 = 127;
        System.out.println(i11==i12);//只要含有基本数据类型，==判断的就是值

        Integer i13 = 128;
        int i14 = 128;
        System.out.println(i13==i14);//只要含有基本数据类型，==判断的就是值


    }
}
