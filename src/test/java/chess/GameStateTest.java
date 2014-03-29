package chess;

import static junit.framework.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;

import org.junit.Test;

public class GameStateTest {

	/**
	 * Check that white will do move first
	 */
	@Test
	public void FirstMoveDoingWhite(){
		assertEquals(true, (new GameState()).getCurrentPlayer().equals(Player.White));
	}
	
	/**
	 * Check the white pawn's on the position 'a2' available moves for the initial position
	 */
	@Test
	public void CheckMove(){
		GameState gameState = new GameState();
		System.out.println(1);
		gameState.initBoard();
		System.out.println(1);
		System.out.println(gameState.getBoard()[1][0]);
		ArrayList<String> moves = gameState.getBoard()[1][0].getMoves(1, 'a', gameState.getBoard());
		System.out.println(1);
		assertTrue(moves.contains("   a2 a3") && moves.contains("   a2 a4"));
	}
	
}
