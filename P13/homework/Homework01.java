package src.P13.homework;

import java.util.ArrayList;
import java.util.Collections;

/*
 *   @author : xdqiang
 *
 * 1. ArrayList取出元素：get()
 * 2. 获得大小:         size()
 */
public class Homework01 {
    public static void main(String[] args) {
        News news1 = new News("汤加发生ggsdfgml;jshl;jdfslj;ljlal;erj火山爆发");
        News news2 = new News("gasgdgasdgasdggggggggggggggggggggggg！");
        News news3 = new News("fgggggggjeytjggggggggggggggggggthrjertjggggggggggggg");
        News news4 = new News("gerjgj;lgjfdkgklsjdfjgpoerjitjiqoereqrgher");
        News news5 = new News("震惊！男子钓鱼gagsdfghklsdfklghkf发现...竟然是！");
        ArrayList arrayList = new ArrayList();
        arrayList.add(news1);
        arrayList.add(news2);
        arrayList.add(news3);
        arrayList.add(news4);
        String s1;
        for (int i = 0; i < arrayList.size(); i++) {
            String s = ((News)arrayList.get(i)).getTitle();
            if(s.length()>15){
                s1 = s.substring(0,15)+"...";
            }else{
                s1 = s;
            }
            System.out.println(s1);
        }
    }
}

class News{
    private String title;
    private String content;

    public News(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return title;
    }
}
