package org.ei.drishti.form.domain;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class FormInstanceTest {
	
private FormInstance formInstance;
	
	@Before
	public void setUp(){
		formInstance = new FormInstance();
		formInstance = new FormInstance(null);
	}
	
	@Test
	public void formTest(){
		FormData t= formInstance.form();
		String x=null;
		assertEquals(t,x);
	}
	
	@Test
	public void equalsTest(){
		Object o = null;
		boolean t= formInstance.equals(o);
		boolean x = false;
		assertEquals(t,x);
	}
	
	@Test
	public void hashCodeTest(){
		formInstance.hashCode();
	}
	
	@Test
	public void toStringTest(){
		formInstance.toString();
	}

}
