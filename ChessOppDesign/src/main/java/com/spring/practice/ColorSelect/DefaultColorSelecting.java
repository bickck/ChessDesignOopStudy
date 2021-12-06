package com.spring.practice.ColorSelect;

import com.spring.practice.User.User;
import com.spring.practice.model.Color;
import com.spring.practice.model.GameMember;

// user1이 블랙 user2가 화이트

public class DefaultColorSelecting implements ChooseColor {

	private GameMember gameMember;
	private GameMember anothergameMember;

	public DefaultColorSelecting() {
		super();
	}

	public DefaultColorSelecting(GameMember member, GameMember anotherMember) {
		// TODO Auto-generated constructor stub
		this.gameMember = member;
		this.anothergameMember = anotherMember;
	}

	@Override
	public ChooseColor colorChoose(GameMember user1, GameMember user2) {
		// TODO Auto-generated method stubGameMember
		if (user1.getColor() == null && user2.getColor() == null) {
			user1.setColor(Color.BLACK);
			user2.setColor(Color.WHITE);
		}
		return new DefaultColorSelecting(user1, user2);
	}

	public GameMember getGameMember() {
		return gameMember;
	}

	public void setGameMember(GameMember gameMember) {
		this.gameMember = gameMember;
	}

	public GameMember getAnothergameMember() {
		return anothergameMember;
	}

	public void setAnothergameMember(GameMember anothergameMember) {
		this.anothergameMember = anothergameMember;
	}

}
