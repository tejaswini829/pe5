import java.util.HashMap;
import java.util.Map;

public class Valuechange{
    public static void main(String[] args){
        Map<String,String> map1 = new HashMap<>();
        map1.put("val1","java");
        map1.put("val2","c++");
        Map<String,String> map2 = new HashMap<>();
        map2.put("val1","mars");
        map2.put("val2","saturn");
        System.out.println(changeValues(map1));
        System.out.println(changeValues(map2));
    }
    public static Map<String,String> changeValues(Map<String,String> map){
        map.put("val2",map.get("val1"));
        map.put("val1"," ");
        return map;
    }
}