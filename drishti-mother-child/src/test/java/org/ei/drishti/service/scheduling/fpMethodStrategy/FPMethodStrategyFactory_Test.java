package org.ei.drishti.service.scheduling.fpMethodStrategy;

import org.junit.Before;
import org.junit.Test;

public class FPMethodStrategyFactory_Test {
	
	private FPMethodStrategyFactory fpMethodStrategyFactory;
	
	@Before
	public void setUp(){
		fpMethodStrategyFactory = new FPMethodStrategyFactory(null, null, null, null, null, null, null);
	}
	
	@Test
	public void getStrategyFor_Test(){
		String fpMethod = null;
		fpMethodStrategyFactory.getStrategyFor(fpMethod);
	}

}
