package src.P13.map;

import java.util.*;

/*
 *   @author : xdqiang
 */
public class MapErgodic {
    /*
    * Map遍历：
    * 通过KeySet或者values遍历
    *
    * */

    //keySet()把所有的键都取出来
    //values()把所有的values都取出来

    public static void main(String[] args) {
        Map map = new HashMap();
        map.put("1","A");
        map.put("2","B");
        map.put("3","C");
        map.put("4","D");
        map.put("5","E");
        Set keySet = map.keySet();
        //取回的值属于Set类型：
        //1.可以通过增强for遍历
        //2.可以通过迭代器遍历
        //3.注意：不能通过索引取元素，因为没有索引


        //一：通过key遍历
        //(1)增强for
        for (Object o :keySet) {
            System.out.println(map.get(o));
        }
        //(2)迭代器
        Iterator iterator = keySet.iterator();
        while (iterator.hasNext()) {
            Object next =  iterator.next();
            System.out.println(map.get(next));
        }

        //二：通过value遍历
        //遍历value
        //(1)
        Collection values = map.values();
        for (Object o :values) {
            System.out.println(o);
        }
        //(2)
        Iterator iterator1 = values.iterator();
        while (iterator1.hasNext()) {
            Object next = iterator1.next();
            System.out.println(next);
        }

        //三：通过EntrySet遍历
        Set entrySet = map.entrySet();
        for (Object o :entrySet) {
            //转成Map.Entry对象
            Map.Entry m = (Map.Entry)o;
            System.out.println(m.getValue());
        }
        Iterator iterator2 = entrySet.iterator();
        while (iterator2.hasNext()) {
            Object next =  iterator2.next();
            System.out.println(((Map.Entry)next).getValue());
            
        }


    }
}
