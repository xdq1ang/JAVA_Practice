package P6;

import java.util.Arrays;

public class EightQueens {
    public static void main(String[] args) {
        int[] map = new int[]{0,4,7,5,2,6,1,-1};
        System.out.println(Qu.V(map,7,3));
    }
    //棋盘大小8x8
    //不能在同一行：（期盼设计为一维数组会自动避免此问题）
    //不能在同一列：一维数组的值不能相同
    //不能在同一斜线：

    //-1代表未操作
    //0-7代表皇后的位置
}
class Qu{
    public static boolean V(int[] map,int i,int j){
        //判断是否在同列
        for(int o:map){
            if(o==j){
                System.out.println("同一列");
                return false;
            }
        }
        //判断是否在同行
        for(int m=0;m<i;m++){
            if(map[m]+(i-m)==j){
                System.out.println(map[m]);
                System.out.println("同斜线");
                return false;
            }
        }
        return true;
    }

}
