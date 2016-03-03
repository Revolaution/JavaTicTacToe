
import java.io.PrintStream;
import java.util.ArrayList;

public class Board {
    private ArrayList<RowInGame> wholeBoard;
    private PrintStream printStream;

    public Board(PrintStream printStream) {
        this.printStream = printStream;
        this.wholeBoard = new ArrayList<>();
        this.addLinesToWholeBoard();
    }

    public void show() {
        for (RowInGame row : wholeBoard){
            row.showDetails();
            printStream.println("-----");
        }
    }

    private void addLinesToWholeBoard(){
        RowInGame rowInGame1 = new RowInGame(printStream, "1", "2", "3");
        RowInGame rowInGame2 = new RowInGame(printStream, "4", "5", "6");
        RowInGame rowInGame3 = new RowInGame(printStream, "7", "8", "9");
        wholeBoard.add(rowInGame1);
        wholeBoard.add(rowInGame2);
        wholeBoard.add(rowInGame3);
    }
}
