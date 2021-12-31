### 自定义枚举
1. 构造器私有化
2. 不需要提供setter()方法，可以提供getter()。
3. 类内部直接创建对象。对枚举对象/属性使用public static final修饰，实现底层优化。
4. 枚举对象名大写（表示常量）
5. 枚举对象根据需要也可以设置多个属性

### 使用enum关键字创建枚举类
使用enum关键字实现枚举类
1. enum替代class
2. public static final Season SPRING = new Season("春天","温暖")直接用SPRING("春天","温暖")。多个之间用逗号隔开
3. 枚举对象必须放在类的开头