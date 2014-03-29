package figures;

import java.util.ArrayList;

import chess.GameState;
import chess.Player;

public class R extends Figure {

	public R(Player color){
		setColour(color);
	}
	
	@Override
	public char getTitle() {
		return (getColor()==Player.Black)?'R':'r';
	}
	
}
