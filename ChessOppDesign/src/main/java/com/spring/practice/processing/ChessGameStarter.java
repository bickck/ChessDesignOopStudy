package com.spring.practice.processing;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.spring.practice.ColorSelect.ChooseColor;
import com.spring.practice.ColorSelect.Color;
import com.spring.practice.User.User;
import com.spring.practice.board.ChessBoard;
import com.spring.practice.board.CreateChessBoard;
import com.spring.practice.member.Member;

public class ChessGameStarter {
	// ������ �����ϸ� ó������ ������ �� �� �ֵ��� �Ѵ�.
	// 1. ���尡 ������ �Ǹ� ������ Ž���Ѵ�.
	// ó���� ������ �ڵ����� ������ ������, ���߿� ����� ���� ���� ������ Ȯ�� �� �� �ֵ��� ����Ѵ�.
	
	ChooseColor chooseColor;
	CreateChessBoard createChessBoard;
	
	
	public void gameStarter() {
		
		chooseColor.colorChoose(null, null);
		createChessBoard.createChessBoard(chooseColor);
		
		// ���� ����
		while(true) {
			
		}
	}

}
