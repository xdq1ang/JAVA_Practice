### 继承的本质
当子类对象创建好之后，建立子类于父类的查找的关系

```Java
package src.P8;

public class ExtendsTheory {
    public static void main(String[] args) {
        Son son = new Son();
        //按照查找关系返回信息
        //（1）先看子类是否有此属性且可以访问，则返回
        //（2）如果子类没有，则看看父类有没有这个属性（如果父类有，且可以访问，就返回信息）
        //（2）...
        System.out.println(son.getHobby());
        //如果没有权限访问，可以通过公有的方法访问。

    }
}
class GrandPa{
    String name="大头爷爷";
    private String hobby="旅游";
    public String getHobby(){
        return this.hobby;
    }
}
class Father extends GrandPa{
    String name = "大头爸爸";
    int age = 39;
}
class Son extends Father{
    String name = "大头儿子";
}


```

内存分析图：

![内存分析图](https://gitee.com/xdqiang/picbed/raw/master/imgOfBlog/image-20211210112529299.png)

### 继承练习

```Java
package src.P8;

public class ExtendsExercise01 {
    public static void main(String[] args) {
        B b = new B();
        // a
        // b name
        // b
    }
}
class A{
    A(){
        System.out.println("a");
    }
    A(String name){
        System.out.println("a name");
    }
}
class B extends A{
    B(){
        this("abc");//含有this就没有super了,只能调用一个构造器
        System.out.println("b");
    }
    B(String name){
        //super();
        //子类会默认调用父类的无参构造器super()
        System.out.println("b name");
    }
}
```

子类构造器如果没有显示调用父类构造器，子类会默认调用父类无参数构造器

### 重载和重写

![image-20211210155652224](https://gitee.com/xdqiang/picbed/raw/master/imgOfBlog/image-20211210155652224.png)

### 多态

方法的多态：方法的重载重写

对象的多态性

- 一个对象的编译类型和运行类型可以不一致
- 编译类型在定义对象时就确定了不能再改变
- 运行类型是可以变化的
- 编译类型看定义时=的左边，运行类型看=的右边

向上转型后

- 子类和父类都会存在，子类方法会覆盖父类方法
- 可以调用转型后的类所有变量及方法（需要遵守访问权限），可以调用子类中重写的方法，不能调用子类中特有的方法。
- 能调用哪些成员取决于编译，最终的执行效果取决于子类的实现

向下转型

- 语法：子类类型 引用名 = （子类类型）父类引用
- 只能强转父类的引用，不能转父类对象
- **要求的父类的引用必须原本指向的就是当前待转换的目标类型的对象**。（向上转型后的对象才可以向下转型）
- 可以调用子类类型中所有的成员

![image-20211210214045374](https://gitee.com/xdqiang/picbed/raw/master/imgOfBlog/image-20211210214045374.png)

注意：向上转型之后，重写的方法操作的数据是子类的数据

### 动态绑定

```Java
package src.P8.dynamicbinding;

public class DynamicBinding {
    public static void main(String[] args) {
        A a = new B();
        System.out.println(a.sum());//40
        System.out.println(a.sum1());//30

    }
}
class A{
    public int i = 10;
    public int sum(){
        return sum1()+10;
    }
    public int sum1(){
        return i+10;
    }
    public int getI(){
        return i;
    }

}
class B extends A{
    public int i = 20;
//    public int sum(){
//        return i+20;
//    }
    public int getI(){//会覆盖父类中的方法
        return i;
    }
    public int sum1(){//会覆盖父类中的方法
        return i+10;
    }

}
```

注意：

- 方法属于哪个类，其操作的成员变量就是哪个类的
- 父类中的方法会被子类中重写的方法覆盖掉
