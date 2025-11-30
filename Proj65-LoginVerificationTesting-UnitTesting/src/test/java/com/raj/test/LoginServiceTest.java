package com.raj.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.raj.main.LoginService;

public class LoginServiceTest {

	private static LoginService ls;
	
	@BeforeAll
	public static void setupOnce() {
		
		ls=new LoginService();
	}
	
	@Test
	public void validLogin() {
		
		String usn="admin";
		String pwd="rajesh9876";
		
		boolean expected=true;
		
		boolean actual=ls.authenticate(usn, pwd);
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void inValidLogin() {
		
		String usn="adm";
		String pwd="raje";
		
		boolean expected=false;
		
		boolean actual=ls.authenticate(usn, pwd);
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void passwordPolicy() {
		
		String pwd="rajesh9876";
		
		boolean expected=true;
		
		boolean actual= pwd.length()>=6;
		
		assertEquals(expected, actual);
	}
	
	@AfterAll
    public static void tearDownOnce() {
		
		ls=null;
	}
	
}
