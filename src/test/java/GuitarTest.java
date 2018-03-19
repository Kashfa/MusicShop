import Instruments.*;
import Instruments.Instrument;


import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;


public class GuitarTest {

    Guitar guitar;
    Instrument instrument;

    @Before
    public void before() {
        guitar = new Guitar("Fender", "Standard Stratocaster MN",  "Electric", 300, 527,
                28, "Lets Rock");
    }

    @Test
    public void hasABrand() {
        assertEquals("Fender", guitar.getBrand());
    }

    @Test
    public void hasAModel() {
        assertEquals("Standard Stratocaster MN", guitar.getModel());
    }

    @Test
    public void hasACategory() {
        assertEquals("Electric", guitar.getCategory());
    }

    @Test
    public void hasBuyPrice() {
        assertEquals(300, guitar.getBuyPrice(), 0.01);
    }

    @Test
    public void hasSellPrice() {
        assertEquals(527, guitar.getSellPrice(), 0.01);
    }

    @Test
    public void hasSound(){
        assertEquals("Lets Rock", guitar.iPlay());
    }

    @Test
    public void hasNumberOfStrings(){
        assertEquals(28, guitar.getNumberOfStrings());
    }

}
