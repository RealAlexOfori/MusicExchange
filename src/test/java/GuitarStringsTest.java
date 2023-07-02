import items.DrumSticks;
import items.GuitarStrings;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class GuitarStringsTest {

    GuitarStrings guitarStrings;

    @Before
    public void before(){
        guitarStrings = new GuitarStrings("string",5.00, 10.00);
    }

    @Test
    public void checkTypeOfGuitarString(){
        assertEquals("string", guitarStrings.getType());
    }

    @Test
    public void checkBuyingPrice(){
        assertEquals(5.00, guitarStrings.getBuyingPrice(),0.00);
    }

    @Test
    public void checkSellingPrice(){
        assertEquals(10.00, guitarStrings.getSellingPrice(), 0.00);
    }
}
