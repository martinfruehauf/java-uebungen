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

        Mockito.verify(out).println("5 + 4 = 9");
        Mockito.verify(out).println("66 - 10 = 56");
        Mockito.verify(out).println("3 * 4 = 12");
        Mockito.verify(out).println("12 / 4 = 3");
        Mockito.verify(out).println("foo ist keine gültige Operation");
    }
}
