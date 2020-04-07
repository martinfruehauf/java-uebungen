import org.junit.Test;
import org.mockito.Mockito;

import java.io.PrintStream;

/**
 * Testklasse für {@link Main}
 */
public class MainTest {

    @Test
    public void testeAnwendung() {

        PrintStream out = Mockito.mock(PrintStream.class);
        System.setOut(out);

        Main.main(new String[]{});

        Mockito.verify(out).println("Namen:");
        Mockito.verify(out).println("Jenny");
        Mockito.verify(out).println("Max");
        Mockito.verify(out).println("Larissa");
        Mockito.verify(out).println("John");
    }
}
