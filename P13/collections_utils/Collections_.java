package src.P13.collections_utils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
/*
 *   @author : xdqiang
 */
public class Collections_ {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add("10");
        arrayList.add("2");
        arrayList.add("352");
        arrayList.add("4");
        arrayList.add("50");
        Collections.reverse(arrayList);
        Collections.shuffle(arrayList);
        Collections.swap(arrayList,0,4);
        System.out.println(arrayList);
        //按照默认比较器返回最大值
        System.out.println(Collections.max(arrayList));
        //返回长度最大的元素
        System.out.println(Collections.max(arrayList, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                return ((String)o1).length()-((String)o2).length();
            }
        }));
        //返回元素出现的频率
        System.out.println(Collections.frequency(arrayList,"4"));
        //拷贝
        ArrayList arrayList1 = new ArrayList();
        //为了完成完整的copy，先给新集合赋值到指定大小.不然会报错
        for (int i = 0; i < 5; i++) {
            arrayList1.add(null);
        }
        Collections.copy(arrayList1,arrayList);
        System.out.println(arrayList1);
        //替换元素
        Collections.replaceAll(arrayList,"50","五十");
        System.out.println(arrayList);
    }
}
