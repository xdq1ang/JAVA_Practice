# String, StringBuffer, StringBuilder 
1. StringBuilder和StringBuffer非常类似，均代表可变的字符序列，而且方法也一样
2. String：不可变字符序列，效率低，但是复用率高。
3. StringBuffer：可变字符序列，效率较高（增删），线程安全。
4. StringBuilder：可变字符序列，效率较高，线程不安全

注意：
如果对String做大量修改不建议使用String，建议使用StringBuilder或者StringBuffer

# 效率：
StringBuilder > StringBuffer > String

# 使用原则
1. 字符串存在大量修改，用StringBuffer或StringBuilder
2. 字符串存在大量修改，并是在单线程情况下用StringBuilder
3. 字符串存在大量修改，并在多线程情况下用StringBuffer
4. 字符串存在少量修改，被多个对象引用，使用String，比如配置信息


# 总结：
string s = "xdqiang"
- 如果池中已存在,则直接指向
- 如果池中不存在，则在池中创建再指向

String s = new String("xdqiang")
- 每次运行都会在堆中创建对象，然后在池中创建字符串。对象中的value数组会指向池中的字符串。
