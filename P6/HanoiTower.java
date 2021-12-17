package P6;

public class HanoiTower {
    public static void main(String[] args) {
        new Tower().move(6,'a','b','c');

    }
}

class Tower{
    public void move(int num,char a,char b, char c ){
        //如果只有一个盘
        if(num==1){
            System.out.println(a+"->"+c);
        }else{
            //如果有多个盘可以看成两个(最下面，上面所有)
            //(1)先把上面所有的盘移动到b，借助c
           move(num-1,a,c,b);
            //(2)把最下面的盘移动到c，借助b
           System.out.println(a+"->"+c);
            //(3)再把b塔的所有盘移动到c,借助a
           move(num-1,b,a,c);
        }

    }
}
