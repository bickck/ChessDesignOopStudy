package com.spring.practice.User;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class User {
	
	@Id
	@SequenceGenerator(initialValue = 1, name = "num")
	public int num;
	
	@Column(name ="username" ,nullable = true)
	public String name;
	
	public String score;
	
	public User() {
		
	}
	
	public User(int num, String name, String score) {
		super();
		this.num = num;
		this.name = name;
		this.score = score;
	}

	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getScore() {
		return score;
	}
	public void setScore(String score) {
		this.score = score;
	}
	
	
	
	
	
	
	
		
}
