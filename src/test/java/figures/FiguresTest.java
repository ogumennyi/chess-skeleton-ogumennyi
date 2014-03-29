package figures;

import org.junit.Test;

import chess.Player;

import static junit.framework.Assert.*;

public class FiguresTest {
	
	@Test
	public void PawnTitleTest(){
		assertEquals('P', new P(Player.Black).getTitle());
	}
	
	@Test
	public void KnightTitleTest(){
		assertEquals('N', new N(Player.Black).getTitle());
	}
	
	@Test
	public void BishopTitleTest(){
		assertEquals('b', new B(Player.White).getTitle());
	}
	
	@Test
	public void RookTitleTest(){
		assertEquals('r', new R(Player.White).getTitle());
	}
	
	@Test
	public void KingTitleTest(){
		assertEquals('k', new K(Player.White).getTitle());
	}
	
	@Test
	public void QueenTitleTest(){
		assertEquals('Q', new Q(Player.Black).getTitle());
	}

}