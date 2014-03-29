package chess;

import java.util.ArrayList;

import figures.B;
import figures.Figure;
import figures.K;
import figures.N;
import figures.P;
import figures.Q;
import figures.R;


/**
 * Class that represents the current state of the game.  Basically, what pieces are in which positions on the
 * board.
 */
public class GameState {

    public static final int MIN_ROW = 1;
    public static final int MAX_ROW = 8;
    public static final char MIN_COLUMN = 'a';
    public static final char MAX_COLUMN = 'h';

    private Player currentPlayer = Player.White;
    private Figure[][] board;
    private final Figure[][] INIT_BOARD = new Figure[][]{
    	{new R(Player.White), new N(Player.White), new B(Player.White), new Q(Player.White), new K(Player.White), new B(Player.White), new N(Player.White), new R(Player.White)},
    	{new P(Player.White), new P(Player.White), new P(Player.White), new P(Player.White), new P(Player.White), new P(Player.White), new P(Player.White), new P(Player.White)},
    	{null, null, null, null, null, null, null, null},
    	{null, null, null, null, null, null, null, null},
    	{null, null, null, null, null, null, null, null},
    	{null, null, null, null, null, null, null, null},
    	{new P(Player.Black), new P(Player.Black), new P(Player.Black), new P(Player.Black), new P(Player.Black), new P(Player.Black), new P(Player.Black), new P(Player.Black)},
    	{new R(Player.Black), new N(Player.Black), new B(Player.Black), new Q(Player.Black), new K(Player.Black), new B(Player.Black), new N(Player.Black), new R(Player.Black)}
    	
    };

    /**
     * Create the game state.
     */
    public GameState() {
    }

    public Player getCurrentPlayer() {
        return currentPlayer;
    }
    
    public void initBoard(){
    	board = INIT_BOARD;
    }
    
    public Figure[][] getBoard() {
		return board;
	}
    
    public static boolean isInsideBoard(int posV, char posH){
    	return posV<=MAX_ROW && posV>=MIN_ROW && posH<=MAX_COLUMN && posH>=MIN_COLUMN;
    }

}
