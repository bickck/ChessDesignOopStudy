package com.spring.practice.ColorSelect;

import com.spring.practice.model.Color;
import com.spring.practice.model.GameMember;

public class HighScoreSeletting implements ChooseColor {

	/*
	 * 높은 랭크이거나 같은 랭크일 경우 game1이 화이트 game2은 블랙 아닐 경우 game1이 블랙 , gamw2가 화이트
	 */

	/*
	 * @Override public void colorChoose(GameMember GameMember1, GameMember
	 * GameMember2) { // TODO Auto-generated method stubGameMember if(
	 * GameMember1.getUser().getScore() >= GameMember2.getUser().getScore()) {
	 * GameMember1.setColor(Color.WHITE); GameMember2.setColor(Color.BLACK); }else {
	 * GameMember1.setColor(Color.BLACK); GameMember2.setColor(Color.WHITE); } }
	 */
	@Override
	public ChooseColor colorChoose(GameMember GameMember1, GameMember GameMember2) {
		// TODO Auto-generated method stub
		return null;
	}
}
