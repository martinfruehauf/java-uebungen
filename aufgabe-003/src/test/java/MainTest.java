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

        Mockito.verify(out).print("1 ");
        Mockito.verify(out).print("2 ");
        Mockito.verify(out).print("3 ");
        Mockito.verify(out).print("4 ");
        Mockito.verify(out).print("5 ");
    }
}
