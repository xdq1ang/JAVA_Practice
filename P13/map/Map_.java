package src.P13.map;

import java.util.HashMap;
import java.util.Map;

/*
 *   @author : xdqiang
 */
public class Map_ {
    public static void main(String[] args) {
        /*
        * Map接口实现类的特点演示
        *
        *
        * */
        Map map = new HashMap();
        //1.存放双列元素
        //2.key不允许重复（会替换掉已有数据）
        //3.value可以重复
        //4.key和value可以为空。但是只能有一个key可以为空(会替换已有的数据)
        //5.常用字符串作为Key
        map.put("01",22);
        map.put("01",23);
        map.put("02",23);
        map.put(null,null);
        map.put(null,133);

        System.out.println(map);
        System.out.println(map.get(null));
    }
}
