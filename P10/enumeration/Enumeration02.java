package src.P10.enumeration;

/*
 *   @author : xdqiang
 */
/*
 * 枚举是一组常量的集合
 * 可以理解为：枚举属于一种特殊的类，里面只包含一组有限的特定的对象
 * 1.自定义枚举
 * 2.系统关键字enum
 *
 *
 * */

public class Enumeration02 {
    public static void main(String[] args) {
        System.out.println(SeasonEnum.AUTUMN);
        System.out.println(SeasonEnum.SPRING);

    }
}

//自定义枚举
//1. 构造器私有化
//2. 去掉setter(),防止属性被修改
//3. 在类内部直接创建固定的对象(public static final)
class SeasonEnum {
    private final String name;
    private final String desc;
    public static final SeasonEnum SPRING = new SeasonEnum("春天", "温暖");
    public static final SeasonEnum SUMMER = new SeasonEnum("夏天", "炎热");
    public static final SeasonEnum AUTUMN = new SeasonEnum("秋天", "凉爽");
    public static final SeasonEnum WINTER = new SeasonEnum("冬天", "寒冷");
    private SeasonEnum(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }
    public String getName() {
        return name;
    }
    public String getDesc() {
        return desc;
    }

    @Override
    public String toString() {
        return "SeasonEnum{" +
                "name='" + name + '\'' +
                ", desc='" + desc + '\'' +
                '}';
    }
}


