package src.p15;

/*
 *   @author : xdqiang
 */
public class NumCpu {
    public static void main(String[] args) {
        Runtime runtime = Runtime.getRuntime();
        int i = runtime.availableProcessors();
        System.out.println("可用处理器数量："+i);
    }
}
