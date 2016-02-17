package org.ei.drishti.web.controller;

import org.junit.Before;
import org.junit.Test;

public class EntitiesController_Test {
	
	private EntitiesController entitiesController;
	
	@Before
	public void setUp(){
		
		entitiesController = new EntitiesController(null, null);
	}
	
	@Test
	public void allEntities_Test(){
		
		String anmIdentifier = null;
		entitiesController.allEntities(anmIdentifier);
	}

}
