
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GreetedTest {

    @Test
    public void shouldGreetPerson () {
        Greeted greeted = new Greeted();

        assertEquals(greeted.greetPerson("Lihle", "Xhosa"), "Molo, Lihle");
        assertEquals(greeted.greetPerson("Lihle", "Arabic"), "Marhabaan, Lihle");

    }

}