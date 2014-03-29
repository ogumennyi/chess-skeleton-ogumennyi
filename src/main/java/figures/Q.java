package figures;

import java.util.ArrayList;

import chess.Player;

public class Q extends Figure {

	public Q(Player color){
		setColour(color);
	}
	
	@Override
	public char getTitle() {
		return (getColor()==Player.Black)?'Q':'q';
	}
	
}
