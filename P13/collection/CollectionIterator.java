package src.P13.collection;

import java.util.ArrayList;
import java.util.Iterator;

/*
 *   @author : xdqiang
 */
public class CollectionIterator {
    public static void main(String[] args) {
        //Collection的实现类有迭代器功能
        ArrayList arrayList = new ArrayList();
        arrayList.add("xxxx");
        arrayList.add("dddd");
        arrayList.add("qqqq");
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next =  it.next();
            System.out.println(next);
        }
        //当退出while循环后，这是iterator指向了最后的元素，再执行.next()会抛出异常
        //如果希望再次遍历需要重置迭代器

        //增强for
        for (Object s: arrayList) {
            System.out.println(s);
        }


    }
}
