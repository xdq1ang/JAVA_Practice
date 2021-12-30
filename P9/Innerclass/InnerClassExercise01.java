package src.P9.Innerclass;


/*
* 匿名内部类作为参数
*
*
* */
public class InnerClassExercise01 {
    public static void main(AA a) {
        //匿名内部类作为参数直接传递
        f1(new AA(){
            @Override
            public void show() {
                System.out.println("这是一副画");
            }
        });

    }
    //形参是接口类型
    public static void f1(AA a){
        a.show();
    }

}
interface AA{
    void show();
}

