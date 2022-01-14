package src.P13.map;

import java.util.HashMap;
import java.util.Objects;

/*
 *   @author : xdqiang
 */
public class HashMapSource2 {
    public static void main(String[] args) {
        HashMap hashMap = new HashMap();
        for (int i = 0; i < 100; i++) {
            //注意：HashMap存储位置是以key决定的
            hashMap.put(new A(i),i);
        }
        System.out.println(hashMap);

    }
}

class A{
    private int num;

    public A(int num) {
        this.num = num;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        A a = (A) o;
        return num == a.num;
    }

    @Override
    public int hashCode() {
        return 100;
    }

    @Override
    public String toString() {
        return "A{" +
                "num=" + num +
                '}';
    }
}