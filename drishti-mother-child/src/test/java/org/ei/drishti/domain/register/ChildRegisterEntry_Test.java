package org.ei.drishti.domain.register;

import org.junit.Before;
import org.junit.Test;

public class ChildRegisterEntry_Test {
	
	private ChildRegisterEntry childRegisterEntry;
	
	@Before
	public void setUp(){
		childRegisterEntry = new ChildRegisterEntry();
	}
	
	@Test
	public void thayiCardNumber_Test(){
		childRegisterEntry.thayiCardNumber();
	}
	
	@Test
	public void wifeName_Test(){
		childRegisterEntry.wifeName();
	}
	
	@Test
	public void husbandName_Test(){
		childRegisterEntry.husbandName();
	}
	
	@Test
	public void village_Test(){
		childRegisterEntry.village();
	}
	
	@Test
	public void subCenter_Test(){
		childRegisterEntry.subCenter();
	}
	
	@Test
	public void wifeDOB_Test(){
		childRegisterEntry.wifeDOB();
	}
	
	@Test
	public void dob_Test(){
		childRegisterEntry.dob();
	}
	
	@Test
	public void immunizations_Test(){
		childRegisterEntry.immunizations();
	}
	
	@Test
	public void vitaminADoses_Test(){
		childRegisterEntry.vitaminADoses();
	}
	
	@Test
	public void hashCode_Test(){
		childRegisterEntry.hashCode();
	}
	
	@Test
	public void toString_Test(){
		childRegisterEntry.toString();
	}

}
