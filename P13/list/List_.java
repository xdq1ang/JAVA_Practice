package src.P13.list;

import java.util.ArrayList;
import java.util.List;

/*
 *   @author : xdqiang
 */
public class List_ {
    public static void main(String[] args) {
        //1. List是有序的
        List list = new ArrayList();
        list.add("xdqiang");
        list.add("CL");
        list.add("WH");
        list.add("YYY");
        //2. 元素可以重复
        list.add("YYY");
        for (Object o :list) {
            System.out.println(o);
        }
        //3. List集合每个元素都有其对象的顺序索引，即支持索引
        //4. List的实现子类很多（Vector，ArrayList，linkedList...）




    }
}
