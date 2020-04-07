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

        Mockito.verify(out).println("add ist implementiert");
        Mockito.verify(out).println("sub ist noch nicht implementiert");
        Mockito.verify(out).println("div ist noch nicht implementiert");
        Mockito.verify(out).println("mul ist noch nicht implementiert");
        Mockito.verify(out).println("foo ist noch nicht implementiert");
    }
}
