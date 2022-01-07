package src.P12.system;

import java.util.Arrays;

/*
 *   @author : xdqiang
 */
public class systemMethod {
    public static void main(String[] args) {
        /*
        * 1. exit()退出当前程序
        * 2. arrayscopy()完成复制数组
        * 3. currentTimeMillens()返回当前时间距1970-1-1的毫秒数
        * 4. gc()  运行垃圾回收机制
        * */

        //获取当前时间距离1970-1-1的毫秒数，计算时间间隔
        long time1 = System.currentTimeMillis();
        long time2 = System.currentTimeMillis();
        System.out.println(time2-time1);
        //退出程序，0表示正常状态
        //System.exit(0);
        //数组拷贝
        int[] arr = {1,2,3};
        int[] arr1 = new int[3];
        System.out.println(Arrays.toString(arr1));
        System.arraycopy(arr,0,arr1,0,3);
        System.out.println(Arrays.toString(arr1));

    }
}
