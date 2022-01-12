package src.P13.set;

import java.util.HashSet;
import java.util.Objects;

/*
 *   @author : xdqiang
 */
public class HashSetSource {
    public static void main(String[] args) {
        HashSet hashSet = new HashSet();
        System.out.println(hashSet.add("java"));
        System.out.println(hashSet.add("php"));
        System.out.println(hashSet.add("java"));
        System.out.println(hashSet);

        //table扩容机制演示
        HashSet hashSet1 = new HashSet();
        for (int i = 0; i < 100; i++) {
            hashSet1.add(i);
        }
        //树化演示
        HashSet hashSet2 = new HashSet();
        for (int i = 0; i < 100; i++) {
            hashSet2.add(new A(i));
        }

    }
}

class A{
    private int n;

    public A(int n) {
        this.n = n;
    }

    @Override
    public int hashCode() {
        return 100;//人为设置返回的哈希值一样，使得所有元素在table中存放的位置相同
    }
}
