import org.junit.Before;
import org.junit.Test;

import java.io.PrintStream;

import static org.junit.Assert.*;
import static org.mockito.Matchers.contains;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

public class BoardTest {

    private PrintStream printStream;
    private Board board;

    @Before
    public void setUp() throws Exception {
        printStream = mock(PrintStream.class);
        board = new Board(printStream);
    }

    @Test
    public void shouldDrawABoardWhenShowingItself(){
        board.show();
        verify(printStream).println(contains("7|8|9"));
    }

    @Test
    public void shouldDrawDashesTwice(){
        board.show();
        verify(printStream, times(2)).println("-----");
    }

    @Test
    public void shouldAddXAtDesignatedLocation(){
        board.addMovePieceToPosition("1", "X");
        verify(printStream).println(contains("X"));
    }

    @Test
    public void shouldTellUserIfTheyMadeAnInvalidOption(){
//        when(board.get(1)).thenReturn("X");
        board.addMovePieceToPosition("1", "X");
        verify(printStream).println(contains("Invalid"));
    }

}