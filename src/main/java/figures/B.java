package figures;

import java.util.ArrayList;

import chess.Player;

public class B extends Figure {

	public B(Player color){
		setColour(color);
	}
	
	@Override
	public char getTitle() {
		return (getColor()==Player.Black)?'B':'b';
	}
	
}
