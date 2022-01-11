package src.P13.set;

import java.util.HashSet;

/*
 *   @author : xdqiang
 */
public class HashSetSource {
    public static void main(String[] args) {
        HashSet hashSet = new HashSet();
        hashSet.add("java");
        hashSet.add("php");
        hashSet.add("java");
        System.out.println(hashSet);
    }
}
