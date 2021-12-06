package com.spring.practice.board;

import com.spring.practice.ColorSelect.ChooseColor;
import com.spring.practice.model.GameMember;

// 보드가 생성되기 전 유저가 있어야 한다.
public interface CreateChessBoard {

	void createChessBoard(ChooseColor chooseColor);

}
