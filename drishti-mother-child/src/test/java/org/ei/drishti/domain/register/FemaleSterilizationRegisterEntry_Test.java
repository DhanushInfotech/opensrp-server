package org.ei.drishti.domain.register;

import org.junit.Before;
import org.junit.Test;

public class FemaleSterilizationRegisterEntry_Test {
	
	private FemaleSterilizationRegisterEntry femaleSterilizationRegisterEntry;
	
	@Before
	public void setUp(){
		femaleSterilizationRegisterEntry = new FemaleSterilizationRegisterEntry();
	}
	
	@Test
	public void ecNumber_Test(){
		femaleSterilizationRegisterEntry.ecNumber();
	}
	
	@Test
	public void wifeName_Test(){
		femaleSterilizationRegisterEntry.wifeName();
	}
	
	@Test
	public void husbandName_Test(){
		femaleSterilizationRegisterEntry.husbandName();
	}
	
	@Test
	public void village_Test(){
		femaleSterilizationRegisterEntry.village();
	}
	
	@Test
	public void subCenter_Test(){
		femaleSterilizationRegisterEntry.subCenter();
	}
	
	@Test
	public void wifeAge_Test(){
		femaleSterilizationRegisterEntry.wifeAge();
	}
	
	@Test
	public void husbandAge_Test(){
		femaleSterilizationRegisterEntry.husbandAge();
	}
	
	@Test
	public void caste_Test(){
		femaleSterilizationRegisterEntry.caste();
	}
	
	@Test
	public void religion_Test(){
		femaleSterilizationRegisterEntry.religion();
	}
	
	@Test
	public void numberOfLivingMaleChildren_Test(){
		femaleSterilizationRegisterEntry.numberOfLivingMaleChildren();
	}
	
	@Test
	public void numberOfLivingFemaleChildren_Test(){
		femaleSterilizationRegisterEntry.numberOfLivingFemaleChildren();
	}
	
	@Test
	public void wifeEducationLevel_Test(){
		femaleSterilizationRegisterEntry.wifeEducationLevel();
	}
	
	@Test
	public void husbandEducationLevel_Test(){
		femaleSterilizationRegisterEntry.husbandEducationLevel();
	}
	
	@Test
	public void fpDetails_Test(){
		femaleSterilizationRegisterEntry.fpDetails();
	}
	
}
