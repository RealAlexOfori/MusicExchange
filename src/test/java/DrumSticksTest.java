import items.DrumSticks;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DrumSticksTest {

    DrumSticks drumSticks;

    @Before
    public void before(){
        drumSticks = new DrumSticks("stick",10.00, 15.00);
    }

    @Test
    public void checkTypeOfDrumstick(){
        assertEquals("stick", drumSticks.getType());
    }

    @Test
    public void checkBuyingPrice(){
        assertEquals(10.00, drumSticks.getBuyingPrice(),0.00);
    }

    @Test
    public void checkSellingPrice(){
        assertEquals(15.00, drumSticks.getSellingPrice(), 0.00);
    }
}
