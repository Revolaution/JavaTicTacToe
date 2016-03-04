import org.junit.Before;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintStream;

import static org.hamcrest.core.Is.is;
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
    private Player player1;
    private Player player2;

    @Before
    public void setUp() throws Exception {
        mock = mock(PrintStream.class);
        printStream = mock;
        board = mock(Board.class);
        bufferedReader = mock(BufferedReader.class);
        player1 = mock(Player.class);
        player2 = mock(Player.class);
        game = new Game(board, printStream, bufferedReader, player1, player2);
    }

    @Test
    public void shouldAskPlayerForPlaceToPutX() throws IOException {
        when(bufferedReader.readLine()).thenReturn("2");
        game.retrievePositionFrom(player1);
        verify(printStream).println(contains("Enter a Number"));
    }

    @Test
    public void shouldInvokeBoardChangeMethodAfterUserInput() throws IOException {
        when(bufferedReader.readLine()).thenReturn("1");
        game.retrievePositionFrom(player1);
        verify(board).addMovePieceToPosition(player1.getMovePiece(),0);
    }

    @Test
    public void shouldInvokeBoardChangeMethodForPlayer2() throws IOException {
        when(bufferedReader.readLine()).thenReturn("2");
        game.retrievePositionFrom(player2);
        verify(board).addMovePieceToPosition(player2.getMovePiece(), 1);
    }

}