package P7;

public class Homework09 {
    public static void main(String[] args) {
        Music m1 = new Music("稻香",180);
        m1.play();
        System.out.println(m1.getInfo());


    }
}
class Music{
    String name;
    double times;
    public Music(String name,double times){
        this.name=name;
        this.times=times;
    }
    public void play(){
        System.out.println("正在播放音乐");
    }
    public String getInfo(){
        return "音乐名:"+this.name+"\n时 长:"+this.times;
    }
}
