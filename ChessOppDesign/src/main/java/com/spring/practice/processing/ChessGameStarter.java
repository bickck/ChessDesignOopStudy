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
	// 유저가 입장하면 처음으로 색깔을 고를 수 있도록 한다.
	// 1. 보드가 생성이 되면 유저를 탐색한다.
	// 처음은 유저가 자동으로 생성이 되지만, 나중에 통신을 통해 유저 유무를 확인 할 수 있도록 대비한다.
	
	ChooseColor chooseColor;
	CreateChessBoard createChessBoard;
	
	
	public void gameStarter() {
		
		chooseColor.colorChoose(null, null);
		createChessBoard.createChessBoard(chooseColor);
		
		// 게임 진행
		while(true) {
			
		}
	}

}
