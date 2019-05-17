package greet;

import languageType.Xhosa;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GreetTest {

    @Test
    public void greet () {
        Xhosa xhosa = new Xhosa ();
        assertEquals(xhosa.getXhosa(),"molo");
    }
}
