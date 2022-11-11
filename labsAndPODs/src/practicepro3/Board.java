package practicepro3;

public class Board {
    private final GamePiece[][] grid;
    private final int size;

    public Board(int size){
        this.size=size;
        grid=new GamePiece[size][size];
    }
    public Board(Board board){
        this.size=board.size;

        grid=new GamePiece[size][size];
        for(int i=0; i<size; i++){
            for(int j=0; j<size; j++){
                grid[i][j]=board.grid[i][j];
            }
        }
    }
    

}
