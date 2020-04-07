import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.PrintStream;

/**
 * Testklasse für {@link Main}
 */
public class MainTest {

    private PrintStream out;

    @Before
    public void setUp() {

        out = Mockito.mock(PrintStream.class);
        System.setOut(out);
    }

    @Test
    public void testeAddition() {

        Main.main(new String[]{"add", "5", "4"});

        Mockito.verify(out).println("5 + 4 = 9");
    }

    @Test
    public void testeSubtraktion() {

        Main.main(new String[]{"sub", "66", "10"});

        Mockito.verify(out).println("66 - 10 = 56");
    }

    @Test
    public void testeMultiplikation() {

        Main.main(new String[]{"mul", "3", "4"});

        Mockito.verify(out).println("3 * 4 = 12");
    }

    @Test
    public void testeDivision() {

        Main.main(new String[]{"div", "12", "4"});

        Mockito.verify(out).println("12 / 4 = 3");
    }

    @Test
    public void testeUngültigeOperation() {

        Main.main(new String[]{"foo", "1", "1"});

        Mockito.verify(out).println("foo ist keine gültige Operation");
    }

    @Test
    public void testeZuWenigeParameter() {

        Main.main(new String[]{"add", "5"});

        Mockito.verify(out).println("Zu wenig Parameter angebeben. Benutzung: taschenrechner.jar <methode> <operand1> <operand2>");
    }

    @Test
    public void testeZuVieleParameter() {

        Main.main(new String[]{"add", "5", "4", "3"});

        Mockito.verify(out).println("Zu viele Parameter angebeben. Benutzung: taschenrechner.jar <methode> <operand1> <operand2>");
    }

    @Test
    public void testeInvalideParameter1() {

        Main.main(new String[]{"add", "5", "a"});

        Mockito.verify(out).println("Ungültige Eingabe. Benutzung: taschenrechner.jar <methode> <operand1> <operand2>");
        Mockito.verify(out).println("methode muss einer der folgenden Werte sein: add, sub, mul, div");
        Mockito.verify(out).println("operand1 und operand2 müssen ganze Zahlen sein");
    }

    @Test
    public void testeInvalideParameter2() {

        Main.main(new String[]{"add", "b", "4"});

        Mockito.verify(out).println("Ungültige Eingabe. Benutzung: taschenrechner.jar <methode> <operand1> <operand2>");
        Mockito.verify(out).println("methode muss einer der folgenden Werte sein: add, sub, mul, div");
        Mockito.verify(out).println("operand1 und operand2 müssen ganze Zahlen sein");
    }
}
