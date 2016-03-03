
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

public class Board {
    private List<String> wholeBoard;
    private PrintStream printStream;

    public Board(PrintStream printStream) {
        this.printStream = printStream;
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

    private void addPlacesToWholeBoard(){
        for(int i = 0; i < 9; i ++){
            wholeBoard.add(String.format("%d", i + 1));
        }
    }

    public void addXToPosition(String userInput) {
        wholeBoard.set((Integer.parseInt(userInput) - 1), "X");
    }
}
