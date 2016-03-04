import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintStream;

public class Game {
    private int counter;
    private Board board;
    private PrintStream printStream;
    private BufferedReader bufferedReader;
    private Player player1;
    private Player player2;

    public Game(Board board, PrintStream printStream, BufferedReader bufferedReader, Player player1, Player player2) {
        this.board = board;
        this.printStream = printStream;
        this.bufferedReader = bufferedReader;
        this.player1 = player1;
        this.player2 = player2;
        this.counter = 0;
    }

    public void play() {
        while (counter != 9){
            if (this.counter % 2 == 0){
                this.retrievePositionFrom(player1);
            }
            else{
                this.retrievePositionFrom(player2);
            }
            counter ++;
        }
        endGame();
    }

    public int getCounter(){
        return counter;
    }


    public void retrievePositionFrom(Player player) {
        printStream.println(String.format("%s, Please Enter a Number for where you'd like to place your piece", player.getName()));
        try {
            int playerSelection;
            do {
                String userInput = bufferedReader.readLine();
                playerSelection = Integer.parseInt(userInput) - 1;
                if (!board.positionIsOpenAt(playerSelection)){
                    counter --;
                    printStream.println("Invalid choice. Try again");
                    break;
                }
                board.addMovePieceToPosition(player.getMovePiece(),playerSelection );

            } while(board.positionIsOpenAt(playerSelection));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void endGame() {
        printStream.println("It's a draw!");
    }
}
