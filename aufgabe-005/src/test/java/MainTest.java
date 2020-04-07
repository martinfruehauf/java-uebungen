import org.junit.Test;
import org.mockito.Mockito;

import java.io.PrintStream;

/**
 * Testklasse für {@link Main}
 */
public class MainTest {

    @Test
    public void testeAufAusgabe() {

        PrintStream out = Mockito.mock(PrintStream.class);
        System.setOut(out);

        Main.main(new String[]{});

        Mockito.verify(out).println("Hallo (0) und Hello (1) sind ungleich");
        Mockito.verify(out).println("Hallo (0) und Hallo (2) sind gleich");
        Mockito.verify(out).println("Hello (1) und Hallo (2) sind ungleich");
    }
}
