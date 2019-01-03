import org.junit.Test;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import static org.junit.Assert.*;

public class OccurencecheckTest {

    @Test
    public void appearsMultipleTimes() {
        Occurencecheck check =  new Occurencecheck();
        String[] str = {"a","b","c","d","a","c","c"};
        Map<String,Integer> map = new HashMap<>();
        map.put("a",2);
        map.put("b",1);
        map.put("c",3);
        map.put("d",1);
        assertEquals(map,check.checkocc(str));
    }
}