package org.ei.drishti.domain.register;

import org.junit.Before;
import org.junit.Test;

public class CondomRegisterEntry_Test {
	
	private CondomRegisterEntry condomRegisterEntry;
	
	@Before
	public void setUp(){
		condomRegisterEntry = new CondomRegisterEntry();
	}
	
	@Test
	public void ecNumber_Test(){
		condomRegisterEntry.ecNumber();
	}
	
	@Test
	public void wifeName_Test(){
		condomRegisterEntry.wifeName();
	}
	
	@Test
	public void husbandName_Test(){
		condomRegisterEntry.husbandName();
	}
	
	@Test
	public void village_Test(){
		condomRegisterEntry.village();
	}
	
	@Test
	public void subCenter_Test(){
		condomRegisterEntry.subCenter();
	}
	
	@Test
	public void wifeAge_Test(){
		condomRegisterEntry.wifeAge();
	}
	 
	@Test
	public void caste_Test(){
		condomRegisterEntry.caste();
	}
	
	@Test
	public void religion_Test(){
		condomRegisterEntry.religion();
	}
	
	@Test
	public void numberOfLivingMaleChildren_Test(){
		condomRegisterEntry.numberOfLivingMaleChildren();
	}
	
	@Test
	public void numberOfLivingFemaleChildren_Test(){
		condomRegisterEntry.numberOfLivingFemaleChildren();
	}
	
	@Test
	public void wifeEducationLevel_Test(){
		condomRegisterEntry.wifeEducationLevel();
	}
	
	@Test
	public void husbandEducationLevel_Test(){
		condomRegisterEntry.husbandEducationLevel();
	}
	
	@Test
	public void fpDetails_Test(){
		condomRegisterEntry.fpDetails();
	}
	
	@Test
	public void hashCode_Test(){
		condomRegisterEntry.hashCode();
	}
	
	@Test
	public void toString_Test(){
		condomRegisterEntry.toString();
	}

}
