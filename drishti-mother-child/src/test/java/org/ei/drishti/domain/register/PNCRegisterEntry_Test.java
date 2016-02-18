package org.ei.drishti.domain.register;

import org.junit.Before;
import org.junit.Test;

public class PNCRegisterEntry_Test {
	
	private PNCRegisterEntry pncRegisterEntry;
	
	@Before
	public void setUp(){
		pncRegisterEntry = new PNCRegisterEntry();
	}
	
	@Test
	public void registrationDate_Test(){
		pncRegisterEntry.registrationDate();
	}
	
	@Test
	public void thayiCardNumber_Test(){
		pncRegisterEntry.thayiCardNumber();
	}
	
	@Test
	public void wifeName_Test(){
		pncRegisterEntry.wifeName();
	}
	
	@Test
	public void husbandName_Test(){
		pncRegisterEntry.husbandName();
	}
	
	@Test
	public void wifeDOB_Test(){
		pncRegisterEntry.wifeDOB();
	}
	
	@Test
	public void address_Test(){
		pncRegisterEntry.address();
	}
	
	@Test
	public void dateOfDelivery_Test(){
		pncRegisterEntry.dateOfDelivery();
	}
	
	@Test
	public void placeOfDelivery_Test(){
		pncRegisterEntry.placeOfDelivery();
	}
	
	@Test
	public void typeOfDelivery_Test(){
		pncRegisterEntry.typeOfDelivery();
	}
	
	@Test
	public void dischargeDate_Test(){
		pncRegisterEntry.dischargeDate();
	}
	
	@Test
	public void fpMethodName_Test(){
		pncRegisterEntry.fpMethodName();
	}
	
	@Test
	public void fpMethodDate_Test(){
		pncRegisterEntry.fpMethodDate();
	}
	
	@Test
	public void deliveryComplications_Test(){
		pncRegisterEntry.deliveryComplications();
	}
	
	@Test
	public void childrenDetails_Test(){
		pncRegisterEntry.childrenDetails();
	}
	
	@Test
	public void pncVisitDetails_Test(){
		pncRegisterEntry.pncVisitDetails();
	}
	
	@Test
	public void hashCode_Test() {
		pncRegisterEntry.hashCode();
	}

	@Test
	public void toString_Test() {
		pncRegisterEntry.toString();
	}

}
