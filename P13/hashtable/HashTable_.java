package src.P13.hashtable;

import java.util.Hashtable;

/*
 *   @author : xdqiang
 */
public class HashTable_ {
    public static void main(String[] args) {
        Hashtable hashtable = new Hashtable();
        hashtable.put("john",100);
        // hashtable.put("john",null);
        // hashtable.put(null,20);
        hashtable.put("lic1",100);
        hashtable.put("lic2",88);
        hashtable.put("lic3",88);
        hashtable.put("lic4",88);
        hashtable.put("lic5",88);
        hashtable.put("lic6",88);
        hashtable.put("lic7",88);
        hashtable.put("lic8",88);
        hashtable.put("lic9",88);
        hashtable.put("lic10",88);
        hashtable.put("lic11",88);
        /*
        * 1.hashtable底层是一个数组hashtable$Entry[],初始化大小为11
        * 2.threshold = 8 = 11*0.75  到达临界值会扩容
        *
        *
        *
        *
        * */

    }
}
