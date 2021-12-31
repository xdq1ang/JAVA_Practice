package src.P10.enumeration;

/*
 *   @author : xdqiang
 */
public class Enumeration01 {
    public static void main(String[] args) {
        Season spring = new Season("春天", "温暖");
        Season summer = new Season("夏天", "炎热");
        Season autumn = new Season("秋天", "凉爽");
        Season winter = new Season("冬天", "寒冷");


    }
}
class Season{
    private String name;
    private String desc;

    public Season(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}

/*
* 枚举是一组常量的集合
* 可以理解为：枚举属于一种特殊的类，里面只包含一组有限的特定的对象
* 1.自定义枚举
* 2.系统关键字
*
*
* */
