import org.junit.Test;

import java.io.PrintStream;

import static org.junit.Assert.*;
import static org.mockito.Matchers.contains;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class BoardTest {
    @Test
    public void shouldDrawABoardWhenShowingItself(){
        PrintStream printStream = mock(PrintStream.class);
        Board board = new Board(printStream);
        board.show();
        verify(printStream).println(contains("7|8|9"));
    }


}