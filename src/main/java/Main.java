import java.io.PrintStream;
import java.io.SyncFailedException;

public class Main {
    public static void main(String[] args) {
        PrintStream printStream = System.out;
        Board board = new Board(printStream);
        board.show();
    }
}
