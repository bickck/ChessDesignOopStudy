package com.spring.practice.ColorSelect;

import com.spring.practice.User.User;

// user1 �� �� user2�� ȭ��Ʈ

public class DefaultUserColorSeleting implements ChooseColor {

	@Override
	public void colorChoose(GameMember user1, GameMember user2) {
		// TODO Auto-generated method stubGameMember
		
		if(user1.getColor() == null && user2.getColor() == null) {
			user1.setColor(Color.BLACK);
			user2.setColor(Color.WHITE);
		}
	}
}
