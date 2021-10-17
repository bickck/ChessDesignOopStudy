package com.spring.practice.UserTest;

import org.junit.Test;

import com.spring.practice.User.User;

public class UserTest {
	
	@Test
	public void Test() {
		User user1 = new User(1,"ABC",0);
		
		System.out.println(user1.getNum() + user1.getName() + user1.getScore());
		
	}

}
