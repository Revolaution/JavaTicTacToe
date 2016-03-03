import java.io.PrintStream;
import java.util.ArrayList;

public class RowInGame {

//    private ArrayList<String> wholeLine;
    private PrintStream printStream;
    private String first;
    private String second;
    private String third;

    public RowInGame(PrintStream printStream, String first, String second, String third) {
        this.printStream = printStream;
        this.first = first;
        this.second = second;
        this.third = third;
//        this.wholeLine = new ArrayList<>();
//        wholeLine.addPlacesToLine();
    }

    public void showDetails() {
        printStream.println(String.format("%s|%s|%s", first, second, third));
    }

//    private void addPlacesToLine(){
//        this.wholeLine.add(first);
//        this.wholeLine.add(second);
//        this.wholeLine.add(third);
//    }
}
