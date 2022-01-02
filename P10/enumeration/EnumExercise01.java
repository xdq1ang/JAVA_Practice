package src.P10.enumeration;

public class EnumExercise01 {
    public static void main(String[] args) {
        Week[] weekList;
        weekList=Week.values();
        for (Week w:
             weekList) {
            System.out.println(w.getName());
        }

    }
}

enum Week{
    MONDAY("星期一"),TUESDAY("星期二"),WENDSDAY("星期三"),THURSDAY("星期四"),FRIDAY("星期五"),SATURDAY("星期六"),SUNDAY("星期天");
    private String name;
    Week(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}