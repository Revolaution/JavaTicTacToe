import org.junit.Before;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintStream;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.mockito.Matchers.contains;
import static org.mockito.Mockito.*;

public class BoardTest {

    private PrintStream printStream;
    private Board board;
    private BufferedReader bufferedReader;

    @Before
    public void setUp() throws Exception {
        printStream = mock(PrintStream.class);
        bufferedReader = mock(BufferedReader.class);
        board = new Board(printStream, bufferedReader);
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
    public void shouldAddXAtDesignatedLocation() throws IOException {
        board.addMovePieceToPosition("X",1);
        verify(printStream).println(contains("X"));
    }

    @Test
    public void shouldAddOAtDesignatedLocation() throws IOException {
        board.addMovePieceToPosition("O",1);
        verify(printStream).println(contains("O"));
    }

    @Test
    public void shouldTellUserIfTheyMadeAnInvalidOption() throws IOException {
        when(board.positionIsOpenAt(1)).thenReturn(false);
        board.addMovePieceToPosition("X",1);
        verify(printStream).println(contains("Invalid"));
    }

}