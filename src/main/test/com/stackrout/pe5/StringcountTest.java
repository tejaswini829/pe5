
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class StringcountTest {


    @Test
    public void countString() {
        Stringcount check = new Stringcount();
        String  str = "one one -one___two,,three,one @three*one?two";
        Map<String,Integer> map = new HashMap<>();
        map.put("one",5);
        map.put("two",2);
        map.put("three",2);

        assertEquals(map,check.countString(str));

    }
}