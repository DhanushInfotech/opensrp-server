package org.ei.drishti.domain.register;

import org.junit.Before;
import org.junit.Test;

public class IUDRegisterEntry_Test {
	
	private IUDRegisterEntry iudRegisterEntry;
	
	@Before
	public void setUp(){
		iudRegisterEntry = new IUDRegisterEntry();
	}
	
	@Test
	public void ecNumber_Test(){
		iudRegisterEntry.ecNumber();
	}
	
	@Test
	public void wifeName_Test(){
		iudRegisterEntry.wifeName();
	}
	
	@Test
	public void husbandName_Test(){
		iudRegisterEntry.husbandName();
	}
	
	@Test
	public void village_Test(){
		iudRegisterEntry.village();
	}
	
	@Test
	public void subCenter_Test(){
		iudRegisterEntry.subCenter();
	}
	
	@Test
	public void wifeAge_Test(){
		iudRegisterEntry.wifeAge();
	}
	
	@Test
	public void husbandAge_Test(){
		iudRegisterEntry.husbandAge();
	}
	
	@Test
	public void caste_Test(){
		iudRegisterEntry.caste();
	}
	
	@Test
	public void religion_Test(){
		iudRegisterEntry.religion();
	}
	
	@Test
	public void numberOfLivingMaleChildren_Test(){
		iudRegisterEntry.numberOfLivingMaleChildren();
	}
	
	@Test
	public void numberOfLivingFemaleChildren_Test(){
		iudRegisterEntry.numberOfLivingFemaleChildren();
	}
	
	@Test
	public void lmpDate_Test(){
		iudRegisterEntry.lmpDate();
	}
	
	@Test
	public void uptResult_Test(){
		iudRegisterEntry.uptResult();
	}
	
	@Test
	public void wifeEducationLevel_Test(){
		iudRegisterEntry.wifeEducationLevel();
	}
	
	@Test
	public void husbandEducationLevel_Test(){
		iudRegisterEntry.husbandEducationLevel();
	}
		
	@Test
	public void fpDetails_Test(){
		iudRegisterEntry.fpDetails();
	}
	
	@Test
	public void hashCode_Test() {
		iudRegisterEntry.hashCode();
	}

	@Test
	public void toString_Test() {
		iudRegisterEntry.toString();
	}	

}
