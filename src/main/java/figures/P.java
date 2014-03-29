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

	@Override
	public ArrayList<String> getMoves(int posV, char posH, Figure[][] board) {
		ArrayList<String> moves = new ArrayList<String>();
		int k = (getColor()==Player.Black)?-1:1;
		if(board[posV+k][posH-GameState.MIN_COLUMN]==null) moves.add("   "+posH+(posV+1)+" "+posH+(posV+k+1));
		if(board[posV+2*k][posH-GameState.MIN_COLUMN]==null && (posV==1 && getColor()==Player.White || posV==6 && getColor()==Player.Black)) moves.add("   "+posH+(posV+1)+" "+posH+(posV+2*k+1));
		char cc = posH;
		cc--;
		if(GameState.isInsideBoard(posV+k, cc)){
			Figure leftNeighbour = board[posV+k][cc-GameState.MIN_COLUMN];
			if(leftNeighbour!=null && leftNeighbour.getColor()!=getColor()) moves.add("   "+posH+(posV+1)+" "+cc+(posV+1));
		}
		cc = posH;
		cc++;
		if(GameState.isInsideBoard(posV+k, cc)){			
			Figure rightNeighbour = board[posV+k][cc-GameState.MIN_COLUMN];
			if(rightNeighbour!=null && rightNeighbour.getColor()!=getColor()) moves.add("   "+posH+(posV+1)+" "+cc+(posV+1));
		}
		return moves;
	}
	
}
