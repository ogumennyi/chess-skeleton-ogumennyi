package chess;

/**
 * This class represents the full state of the board.
 */
public class Chess {

    private Board board;
    private GameState gameState;

    public Chess() {
        gameState = new GameState();
        board = new Board(gameState);
    }

    public Board getBoard() {
        return board;
    }

    public GameState getGameState() {
        return gameState;
    }

}
