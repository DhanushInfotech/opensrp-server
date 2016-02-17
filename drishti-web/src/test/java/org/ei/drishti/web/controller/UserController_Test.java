package org.ei.drishti.web.controller;

import org.junit.Before;
import org.junit.Test;

public class UserController_Test {
	
	private UserController userController;
	
	@Before
	public void setUp(){
		userController = new UserController(null, null);
	}
	
	@Test
	public void authenticateUser_Test(){
		userController.authenticateUser();
	}
	
}
