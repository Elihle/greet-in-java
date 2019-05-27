
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class GreetedTest {

    @Test
    public void shouldGreetPerson () {
        Greeted greeted = new Greeted();

        assertEquals(greeted.greetPerson("Lihle", "Xhosa"), "Molo,  Lihle");
        assertEquals(greeted.greetPerson("Sihle", "Arabic"), "Marhabaan,  Sihle");
        assertEquals(greeted.greetPerson("Asemahle", "Spanish"), "Ola,  Asemahle");
    }

    @Test
    public void shouldGetGreetedPeople () {
        Greeted greeted = new Greeted();

        greeted.greetPerson("Lihle", "Xhosa");
        greeted.greetPerson("Jan", "Xhosa");
        greeted.greetPerson("Lihle", "Xhosa");
        assertEquals(greeted.greeted().toString(), "{Lihle=2, Jan=1}");
    }

    @Test
    public void shouldClearAllNames () {
        Greeted greeted = new Greeted();

        greeted.greetPerson("Lihle", "Xhosa");
        greeted.greetPerson("Liya", "Arabic");
        greeted.resetAll();
        assertEquals(greeted.greeted().toString(), "{}");
    }

    @Test
    public void shouldClearSpecifiedName () {
        Greeted greeted = new Greeted();

        greeted.greetPerson("Lihle", "Xhosa");
        greeted.greetPerson("Esona", "Spanish");
        greeted.clear("Lihle");
        assertEquals(greeted.greeted().toString(), "{Esona=1}");
    }

    @Test
    public void shouldCountGreetedNames () {
        Greeted greeted = new Greeted();

        greeted.greetPerson("Lihle", "Xhosa");
        greeted.greetPerson("Athayanda", "Arabic");
        greeted.counter();
        assertEquals(greeted.greeted().toString(), "{Lihle=1, Athayanda=1}");
    }
}