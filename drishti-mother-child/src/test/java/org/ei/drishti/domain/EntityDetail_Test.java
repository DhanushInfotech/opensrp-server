package org.ei.drishti.domain;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class EntityDetail_Test {
	
	private EntityDetail entityDetail;
	
	@Before 
	public void setUp(){
		entityDetail = new EntityDetail();
	}
	
	@Test
	public void anmIdentifier_Test(){
		entityDetail.anmIdentifier();
	}
	
	@Test
	public void entityID_Test(){
		entityDetail.entityID();
	}
	
	@Test
	public void entityType_Test(){
		entityDetail.entityType();
	}
	
	@Test
	public void thayiCardNumber_Test(){
		entityDetail.thayiCardNumber();
	}
	
	@Test
	public void ecNumber_Test(){
		entityDetail.ecNumber();
	}
	
	@Test
	public void withThayiCardNumber_Test(){
		String thayiCardNumber = null;
		entityDetail.withThayiCardNumber(thayiCardNumber);
	}
	
	@Test
	public void withECNumber_Test(){
		String ecNumber = null;
		entityDetail.withECNumber(ecNumber);
	}
	
	@Test
	public void withEntityID_Test(){
		String entityId = null;
		entityDetail.withEntityID(entityId);
	}
	
	@Test
	public void withANMIdentifier_Test(){
		String anmIdentifier = null;
		entityDetail.withANMIdentifier(anmIdentifier);
	}
	
	@Test
	public void withEntityType_Test(){
		String type = null;
		entityDetail.withEntityType(type);
	}
	
	@Test
	public void equals_Test(){
		Object o = null;
		boolean t= entityDetail.equals(o);
		boolean x = false;
		assertEquals(t,x);
	}
	
	@Test
	public void hashCode_Test(){
		entityDetail.hashCode();
	}
	
	@Test
	public void toString_Test(){
		entityDetail.toString();
	}

}
