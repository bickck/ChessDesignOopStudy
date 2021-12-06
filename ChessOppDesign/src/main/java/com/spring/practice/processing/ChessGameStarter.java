package com.spring.practice.processing;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.spring.practice.ColorSelect.ChooseColor;
import com.spring.practice.ColorSelect.DefaultColorSelecting;
import com.spring.practice.User.User;
import com.spring.practice.board.CreateBoardImpl;
import com.spring.practice.board.CreateChessBoard;
import com.spring.practice.model.ChessBoard;
import com.spring.practice.model.Color;
import com.spring.practice.model.GameMember;

public class ChessGameStarter {
	// ������ �����ϸ� ó������ ������ �� �� �ֵ��� �Ѵ�.
	// 1. ���尡 ������ �Ǹ� ������ Ž���Ѵ�.
	// ó���� ������ �ڵ����� ������ ������, ���߿� ����� ���� ���� ������ Ȯ�� �� �� �ֵ��� ����Ѵ�.
	
	private ChooseColor chooseColor;
	private CreateChessBoard createChessBoard ;
	
	public ChessGameStarter() {
		super();
		this.chooseColor = new DefaultColorSelecting();
		this.createChessBoard = new CreateBoardImpl();
	}

	public ChessGameStarter(User user, User another) {
		super();
		this.chooseColor = new DefaultColorSelecting();
		this.createChessBoard = new CreateBoardImpl();
	}



	public void gameStarter(User user, User another) {
		
		GameMember memeber1 = new GameMember(user, null);
		GameMember memeber2 = new GameMember(another, null);
		
		chooseColor.colorChoose(memeber1, memeber2);
		createChessBoard.createChessBoard(chooseColor);
		
		// ���� ����
		while(true) {
			
		}
	}
}