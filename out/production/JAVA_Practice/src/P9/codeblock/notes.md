代码块又称**初始化块**，属于类中的成员【即  是类的一部分】，类似方法，将逻辑语句封装在方法体中通过{}包围起来。
但是又和方法不同：
- 没有方法名
- 没有返回
- 没有参数
- 只有方法体
- 不通过对象或类显示调用，是在**加载类时或创建对象时隐式调用**

基本语法：
```
[修饰符]{
    代码
}
```

注意：
1. 修饰符可选。有static或无。
  - 静态代码块
  - 非静态代码块
2. 逻辑语句可以是任何逻辑语句（输入，输出，方法调用，循环，判断等）
3. ；可以写上也可以省略


代码块的好处
1. 是另一种形式的构造器（对构造器的补充机制），可以做初始化的操作
2. 如果多个构造器中都有重复的语句，可以抽取到初始化块中提高代码的重用性
3. 代码块的运行优先于构造器



## 代码块使用细节1
### 执行
1. 静态代码块随着**类加载执行**，只会执行一次
2. 普通代码块随着对象的创建执行，每次创建对象都会执行。

### 什么时候加载？
1. 创建对象实例时，非静态代码块会每次执行，静态代码块可能会被执行（类首次加载时会执行）
2. 创建子类对象实例，父类也会被加载。非静态代码块会每次执行，静态代码块可能执行（类首次加载时会执行）
3. 直接使用类的静态成员时（静态属性，静态方法），静态代码块会被执行。

## 代码块使用细节2
创建一个对象时，在一个类调用顺序是：
1. 调用静态代码块和静态属性初始化（注意：静态代码块和静态属性初始化调用的优先级一样，如果有多个静态代码块和多个静态变量初始化，则按照它们定义的顺序调用）
2. 调用的普通代码块和普通属性初始化（注意：普通代码块和普通顺序初始化调用的优先级一样，如果有多个普通代码块和多个普通属性初始化，则按照定义顺序调用）
3. 调用代码块和属性初始化之后，再调用构造方法。

## 代码块使用细节3
构造器的最前面其实隐含了super()和调用普通代码块，静态相关的代码块，属性初始化，在类加载时就执行完毕，因此是优先于构造器和普通代码块执行的。
调用super()时会先执行父类的代码块
- 静态代码块只能调用静态成员
- 普通代码块可以调用静态/非静态成员。

## 代码块使用细节4
创建一个子类时，它们的静态代码块，静态属性初始化，普通代码块，普通属性初始化，构造方法的调用顺序如下
1. 父类的静态代码块和静态属性（优先级一样，按照定义顺序执行）
2. 子类的静态代码块和静态属性（优先级一样，按照定义顺序执行）
3. 父类的普通代码块和普通属性（优先级一样，按照定义顺序执行）
4. 父类的构造方法
5. 子类的普通代码块和普通属性（优先级一样，按照定义顺序执行）
6. 子类构造方法


例子：
1. 先进行类加载： 
   1. 加载父类(执行父类静态代码块或静态属性初始化) 
   2. 加载子类(执行子类静态代码块或静态属性初始化)
2. 父类普通代码块和普通属性初始化
3. 父类构造器
4. 子类普通代码块和普通属性初始化
5. 子类构造器
