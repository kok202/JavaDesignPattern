package desingpattern18_flyweight;

import java.util.Map;
import java.util.TreeMap;

public class FlyweightFactory {
    Map<String, Flyweight> pool;

    public FlyweightFactory() {
        pool = new TreeMap<>();
    }
    
    public Flyweight getFlyweight(String key){
        if(pool.get(key) == null){
            pool.put(key, new Flyweight(key));
            System.out.println(key + "새로생성");
        }
        else{
            System.out.println(key + "재사용");
        }
        return pool.get(key);
    }
}
