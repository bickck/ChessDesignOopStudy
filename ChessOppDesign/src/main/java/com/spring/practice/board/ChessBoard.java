package com.spring.practice.board;

import java.util.Vector;

import com.spring.practice.ChessPiece.Piece;
import com.spring.practice.ColorSelect.GameMember;
import com.spring.practice.User.User;

public class ChessBoard {
	
	private static Vector<Vector<Piece>> board;
	GameMember gameMeberA;
	GameMember gameMeberB;
	
	private ChessBoard() {}
	
	public static Vector<Vector<Piece>> getVector(){
		if(board == null) {
			board = new Vector<Vector<Piece>>();
		}
		return board;
	}
}
