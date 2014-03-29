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

	@Override
	public ArrayList<String> getMoves(int posV, char posH, Figure[][] board) {
		ArrayList<String> moves = new ArrayList<String>();
		for (int i = posV-1; i >= GameState.MIN_ROW-1; i--) {
			Figure f = board[i][posH-GameState.MIN_COLUMN];
			if(f==null) {
				moves.add("   "+posH+(posV+1)+" "+posH+(i+1));
			} else {
				if(f.getColor()!=getColor()){
					moves.add("   "+posH+(posV+1)+" "+posH+(i+1));
				}
				break;
			}
	    }
		for (int i = posV+1; i <= GameState.MAX_ROW-1; i++) {
			Figure f = board[i][posH-GameState.MIN_COLUMN];
			if(f==null) {
				moves.add("   "+posH+(posV+1)+" "+posH+(i+1));
			} else {
				if(f.getColor()!=getColor()){
					moves.add("   "+posH+(posV+1)+" "+posH+(i+1));
				}
				break;
			}
	    }
		char cc = posH;
		for (char c = cc++; c <= GameState.MAX_COLUMN; c++) {
			Figure f = board[posV][c-GameState.MIN_COLUMN];
			if(f==null) {
				moves.add("   "+posH+(posV+1)+" "+c+(posV+1));
			}
        }
		cc = posH;
		for (char c = cc--; c >= GameState.MIN_COLUMN; c--) {
			Figure f = board[posV][c-GameState.MIN_COLUMN];
			if(f==null) {
				moves.add("   "+posH+(posV+1)+" "+c+(posV+1));
			}
        }
		return moves;
	}
	
}
