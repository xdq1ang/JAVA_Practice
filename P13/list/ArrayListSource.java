package src.P13.list;

import java.util.ArrayList;

/*
 *   @author : xdqiang
 */
public class ArrayListSource {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        for (int i = 0; i <= 10; i++) {
            list.add(i);
        }
        for (int i = 11; i <=15 ; i++) {
            list.add(i);
        }
        list.add(100);
        list.add(200);
        list.add(null);
        //指定初始大小，直接创建指定大小数组，不够则扩容至1.5倍
        ArrayList list1 = new ArrayList(8);


    }
}
