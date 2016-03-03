import org.junit.Test;

import java.io.PrintStream;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class RowInGameTest {
    @Test
    public void shouldPrintOutItselfWhenCalled(){
        PrintStream printStream = mock(PrintStream.class);
        RowInGame rowInGame = new RowInGame(printStream, "1", "2", "3");
        rowInGame.showDetails();
        verify(printStream).println("1|2|3");
    }
}