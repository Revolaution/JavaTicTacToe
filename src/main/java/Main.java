import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class Main {
    public static void main(String[] args) {
        PrintStream printStream = System.out;
        Board board = new Board(printStream);
        BufferedReader bufferedReader = new BufferedReader((new InputStreamReader(System.in)));
        Player player1 = new Player("Player 1", "X");
        Player player2 = new Player("Player 2", "O");

        Game game = new Game(board, printStream, bufferedReader, player1, player2);

        board.show();
        while (game.getCounter() != 9){
            game.play();
        }
    }
}
