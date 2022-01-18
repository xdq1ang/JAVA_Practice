package src.P14.homework;

import org.junit.jupiter.api.Test;

import java.util.*;

/*
 *   @author : xdqiang
 */
public class Homework01 {
    public static void main(String[] args) {
        DAO<User> dao = new DAO<>();
        dao.save("54",new User(54,40,"xdqiang"));
        dao.save("51",new User(51,43,"CL"));
        dao.save("53",new User(53,47,"GGG"));
        System.out.println(dao.get("51"));
        dao.update("51",new User(50,50,"50"));
        dao.delete("53");
        System.out.println(dao.list());

    }
}

class DAO<T>{
    Map<String,T> map = new HashMap<>();
    @Test
    public void save(String id,T entity){
        map.put(id,entity);
        System.out.println("saved !");
    }
    public T get(String id){
        return map.get(id);
    }
    public void update(String id,T entity){
        map.replace(id,entity);
    }
    public List<T> list(){
        Set<String> keySet = map.keySet();
        ArrayList<T> ts = new ArrayList<>();
        for (String key :keySet) {
            ts.add(map.get(key));
        }
        return ts;
    }
    public void delete(String id){
        map.remove(id);
    }
}
class User{
    private int id;
    private int age;
    private String name;

    public User(int id, int age, String name) {
        this.id = id;
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return id == user.id && age == user.age && Objects.equals(name, user.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, age, name);
    }
}