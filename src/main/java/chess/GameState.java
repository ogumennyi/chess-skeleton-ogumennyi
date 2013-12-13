package chess;


/**
 * Class that represents the current state of the game.  Basically, what pieces are in which positions on the
 * board.
 */
public class GameState {

    private Player currentPlayer = Player.White;

    /**
     * Create the game state.
     */
    public GameState() {
    }

    public Player getCurrentPlayer() {
        return currentPlayer;
    }

}
