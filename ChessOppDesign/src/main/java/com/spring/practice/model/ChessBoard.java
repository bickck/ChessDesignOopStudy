package com.spring.practice.model;

import java.util.Vector;

import com.spring.practice.User.User;

public class ChessBoard {
	
	private static Vector<Vector<Piece>> board;
	private GameMember gameMeberA;
	private GameMember gameMeberB;
	
	private ChessBoard() {}
	
	public static Vector<Vector<Piece>> getVector(){
		if(board == null) {
			board = new Vector<Vector<Piece>>();
		}
		return board;
	}
}
