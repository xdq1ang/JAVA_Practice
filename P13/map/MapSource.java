package src.P13.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
 *   @author : xdqiang
 */
public class MapSource {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put("01","xdqiang");
        map.put("02","xdqiang");
        Set set = map.entrySet();
        System.out.println(set.getClass());
        for (Object o :set) {
            System.out.println("entrySet存放的数据运行类型是"+o.getClass());
            System.out.println(((Map.Entry)o).getValue());
        }

        // 1. k-v最后是存放在 HashMap$Node node = newNode(hash,key,value,null)
        // 2. k-v为了方便程序员遍历(因为Entry提供了getKey(),getValue()方法)，还会创建EntrySet集合，存放的元素类型是Entry，一个Entry对象就有k,v
        // 3. 在entrySet中定义的类型是Map.Entry,但是实际上还是存放的是HashMap$Node(实现了Map.Entry接口)

        map.put(new Car(),new Person());
        Set set1 = map.keySet();
        Collection values = map.values();


    }
}
class Car{

}
class Person{

}
