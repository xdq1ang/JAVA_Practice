package src.P13.map;

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
            System.out.println((Map.Entry)o);
        }

        // 1. k-v最后是存放在 HashMap$Node node = newNode(hash,key,value,null)
        // 2. k-v为了方便程序员遍历，还会创建EntrySet集合，存放的元素类型是Entry，一个Entry对象就有k,v

    }
}
