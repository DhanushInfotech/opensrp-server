package org.ei.drishti.reporting;

import org.junit.Before;
import org.junit.Test;

public class HttpHeaderFactory_Test {
	
	private HttpHeaderFactory httpHeaderFactory;
	
	@Before
	public void setUp(){
		httpHeaderFactory = new HttpHeaderFactory();
	}
	
	@Test
	public void test(){
		String origin = null;
		httpHeaderFactory.allowOrigin(origin);
	}

}
