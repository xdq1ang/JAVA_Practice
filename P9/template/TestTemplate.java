package src.P9.template;


/*
* 有多个类，完成不同的任务Job
* 要求统计各自完成任务的时间
*
*
* */
public class TestTemplate {
    public static void main(String[] args) {
        new AA().calculateTime();

    }
}

abstract class Template{
    public void calculateTime(){
        long start = System.currentTimeMillis();
        job();
        long end = System.currentTimeMillis();
        long time = end - start;
        System.out.println("执行时间："+time);
    }
    public abstract void job();
}

class AA extends Template{

    @Override
    public void job() {
        long sum=0;
        for(int i=1;i<=10000;i++){
            sum+=i;
        }
    }
}
