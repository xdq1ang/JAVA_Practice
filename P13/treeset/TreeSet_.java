package src.P13.treeset;

import java.util.Comparator;
import java.util.TreeSet;

/*
 *   @author : xdqiang
 */
public class TreeSet_ {
    public static void main(String[] args) {
        /*
        * 1.当使用无参数构造器创建TreeSet时仍然是无序的
        * 2.希望添加元素时按照字符串大小来排序（new TreeSet(Comparator)），传入的比较器给到了底层的TreeMap的comparator属性
        * 3.
        *
        * */
        TreeSet treeSet = new TreeSet();
        treeSet.add("jack1");
        treeSet.add("jack2");
        treeSet.add("jack3");
        treeSet.add("jack4");
        treeSet.add("jack5");
        treeSet.add("jack6");
        System.out.println(treeSet);
        //按照字符串长度排序
        TreeSet treeSet1 = new TreeSet(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                String s1 = (String) o1;
                String s2 = (String) o2;
                return s1.length() - s2.length();
            }
        });
        treeSet1.add("jack");
        treeSet1.add("jack1");
        treeSet1.add("jack11");
        treeSet1.add("jack111");
        treeSet1.add("jack112");//这个加不进去，因为comparator是以长度进行查找存储位置的，如果存在相同长度元素则不会添加
        System.out.println(treeSet1);
    }
}
