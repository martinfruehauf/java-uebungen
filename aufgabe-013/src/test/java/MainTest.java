import org.junit.Assert;
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
    public void testeOhneParameter() {

        Main.main(new String[]{});

        Mockito.verify(out).println("args muss 2 Parameter haben");
        Mockito.verifyNoMoreInteractions(out);
    }

    @Test
    public void testeMitZuVielenParametern() {

        Main.main(new String[]{"1", "2", "3"});

        Mockito.verify(out).println("args muss 2 Parameter haben");
        Mockito.verifyNoMoreInteractions(out);
    }

    @Test
    public void testeKorrektenWerten() {

        Main.main(new String[]{"34", "66",});

        Mockito.verify(out).println("34 + 66 = 100");
        Mockito.verifyNoMoreInteractions(out);
    }

    @Test
    public void testeFalschenErstenParameter() {

        Main.main(new String[]{"c", "66",});

        Mockito.verify(out).println("args[0] ist unültig");
        Mockito.verify(out).println("0 + 66 = 66");
        Mockito.verifyNoMoreInteractions(out);
    }

    @Test
    public void testeFalschenZweitenParameter() {

        Main.main(new String[]{"34", "c",});

        Mockito.verify(out).println("args[1] ist unültig");
        Mockito.verify(out).println("34 + 0 = 34");
        Mockito.verifyNoMoreInteractions(out);
    }

    @Test
    public void testeAddiere() {

        Assert.assertEquals(Main.addiere(3, 4), 7);
        Assert.assertEquals(Main.addiere(99, 1), 100);
        Assert.assertEquals(Main.addiere(50, 4), 54);
    }
}
