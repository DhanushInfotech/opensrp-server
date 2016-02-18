package org.ei.drishti.domain;

import static org.junit.Assert.assertEquals;

import org.ei.drishti.dto.LocationDTO;
import org.junit.Before;
import org.junit.Test;

public class ANMDetail_Test {
	
	private ANMDetail anmDetail;
	
	@Before
	public void setUp(){
		int fpCount = 0;
		LocationDTO location = null;
		int childCount = 0;
		int ancCount = 0;
		int pncCount = 0;
		int ecCount = 0;
		String name = null;
		String identifier = null;
		anmDetail = new ANMDetail(identifier, name, location, ecCount, fpCount, ancCount, pncCount, childCount);
	}
	
	@Test
	public void identifier_Test(){
		anmDetail.identifier();
	}
	
	@Test
	public void name_Test(){
		anmDetail.name();
	}
	
	@Test
	public void location_Test(){
		anmDetail.location();
	}
	
	@Test
	public void ecCount_Test(){
		anmDetail.ecCount();
	}
	
	@Test
	public void fpCount_Test(){
		anmDetail.fpCount();
	}
	
	@Test
	public void ancCount_Test(){
		anmDetail.ancCount();
	}
	
	@Test
	public void pncCount_Test(){
		anmDetail.pncCount();
	}
	
	@Test
	public void childCount_Test(){
		anmDetail.childCount();
	}
	
	@Test
	public void equals_Test(){
		Object o = null;
		boolean t= anmDetail.equals(o);
		boolean x = false;
		assertEquals(t,x);
	}
	
	@Test
	public void hashCode_Test(){
		anmDetail.hashCode();
	}
	
	@Test
	public void toString_Test(){
		anmDetail.toString();
	}

}
