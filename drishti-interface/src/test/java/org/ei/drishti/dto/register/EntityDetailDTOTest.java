package org.ei.drishti.dto.register;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
public class EntityDetailDTOTest {

	private EntityDetailDTO entityDetails;
	@Before
	public void setUp(){
		entityDetails=new EntityDetailDTO();
	}
	@Test
	public void anmIdentifierTest(){
		String w=entityDetails.anmIdentifier();
		String a=null;
		assertEquals(w,a);
	}
	@Test
	public void entityIDTest(){
		String w=entityDetails.entityID();
		String a=null;
		assertEquals(w,a);
	}
	@Test
	public void entityTypeTest(){
		String w=entityDetails.entityType();
		String a=null;
		assertEquals(w,a);
	}
	@Test
	public void thayiCardNumberTest(){
		String w=entityDetails.thayiCardNumber();
		String a=null;
		assertEquals(w,a);
	}
	@Test
	public void ecNumberTest(){
		String w=entityDetails.thayiCardNumber();
		String a=null;
		assertEquals(w,a);
	}
	@Test
	public void withThayiCardNumberTest(){
		EntityDetailDTO w=entityDetails.withThayiCardNumber("test");
		String l=w.thayiCardNumber();
		assertEquals(l,"test");
	}
	@Test
	public void withECNumberTest(){
		EntityDetailDTO w=entityDetails.withECNumber("test");
		String l=w.ecNumber();
		assertEquals(l,"test");
	}
	@Test
	public void withEntityIDTest(){
		EntityDetailDTO w=entityDetails.withEntityID("test");
		String l=w.entityID();
		assertEquals(l,"test");
	}
	@Test
	public void withANMIdentifierTest(){
		EntityDetailDTO w=entityDetails.withANMIdentifier("test");
		String l=w.anmIdentifier();
		assertEquals(l,"test");
	}
	
	@Test
	public void withEntityType_Test(){
		entityDetails.withEntityType("type");
	}
	
	@Test
	public void equalsTest(){
		Object o = null;
		boolean t= entityDetails.equals(o);
		boolean x = false;
		assertEquals(t,x);
	}

	@Test
	public void hashCodeTest() {
		entityDetails.hashCode();
	}

	@Test
	public void toStringTest() {
		entityDetails.toString();
	}
	
}
