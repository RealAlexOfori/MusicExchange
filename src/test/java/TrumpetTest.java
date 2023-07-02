import instruments.Trumpet;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TrumpetTest {

    Trumpet trumpet;

    @Before
    public void before(){
        trumpet = new Trumpet("Brass", "Yellow","Blowing instrument",2,5);
    }

    @Test
    public void typeOfMaterial(){
        assertEquals("Brass", trumpet.getMaterial());
    }

    @Test
    public void colourOfTrumpet(){
        assertEquals("Yellow", trumpet.getColour());
    }

    @Test
    public void typeOfInstrument(){
        assertEquals("Blowing instrument", trumpet.getType());
    }

    @Test
    public void checkNoOfValves(){
        assertEquals(2, trumpet.getNoOfValves());
    }

    @Test
    public void checkNoOfButtons(){
        assertEquals(5, trumpet.getNoOfButtons());
    }

    @Test
    public void checkCanPlayInstrument(){
        assertEquals(trumpet.play(), "Poon Poon");
    }

}
