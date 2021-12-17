package src.P6;

public class MiGong {
    public static void main(String[] args) {
        //生成地图：1为障碍物
        int[][] map = new int[8][7];
        for (int i = 0; i < 7; i++) {
            map[0][i] = 1;
            map[7][i] = 1;
        }
        for (int i = 0; i < 8; i++) {
            map[i][0] = 1;
            map[i][6] = 1;
        }
        map[3][1] = 1;
        map[3][2] = 1;
        //输出地图
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 7; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
        //寻路
        new MiGong().findWay(map,1,1);
        System.out.println("=========findWay==========");
        //输出地图
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 7; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }

    }

    public boolean findWay(int[][] map, int i, int j) {
        /*
         * 0：没走过
         * 1：障碍
         * 2：可以走
         * 3：走不通
         *
         *
         * */
        if (map[6][5] == 2) {
            return true;
        }else{
            if (map[i][j] == 0) {//map[i][j]=0  此点未被检测过。开始检测
                map[i][j]=2;
                if(findWay(map,i+1,j)){
                    return true;
                }else if(findWay(map,i,j+1)){
                    return true;
                }else if(findWay(map,i-1,j)){
                    return true;
                }else if(findWay(map,i,j-1)){
                    return true;
                }else{
                    map[i][j]=3;
                    return false;
                }

            }else{//map[i][j]=1,2,3  此点已经检测过，不再重复检测
                return false;
            }
        }
    }
}
