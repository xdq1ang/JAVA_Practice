### 接口使用细节
注意：
1. 在jdk7.0前  接口里所有的方法都没有方法体
2. 在jdk8.0后接口可以有静态方法，默认方法，也就是接口中可以有方法的具体实现
3. 接口不能被实例化
4. 接口中所有的方法是public方法（可以省略）
5. 接口中的属性只能是final，而且是public static final修饰（全局常量）
6. 接口的修饰符只能是public 和 default（与类修饰符一样）
7. abstract可以省略
8. 实现接口就必须实现所有方法
9. 抽象类继承接口的话可以不用实现方法
10. 一个类可以同时实现多个接口 
11. 接口不能继承其他类，但是可以继承多个别的接口
12. **接口与接口之间是继承关系，接口与类之间是实现关系**

```
interface ID{//public/default
    int n=200;//public static final
    void hi();//public
}
```

接口中的方法总结：
- 抽象方法
- 静态实现方法
- (default)方法


接口可以实现代码解耦


### 接口多态
1. 接口可以体现多态参数
2. 实现接口的类可以向上转型
3. 接口数组（多态）
4. 接口存在多态传递
```
public void work(UsbInterface UsbInterface){
}
```

```
public class InterfacePolyPass{
    public static void main(String[] args){
        IG ig = new Teacher();
        IH ih = new Teacher();
    }
}

interface IH{}
interface IG extends IH{}
calss Teacher implements IG{

}

```
