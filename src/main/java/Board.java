import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

public class Board {
    private List<String> wholeBoard;
    private PrintStream printStream;
    private BufferedReader bufferedReader;

    public Board(PrintStream printStream, BufferedReader bufferedReader) {
        this.printStream = printStream;
        this.bufferedReader = bufferedReader;
        this.wholeBoard = new ArrayList<>();
        this.addPlacesToWholeBoard();
    }

    public void show() {
        for ( int i = 0; i < wholeBoard.size(); i += 3){
            printStream.println(String.format("%s|%s|%s", wholeBoard.get(i), wholeBoard.get(i+1), wholeBoard.get(i+2)));
            if (i == 0 || i == 3){
                printStream.println("-----");
            }
        }
    }

    public void addMovePieceToPosition(String movePiece, Integer userInput) throws IOException {
        wholeBoard.set(userInput, movePiece);
        this.show();
    }

    public boolean positionIsOpenAt(int position){
        return wholeBoard.get(position) != "X" && (wholeBoard.get(position) != "O");
    }

    private void addPlacesToWholeBoard(){
        for(int i = 0; i < 9; i ++){
            wholeBoard.add(String.format("%d", i + 1));
        }
    }
}
