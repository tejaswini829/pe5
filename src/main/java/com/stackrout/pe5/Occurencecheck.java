import java.util.HashMap;
import java.util.Map;

public class Occurencecheck {
    public static void main(String[] args){
        String[] strArr = {"a","b","c","d","a","c","c"};
        Map<String,Integer> map =checkocc(strArr);
        System.out.println(map);
    }
    public static Map<String,Integer> checkocc(String[] strArr){
        Map<String,Integer> map = new HashMap<>();
        for(String str:strArr){
            if(!map.containsKey(str)){
                map.put(str,1);
            }
            else{
                map.put(str,map.get(str)+1);
            }
        }
        return map;
    }
}