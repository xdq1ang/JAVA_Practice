package src.P13.treemap;

import java.util.Comparator;
import java.util.TreeMap;

/*
 *   @author : xdqiang
 */
public class TreeMap_ {
    public static void main(String[] args) {
        /*
        * TreeSet底层就是TreeMap。只是Value是一个静态常量的默认值。TreeMap则存储的是键值对
        * 默认构造器按照默认的排序规则（不是添加顺序）
        *
        *
        * */
        TreeMap treeMap = new TreeMap();
        treeMap.put("jack3","杰克3");
        treeMap.put("jack4","杰克4");
        treeMap.put("jack1","杰克1");
        treeMap.put("jack2","杰克2");
        System.out.println(treeMap);
        //按照Key的大小进行排序
        TreeMap treeMap1 = new TreeMap(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                String s1 = (String) o1;
                String s2 = (String) o2;
                return (s1.compareTo(s2));
            }
        });
        treeMap1.put("jack3","杰克3");
        treeMap1.put("jack4","杰克4");
        treeMap1.put("jack1","杰克1");
        treeMap1.put("jack2","杰克2");
        System.out.println(treeMap1);

    }
}
