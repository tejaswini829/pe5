import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class ElemententryTest {


    @Test
    public void updating() {
        Elemententry check = new Elemententry();
        String[] array1 = new String[]{"Apple","Grape","Melon","Berry"};
        String[] array2 = new String[]{"Kiwi","Grape","Melon","Berry"};
        assertEquals(new ArrayList<String>(Arrays.asList(array2)),check.updating(new ArrayList<String>(Arrays.asList(array1)),"Apple","Kiwi"));
    }

    @Test
    public void removeAllElements() {
        Elemententry check2 = new Elemententry();
        String[] array1 = new String[]{"Apple","Grape","Melon","Berry"};
        assertEquals(null,check2.removing(new ArrayList<String>(Arrays.asList(array1))));
    }
}