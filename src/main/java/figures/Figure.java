package figures;

import java.util.ArrayList;

import chess.Player;

public abstract class Figure {

	private Player color;
	
	/**
	 * Returns the title of a figure for display on the board
	 * @return returns the char symbol of a figure
	 */
	public abstract char getTitle();
	
	/**
	 * Returns the moves list, available for a current figure type for a position (posV, posH)
	 * @param posV - vertical position (1-8)
	 * @param posH - horizontal position (a-h)
	 * @param board - board model
	 * @return Returns the list of available moves
	 */
	public abstract ArrayList<String> getMoves(int posV, char posH, Figure[][] board);
	
	public void setColour(Player color) {
		this.color = color;
	}
	
	public Player getColor() {
		return color;
	}
	
}
