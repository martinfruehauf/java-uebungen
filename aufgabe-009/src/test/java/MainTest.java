import org.junit.Test;
import org.mockito.Mockito;

import java.io.PrintStream;

/**
 * Testklasse für {@link Main}
 */
public class MainTest {

    @Test
    public void testeAddition() {

        PrintStream out = Mockito.mock(PrintStream.class);
        System.setOut(out);

        Main.main(new String[]{"add", "5", "4"});

        Mockito.verify(out).println("5 + 4 = 9");
    }

    @Test
    public void testeSubtraktion() {

        PrintStream out = Mockito.mock(PrintStream.class);
        System.setOut(out);

        Main.main(new String[]{"sub", "66", "10"});

        Mockito.verify(out).println("66 - 10 = 56");
    }

    @Test
    public void testeMultiplikation() {

        PrintStream out = Mockito.mock(PrintStream.class);
        System.setOut(out);

        Main.main(new String[]{"mul", "3", "4"});

        Mockito.verify(out).println("3 * 4 = 12");
    }

    @Test
    public void testeDivision() {

        PrintStream out = Mockito.mock(PrintStream.class);
        System.setOut(out);

        Main.main(new String[]{"div", "12", "4"});

        Mockito.verify(out).println("12 / 4 = 3");
    }

    @Test
    public void testeUngültigeOperation() {

        PrintStream out = Mockito.mock(PrintStream.class);
        System.setOut(out);

        Main.main(new String[]{"foo", "1", "1"});

        Mockito.verify(out).println("foo ist keine gültige Operation");
    }
}
