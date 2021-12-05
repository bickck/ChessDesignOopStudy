package com.spring.practice.model;

import com.spring.practice.User.User;
import com.spring.practice.model.Color;

public class GameMember {

	private User user;
	private Color Color;

	public GameMember(User user, Color color) {
		super();
		this.user = user;
		Color = color;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Color getColor() {
		return Color;
	}

	public void setColor(Color color) {
		Color = color;
	}
	// ������ ó������ ���۵Ǹ� �������
}
