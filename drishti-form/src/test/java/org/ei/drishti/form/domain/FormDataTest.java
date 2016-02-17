package org.ei.drishti.form.domain;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class FormDataTest {
	
private FormData formData;
	
	@Before
	public void setUp(){
		formData = new FormData();
		formData = new FormData(null, null, null, null);
	}
	
	@Test
	public void fieldsTest(){
		List<FormField> t= formData.fields();
		String x=null;
		assertEquals(t,x);
	}
	
	@Test
	public void equalsTest(){
		Object o = null;
		boolean t= formData.equals(o);
		boolean x = false;
		assertEquals(t,x);
	}
	
	@Test
	public void hashCodeTest(){
		formData.hashCode();
	}
	
	@Test
	public void toStringTest(){
		formData.toString();
	}

}
