import org.junit.Before;
import org.junit.Test;

import java.io.PrintStream;

import static org.mockito.Matchers.contains;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class RowInGameTest {

    private PrintStream printStream;
    private RowInGame rowInGame;

    @Before
    public void setUp() throws Exception {
        printStream = mock(PrintStream.class);
        rowInGame = new RowInGame(printStream, "1", "2", "3");
    }

    @Test
    public void shouldPrintOutFirstItemWhenCalled(){
        rowInGame.showDetails();
        verify(printStream).println(contains("1"));
    }

    @Test
    public void shouldPrintOutSecondItemWhenCalled(){
        rowInGame.showDetails();
        verify(printStream).println(contains("2"));
    }

    @Test
    public void shouldPrintOutThirdItemWhenCalled(){
        rowInGame.showDetails();
        verify(printStream).println(contains("3"));
    }

}