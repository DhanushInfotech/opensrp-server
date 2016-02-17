package org.ei.drishti.form.domain;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class FormFieldTest {
	
private FormField formField;
	
	@Before
	public void setUp(){
		formField = new FormField();
		String value = null;
		String name = null;
		String source = null;
		formField = new FormField(name, value, source);
	}
	
	@Test
	public void nameTest(){
		String t = formField.name();
		String x = null;
		assertEquals(t,x);
	}

	@Test
	public void valueTest(){
		String t = formField.value();
		String x = null;
		assertEquals(t,x);
	}
	
	@Test
	public void equalsTest(){
		Object o = null;
		boolean t= formField.equals(o);
		boolean x = false;
		assertEquals(t,x);
	}
	
	@Test
	public void hashCodeTest(){
		formField.hashCode();
	}
	
	@Test
	public void toStringTest(){
		formField.toString();
	}

}
