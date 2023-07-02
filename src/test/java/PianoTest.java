import instruments.Piano;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PianoTest {

    Piano piano;

    @Before
    public void before(){
        piano = new Piano("Plastic", "Black", "Keyboard", 24);
    }

    @Test
    public void typeOfMaterial(){
        assertEquals("Plastic", piano.getMaterial());
    }

    @Test
    public void colourOfPiano(){
        assertEquals("Black", piano.getColour());
    }

    @Test
    public void typeOfInstrument(){
        assertEquals("Keyboard", piano.getType());
    }

    @Test
    public void checkNoOfKeys(){
        assertEquals(24, piano.getNoOfKeys());
    }

    @Test
    public void checkCanPlayInstrument(){
        assertEquals(piano.play(), "Peen peen");
    }

}
