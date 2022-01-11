package src.P13.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/*
 *   @author : xdqiang
 */
public class SetMethod {
    public static void main(String[] args) {
        /*
        * 1.元素不能重复
        * 2.存放元素无序(但是顺序是固定的)
        * 3.可以添加null
        *
        * */
        Set set = new HashSet();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add("john");
        set.add("john");
        set.add(null);
        set.add(null);
        System.out.println(set);
        //Set遍历
        //1.迭代器遍历
        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            Object next =  iterator.next();
            System.out.println(next);
        }
        //2.增强for(本质上使用的是迭代器)
        for (Object o :set) {
            System.out.println(o);
        }
        //3.Set不能通过索引来获取
        //删除元素
        set.remove(null);
        System.out.println(set);



    }
}
