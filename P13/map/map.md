# Map特点说明
Map存储的是键值对。（其实Set存储的也是的键值对，只不过value存储的是默认值PRENSENT）
1. Map与Collection并列存在。用于保存具有映射关系的数据：key-value
2. Map中的Key和Value可以是任何引用类型的数据，会封装到HashMap$Node对象中
3. Map中的Key不允许重复
4. Map中的Value可以重复
5. Map的Key可以为null，value也可以为null。只能有一个Key为null，可以有多个value为null
6. 常用String类作为Map的Key
7. Key和Value之间存在单向的一对一关系，即通过指定的Key总能找到对应的value