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

        Mockito.verify(out).println(5);
        Mockito.verify(out).println(4);
        Mockito.verify(out).println(3);
        Mockito.verify(out).println(2);
        Mockito.verify(out).println(1);
        Mockito.verify(out).println(0);
        Mockito.verify(out).println(9);
        Mockito.verify(out).println(8);
        Mockito.verify(out).println(7);
        Mockito.verify(out).println(6);
    }
}
