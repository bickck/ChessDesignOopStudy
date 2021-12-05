package com.spring.practice.model;

public class ChessPiece {
	
	private Piece piece;
	private int x;
	private int y;
	private boolean isAlive;
		
	public ChessPiece(Piece piece, int x, int y, boolean isAlive) {
		super();
		this.piece = piece;
		this.x = x;
		this.y = y;
		this.isAlive = isAlive;
	}	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public Piece getPiece() {
		return piece;
	}
	public void setPiece(Piece piece) {
		this.piece = piece;
	}
	public boolean isAlive() {
		return isAlive;
	}
	public void setAlive(boolean isAlive) {
		this.isAlive = isAlive;
	}
	

	
}
