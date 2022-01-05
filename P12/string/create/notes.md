### String类
字符串字符使用Unicode字符编码，一个字符（不管是字母还是汉字）占两个字节。
String类实现了Serializable接口，可以被串行化。
String类是final类型，不可以被继承，不能被修改（value不能指向新对象，单个字符的内容是可以修改的）。

### String类常用构造方法：
- String s1 = new String();
- String s2 = new String(String original);
- String s3 = new String(char[] a);
- String s4 = new String(char[] a,int startIndex,int count)

### String类创建
- String s1 = "hsp";
- String s2 = new String("hsp");

1. 方式一：先从常量池看是否有“hsp”数据空间，如果有则直接指向，如果没有则重新（在字符串常量池）创建然后指向。s最终指向的是常量池的空间地址。
2. 方式二：先在堆中创建空间，里面维护了value属性，指向字符串常量池的"hsp"空间。如果常量池没有"hsp"则重新创建，如果有则直接通过value指向。最终指向的是堆中的空间地址。

