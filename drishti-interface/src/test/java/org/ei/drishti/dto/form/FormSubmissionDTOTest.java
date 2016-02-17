package org.ei.drishti.dto.form;
import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
public class FormSubmissionDTOTest {

	private FormSubmissionDTO formsubmission;
	
	@Before
	public void setUp(){
		formsubmission = new FormSubmissionDTO(null, null, null, null, null, null, null);
	}
	
	@Test
	public void withServerVersion_Test(){
		formsubmission.withServerVersion("version");
	}
	
	@Test
	public void anmIdTest(){
		String w= formsubmission.anmId();
		String a=null;
		assertEquals(w,a);
	}
	@Test
	public void instanceIdTest(){
		String w= formsubmission.instanceId();
		String a=null;
		assertEquals(w,a);
	}
	@Test
	public void entityIdTest(){
		String w= formsubmission.entityId();
		String a=null;
		assertEquals(w,a);
	}
	@Test
	public void formNameTest(){
		String w= formsubmission.formName();
		String a=null;
		assertEquals(w,a);
	}
	@Test
	public void instanceTest(){
		String w= formsubmission.instance();
		String a=null;
		assertEquals(w,a);
	}
	@Test
	public void clientVersionTest(){
		String w= formsubmission.clientVersion();
		String a=null;
		assertEquals(w,a);
	}
	@Test
	public void formDataDefinitionVersionTest(){
		String w= formsubmission.formDataDefinitionVersion();
		String a=null;
		assertEquals(w,a);
	}
	@Test
	public void serverVersion(){
		String w= formsubmission.serverVersion();
		String a=null;
		assertEquals(w,a);
	}
	
	@Test
	public void equalsTest(){
		Object o = null;
		boolean t= formsubmission.equals(o);
		boolean x = false;
		assertEquals(t,x);
	}

	@Test
	public void hashCodeTest() {
		formsubmission.hashCode();
	}

	@Test
	public void toStringTest() {
		formsubmission.toString();
	}
}
