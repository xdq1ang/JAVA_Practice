package src.P13.map;

import java.util.HashMap;
import java.util.Map;

/*
 *   @author : xdqiang
 */
public class MapMethod {
    public static void main(String[] args) {
        //常用方法
        Map map = new HashMap();
        map.put("xdqiang","CL");
        map.put("aaa","AA");
        System.out.println(map);
        map.remove("aaa");
        System.out.println(map);
        System.out.println(map.get("xdqiang"));
        System.out.println(map.size());
        System.out.println(map.isEmpty());
        System.out.println(map.containsKey("xdqiang"));


    }
}
