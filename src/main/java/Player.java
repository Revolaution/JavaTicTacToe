
public class Player {
    private String name;
    private String movePiece;

    public Player(String name, String movePiece){
        this.name = name;
        this.movePiece = movePiece;
    }

    public String getName(){
        return this.name;
    }

    public String getMovePiece(){
        return this.movePiece;
    }
}
