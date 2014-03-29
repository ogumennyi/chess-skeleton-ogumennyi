package figures;

import java.util.ArrayList;

import chess.Player;

public class N extends Figure {

	public N(Player color){
		setColour(color);
	}
	
	@Override
	public char getTitle() {
		return (getColor()==Player.Black)?'N':'n';
	}

	@Override
	public ArrayList<String> getMoves(int posV, char posH, Figure[][] board) {
		ArrayList<String> moves = new ArrayList<String>();
		return moves;
	}
	
}
