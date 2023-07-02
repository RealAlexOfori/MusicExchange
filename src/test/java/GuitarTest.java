import instruments.Guitar;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    Guitar guitar;

    @Before
    public void before(){
        guitar = new Guitar("wood", "brown","string instrument", 5);
    }

    @Test
    public void typeOfMaterial(){
        assertEquals("wood", guitar.getMaterial());
    }

    @Test
    public void colourOfGuitar(){
        assertEquals("brown", guitar.getColour());
    }

    @Test
    public void typeOfInstrument(){
        assertEquals("string instrument", guitar.getType());
    }

    @Test
    public void checkNoOfStrings(){
        assertEquals(5, guitar.getNoOfStrings());
    }

    @Test
    public void checkCanPlayInstrument(){
        assertEquals(guitar.play(), "thinning thinning");
    }

}
