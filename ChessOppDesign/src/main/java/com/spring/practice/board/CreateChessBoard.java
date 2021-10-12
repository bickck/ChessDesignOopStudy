package com.spring.practice.board;

import com.spring.practice.User.User;

// 보드가 생성되기 전 유저가 있어야 한다.
public class CreateChessBoard {

	SettingUser setUser = new DefaultSettingUser();
	ChessBoard chessboard;
	User user1;
	User user2;
	
	public CreateChessBoard(User theUser, User anotherUser) {
		this.user1 = theUser;
		this.user2 = anotherUser;
	}
	// 보드가 생성되기 전 유저가 있어야 한다.
	public CreateChessBoard createChessBoard() {
		if(user1 == null && user2 == null) {
			
		}
		
		return null;
	}
}
