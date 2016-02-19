package org.ei.drishti.service.reporting;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class FormIndicator_Test {
	
	private FormIndicator formIndicator;
	
	@Before
	public void setUp(){
		formIndicator = new FormIndicator(null, null);
	}
	
	@Test
	public void equals_Test(){
		Object o = null;
		boolean t= formIndicator.equals(o);
		boolean x = false;
		assertEquals(t,x);
	}

	@Test
	public void hashCode_Test() {
		formIndicator.hashCode();
	}

	@Test
	public void toString_Test() {
		formIndicator.toString();
	}

}
