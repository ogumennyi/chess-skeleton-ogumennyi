package figures;

import java.util.ArrayList;

import chess.GameState;
import chess.Player;

public class P extends Figure {
	
	public P(Player color){
		setColour(color);
	}
	
	@Override
	public char getTitle(){
		return (getColor()==Player.Black)?'P':'p';
	}
	
}
