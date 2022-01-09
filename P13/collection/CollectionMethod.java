package src.P13.collection;

import java.util.ArrayList;
import java.util.List;

/*
 *   @author : xdqiang
 */
public class CollectionMethod {
    public static void main(String[] args) {
        //接口不能直接实例化，以ArrayList为例
        List list1 = new ArrayList();
        list1.add("jack");
        list1.add(100);//list存放的是object，会把基本数据自动装箱
        list1.add(true);
        list1.add("xdqiang");
        list1.add("ffffc");
        System.out.println("list1 = "+list1);
        list1.remove("jack");
        list1.remove((Integer)100);//要删除包装类
        list1.remove(0);
        System.out.println("list1 = "+list1);
        System.out.println(list1.contains("xdqiang"));
        System.out.println(list1.isEmpty());
        //list1.clear();//清空所有数据
        System.out.println(list1);
        list1.addAll(list1);//添加多个元素
        System.out.println(list1);
        System.out.println(list1.containsAll(list1));//判断多个元素是否存在
        list1.removeAll(list1);//删除多个元素
        System.out.println(list1);




    }
}
