package src.P13.properties;

import java.util.Properties;

/*
 *   @author : xdqiang
 */
public class Properties_ {
    public static void main(String[] args) {
        Properties properties = new Properties();
        //Properties继承了Hashtable，故键和值不能为null
        properties.put("xdqiang",100);
        properties.put("xdqiang1",101);
        properties.put("xdqiang2",102);
        properties.put("xdqiang3",103);
        properties.put("xdqiang4",104);
        System.out.println(properties);

        //通过key取值
        System.out.println(properties.get("xdqiang"));
        properties.remove("xdqiang");
        System.out.println(properties);

    }
}
