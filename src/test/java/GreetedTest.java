
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GreetedTest {

    @Test
    public void shouldGreetPerson () {
        Greeted greeted = new Greeted();

        assertEquals(greeted.greetPerson("Lihle", "Xhosa"), "Molo, Lihle");
        assertEquals(greeted.greetPerson("Lihle", "Arabic"), "Marhabaan, Lihle");


    }

    @Test
    public void shouldGetGreetedPeople () {
        Greeted greeted = new Greeted();

        greeted.greetPerson("Lihle", "Xhosa");
        greeted.greetPerson("Jan", "Xhosa");
        greeted.greetPerson("Lihle", "Xhosa");

        assertEquals(greeted.greeted().toString(), "{Lihle=2, Jan=1}");


    }
}