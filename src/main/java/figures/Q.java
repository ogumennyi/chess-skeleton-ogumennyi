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

	@Override
	public ArrayList<String> getMoves(int posV, char posH, Figure[][] board) {
		ArrayList<String> moves = new ArrayList<String>();
		return moves;
	}
	
}
