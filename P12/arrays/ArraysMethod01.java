package src.P12.arrays;

import java.util.Arrays;
import java.util.Comparator;

/*
*   @author : xdqiang
*/
public class ArraysMethod01 {
    public static void main(String[] args) {
        Integer[] integers = {111,20,90,-10};
        for(int i = 0;i<integers.length;i++){
            System.out.println(integers[i]);
        }
        //
        System.out.println(Arrays.toString(integers));
        //排序
        Arrays.sort(integers);
        //实现Comparator()接口
        Arrays.sort(integers, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                Integer i1 = (Integer)o1;
                Integer i2 = (Integer)o2;

                return i2-i1;
            }
        });
        System.out.println(Arrays.toString(integers));

        //copyOf()数组元素的复制
        Integer[] integers2 = Arrays.copyOf(integers,integers.length+1);
        System.out.println(Arrays.toString(integers2));
        //fill()填充数组
        //equals()比较数组内容是否一致
        //asList()转化为list
        System.out.println(Arrays.asList(integers).getClass());

    }
}
