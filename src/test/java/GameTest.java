import org.junit.Before;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintStream;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;
import static org.mockito.Matchers.contains;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class GameTest {

    private PrintStream mock;
    private PrintStream printStream;
    private Board board;
    private BufferedReader bufferedReader;
    private Game game;

    @Before
    public void setUp() throws Exception {
        mock = mock(PrintStream.class);
        printStream = mock;
        board = mock(Board.class);
        bufferedReader = mock(BufferedReader.class);
        game = new Game(board, printStream, bufferedReader);
    }

    @Test
    public void shouldAskPlayerForPlaceToPutX(){
        game.retrievePositionFromUser();
        verify(printStream).println(contains("Enter a Number"));
    }

    @Test
    public void shouldInvokeBoardChangeMethodAfterUserInput() throws IOException {
        when(bufferedReader.readLine()).thenReturn("1");
        game.retrievePositionFromUser();
        verify(board).addXToPosition("1");
    }


}