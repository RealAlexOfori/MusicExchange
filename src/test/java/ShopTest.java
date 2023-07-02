import behaviours.ISell;
import items.DrumSticks;
import items.GuitarStrings;
import org.junit.Before;
import org.junit.Test;
import shop.Shop;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    private Shop shop;
    private DrumSticks drumSticks;
    private GuitarStrings guitarStrings;

    @Before
    public void before(){
        shop = new Shop();
        drumSticks = new DrumSticks("sticks", 10.00, 15.00);
        guitarStrings = new GuitarStrings("strings",5.00, 10.00);
    }

    @Test
    public void canGetStock(){
        assertEquals("[]",shop.getStock());
    }

    @Test
    public void canAddItem(){
        shop.addItem(drumSticks);
        assertEquals(1, shop.getStock().size());

    }

    @Test
    public void canRemoveItem(){
        shop.removeItem(drumSticks);
        assertEquals(0, shop.getStock().size());
    }
}
