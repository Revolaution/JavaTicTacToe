
import java.io.PrintStream;
import java.util.ArrayList;

public class Board {
    private ArrayList<Integer> wholeBoard;
    private PrintStream printStream;

    public Board(PrintStream printStream) {
        this.printStream = printStream;
        this.wholeBoard = new ArrayList<>();
        this.addPlacesToWholeBoard();
    }

    public void show() {
        for ( int i = 0; i < wholeBoard.size(); i += 3){
            printStream.println(String.format("%d|%d|%d", wholeBoard.get(i), wholeBoard.get(i+1), wholeBoard.get(i+2)));
            if (i == 0 || i == 3){
                printStream.println("-----");
            }
        }
    }

    private void addPlacesToWholeBoard(){
        for(int i = 0; i < 9; i ++){
            wholeBoard.add(i + 1);
        }
    }

}
