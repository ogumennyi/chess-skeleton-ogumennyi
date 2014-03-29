package figures;

import java.util.ArrayList;

import chess.Player;

public abstract class Figure {

	private Player color;
	
	public abstract char getTitle();
	
	public void setColour(Player color) {
		this.color = color;
	}
	
	public Player getColor() {
		return color;
	}
	
}
