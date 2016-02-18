package org.ei.drishti.service.reporting;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;

public class RulesFactory_Test {
	
	private RulesFactory rulesFactory;
	
	@Before
	public void setUp(){
		rulesFactory = new RulesFactory();
	}
	
	@Test
	public void setApplicationContext_Test(){		
		ApplicationContext applicationContext = null;
		rulesFactory.setApplicationContext(applicationContext);
	}

}
