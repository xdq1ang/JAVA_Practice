package src.P16.properties;


import java.io.*;
import java.util.Properties;

// 演示   Properties类来读取配置文件
public class Properties_ {
    public static void main(String[] args) throws IOException {
        // 创建Properties对象
        Properties properties = new Properties();
        // 加载指定配置文件
        String path = "P16/properties/mysql.properties";
        properties.load(new FileReader(path));
        // 显示键值对到标准输出
        properties.list(System.out);
        // 根据key获取值
        String name = properties.getProperty("name");
        String pwd = properties.getProperty("pwd");
        System.out.println("name : "+ name + " pwd : "+pwd);

        // 添加key-value到新文件
        String newPath = "P16/properties/createMysql.properties";
        Properties properties1 = new Properties();
        properties1.setProperty("charSet","utf-8");
        properties1.setProperty("user","xdqiang相当");
        // setProperty时，存在则修改，不存在则创建
        properties1.setProperty("user","xdqiang");
        properties1.store(new FileOutputStream(newPath),"good");


    }
}
