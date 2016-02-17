package org.ei.drishti.form.domain;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class FormSubmissionTest {
	
private FormSubmission formSubmission;
	
	@Before
	public void setUp(){
		formSubmission = new FormSubmission();
		formSubmission = new FormSubmission(null, null, null, null, null, 0, null);
		formSubmission = new FormSubmission(null, null, null, null, 0, null, null, 0);
	}
	
	@Test
	public void anmIdTest(){
		String t= formSubmission.anmId();
		String x=null;
		assertEquals(t,x);
	}
	
	@Test
	public void instanceIdTest(){
		String t= formSubmission.instanceId();
		String x=null;
		assertEquals(t,x);
	}
	
	@Test
	public void entityIdTest(){
		String t= formSubmission.entityId();
		String x=null;
		assertEquals(t,x);
	}
	
	@Test
	public void formNameTest(){
		String t= formSubmission.formName();
		String x=null;
		assertEquals(t,x);
	}
	
	@Test
	public void instanceTest(){
		FormInstance t= formSubmission.instance();
		String x=null;
		assertEquals(t,x);
	}
	
	@Test
	public void clientVersionTest(){
		long t= formSubmission.clientVersion();
		long x=0;
		assertEquals(t,x);
	}
	
	@Test
	public void formDataDefinitionVersionTest(){
		String t= formSubmission.formDataDefinitionVersion();
		String x=null;
		assertEquals(t,x);
	}
	
	@Test
	public void serverVersionTest(){
		long t= formSubmission.serverVersion();
		long x=0;
		assertEquals(t,x);
	}
	
	@Test
	public void equalsTest(){
		Object o = null;
		boolean t= formSubmission.equals(o);
		boolean x = false;
		assertEquals(t,x);
	}
	
	@Test
	public void hashCodeTest(){
		formSubmission.hashCode();
	}
	
	@Test
	public void toStringTest(){
		formSubmission.toString();
	}

}
