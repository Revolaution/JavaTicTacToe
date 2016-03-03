import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintStream;

public class Game {
    private int counter;
    private Board board;
    private PrintStream printStream;
    private BufferedReader bufferedReader;

    public Game(Board board, PrintStream printStream, BufferedReader bufferedReader) {
        this.board = board;
        this.printStream = printStream;
        this.bufferedReader = bufferedReader;
        this.counter = 0;
    }

    public void play() {
        this.retrievePositionFromUser();
        counter ++;
        board.show();
    }

    public int getCounter(){
        return counter;
    }

    public void retrievePositionFromUser() {
        printStream.println("Please Enter a Number for where you'd like to place your piece");
        try {
            String input = bufferedReader.readLine();
            board.addXToPosition(input);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
