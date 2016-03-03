import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class Main {
    public static void main(String[] args) {
        PrintStream printStream = System.out;
        Board board = new Board(printStream);
        BufferedReader bufferedReader = new BufferedReader((new InputStreamReader(System.in)));
        Game game = new Game(board, printStream, bufferedReader);

        board.show();
        while (game.getCounter() != 9){
            game.play();
        }
    }
}
