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

	@Override
	public ArrayList<String> getMoves(int posV, char posH, Figure[][] board) {
		ArrayList<String> moves = new ArrayList<String>();
		return moves;
	}
	
}
