package src.P10.enumeration;

/*
 *   @author : xdqiang
 */


public class Enumeration03 {
    public static void main(String[] args) {
        System.out.println(SeasonEnum.AUTUMN);
        System.out.println(SeasonEnum.SPRING);

    }
}
//使用enum关键字实现枚举类
/*
* 1. enum替代class
* 2. public static final Season SPRING = new Season("春天","温暖")直接用SPRING("春天","温暖")。多个之间用逗号隔开
* 3. 枚举对象必须放在类的开头
* */
enum SeasonEnum03 {
    SPRING("春天","温暖"),SUMMER("夏天","炎热");
    private String name;
    private String desc;

    private SeasonEnum03(String name, String desc) {
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


