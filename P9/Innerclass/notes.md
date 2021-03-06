### 类的五大成员：
1. 属性
2. 方法
3. 代码块
4. 构造器
5. 内部类

### 内部类简介
可以直接访问私有属性，并且可以体现类与类之间的包含关系。
```
class Outer{       //外部类
    class Inner{   //内部类
    
    }
}
class Other{       //外部其他类
}
```

### 内部类分类
定义在外部类局部位置上（如方法，代码块内）：
1. 局部内部类（有类名）
2. **匿名内部类（没有类名，重点）**

定义在外部类的成员位置上：
1. 成员内部类（没有static修饰）
2. 静态内部类（使用static修饰）

### 局部内部类：
局部内部类是定义在外部类的局部位置**中**，如方法，代码块中。
1. 可以直接使用外部类的所有成员（包括私有）
2. 不能添加修饰符（因为地位就是一个局部变量），可以使用final修饰（因为局部变量是不能使用修饰符的）
3. 作用域：仅仅在定义它的方法或代码块中。
4. 外部类在方法中，可以创建Inner02对象，然后调用方法即可
5. 外部其他类不能访问局部内部类（因为局部内部类地位是一个局部变量）
6. 如果外部类和局部内部类的成员重名时，默认遵循就近原则，如果想访问外部类的成员，则需要指定具体的外部成员（Outer.this.n1,其中Outer.this表示外部类的一个调用了此局部内部类的对象）

### 匿名内部类（重要！！！！！）：
匿名内部类时定义在外部类的局部位置，如方法，代码块中。并且没有类名
1. 类
2. 内部类
3. 没有名字
4. 是一个对象

基本语法：
```
new 类或接口(参数列表){
    类体
        };
```
### 成员内部类：
是定义在外部类的成员位置**上**（属性，方法），**并且没有static修饰**
1. 可以直接访问外部类的所有成员（包含私有）
2. 外部类可以直接访问成员类的所有成员（包括私有）
3. 外部其他类使用成员类
  - Outer08.Inner08 inner08 = outer08.new Inner08();
  - 在外部类写一个方法返回Inner08对象
4. 可以添加任意访问修饰符（public protected 默认 private）。因为它的地位就是一个成员。
5. 作用域是外部类的类体中
6. 外部类和内部类的成员重名时，内部类访问的画默认遵循就近原则，如果想访问外部类的成员，则可以使用（外部类名.this.成员）访问

### 静态内部类：
1. 定义在成员位置，有static修饰
2. 只能访问静态外部成员(包括私有)
3. 可以用修饰符（因为它就是外部类的一个成员）
4. 作用域是整个外部类类体
5. 外部其他类访问静态成员类：
  - Outer10.Inner10 inner10 = new Outer10.Inner10();
  - 编写一个方法可以返回静态成员类实例(new Inner10();)
6. 如果外部类和静态内部类成员重名时，静态内部类访问时遵循就近原则。如果想访问外部成员则可以使用（外部类名.成员）访问。不用加this,因为静态成员是类成员。
