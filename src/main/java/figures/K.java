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

	@Override
	public ArrayList<String> getMoves(int posV, char posH, Figure[][] board) {
		ArrayList<String> moves = new ArrayList<String>();
		return moves;
	}
	
}
