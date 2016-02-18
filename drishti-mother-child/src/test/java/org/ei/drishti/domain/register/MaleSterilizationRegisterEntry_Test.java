package org.ei.drishti.domain.register;

import org.junit.Before;
import org.junit.Test;

public class MaleSterilizationRegisterEntry_Test {
	
	private MaleSterilizationRegisterEntry maleSterilizationRegisterEntry;
	
	@Before
	public void setUp(){
		maleSterilizationRegisterEntry = new MaleSterilizationRegisterEntry();
	}
	
	@Test
	public void ecNumber_Test(){
		maleSterilizationRegisterEntry.ecNumber();
	}
	
	@Test
	public void wifeName_Test(){
		maleSterilizationRegisterEntry.wifeName();
	}
	
	@Test
	public void husbandName_Test(){
		maleSterilizationRegisterEntry.husbandName();
	}
	
	@Test
	public void village_Test(){
		maleSterilizationRegisterEntry.village();
	}
	
	@Test
	public void subCenter_Test(){
		maleSterilizationRegisterEntry.subCenter();
	}
	
	@Test
	public void wifeAge_Test(){
		maleSterilizationRegisterEntry.wifeAge();
	}
	
	@Test
	public void husbandAge_Test(){
		maleSterilizationRegisterEntry.husbandAge();
	}
	
	@Test
	public void caste_Test(){
		maleSterilizationRegisterEntry.caste();
	}
	
	@Test
	public void religion_Test(){
		maleSterilizationRegisterEntry.religion();
	}
	
	@Test
	public void numberOfLivingMaleChildren_Test(){
		maleSterilizationRegisterEntry.numberOfLivingMaleChildren();
	}
	
	@Test
	public void numberOfLivingFemaleChildren_Test(){
		maleSterilizationRegisterEntry.numberOfLivingFemaleChildren();
	}
	
	@Test
	public void wifeEducationLevel_Test(){
		maleSterilizationRegisterEntry.wifeEducationLevel();
	}
	
	@Test
	public void husbandEducationLevel_Test(){
		maleSterilizationRegisterEntry.husbandEducationLevel();
	}
	
	@Test
	public void fpDetails_Test(){
		maleSterilizationRegisterEntry.fpDetails();
	}
	
	@Test
	public void hashCode_Test() {
		maleSterilizationRegisterEntry.hashCode();
	}

	@Test
	public void toString_Test() {
		maleSterilizationRegisterEntry.toString();
	}

}
