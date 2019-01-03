import java.util.HashMap;
import java.util.Map;

public class Stringcount {
    public static void main(String[] args){
        String  str = "one one -one___two,,three,one @three*one?two";
        System.out.println(countString(str));
    }
    public static Map<String,Integer> countString(String str){
        String[] strArr = str.split("[^A-Za-z0-9]");
        Map<String,Integer> map = new HashMap<>();
        for(String s:strArr){
            if(!map.containsKey(s)){
                map.put(s,1);
            }
            else{
                map.put(s,map.get(s)+1);
            }
        }
        map.remove("");
        return map;
    }
}