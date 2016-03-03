import java.io.PrintStream;
import java.util.ArrayList;

public class RowInGame {

    private PrintStream printStream;
    private String first;
    private String second;
    private String third;

    public RowInGame(PrintStream printStream, String first, String second, String third) {
        this.printStream = printStream;
        this.first = first;
        this.second = second;
        this.third = third;
    }

    public void showDetails() {
        printStream.println(String.format("%s|%s|%s", first, second, third));
    }

}
