package org.ei.drishti.service.reporting;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class MCTSFormIndicator_Test {
	
	private MCTSFormIndicator mctsFormIndicator;
	
	@Before
	public void setUp(){
		mctsFormIndicator = new MCTSFormIndicator(null, null);
	}
	
	@Test
	public void equals_Test(){
		Object o = null;
		boolean t= mctsFormIndicator.equals(o);
		boolean x = false;
		assertEquals(t,x);
	}

	@Test
	public void hashCode_Test() {
		mctsFormIndicator.hashCode();
	}

	@Test
	public void toString_Test() {
		mctsFormIndicator.toString();
	}

}
