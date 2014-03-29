package figures;

import java.util.ArrayList;

import chess.Player;

public class K extends Figure {

	public K(Player color){
		setColour(color);
	}
	
	@Override
	public char getTitle() {
		return (getColor()==Player.Black)?'K':'k';
	}
	
}
