package org.ei.drishti.dto.register;

import static org.junit.Assert.assertEquals;

import java.util.List;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;

public class PNCRegisterEntryDTOTest {
	
	private PNCRegisterEntryDTO pncRegisterEntryDTO;

	@Before
	public void setUp(){
		pncRegisterEntryDTO = new PNCRegisterEntryDTO();
	}
	
	@Test
	public void withRegistrationDateTest(){
		pncRegisterEntryDTO.withRegistrationDate("registrationDate");
	}
	
	@Test
	public void withThayiCardNumberTest(){
		pncRegisterEntryDTO.withThayiCardNumber("thayiCardNumber");
	}
	
	@Test
	public void withWifeNameTest(){
		pncRegisterEntryDTO.withWifeName("wifeName");
	}
	
	@Test
	public void withHusbandNameTest(){
		pncRegisterEntryDTO.withHusbandName("husbandName");
	}
	
	@Test
	public void withWifeDOBTest(){
		pncRegisterEntryDTO.withWifeDOB("wifeDOB");
	}
	
	@Test
	public void withAddressTest(){
		pncRegisterEntryDTO.withAddress("address");
	}
	
	@Test
	public void withDateOfDeliveryTest(){
		pncRegisterEntryDTO.withDateOfDelivery("dateOfDelivery");
	}
	
	@Test
	public void withPlaceOfDeliveryTest(){
		pncRegisterEntryDTO.withPlaceOfDelivery("placeOfDelivery");
	}
	
	@Test
	public void withTypeOfDeliveryTest(){
		pncRegisterEntryDTO.withTypeOfDelivery("typeOfDelivery");
	}
	
	@Test
	public void withDischargeDateTest(){
		pncRegisterEntryDTO.withDischargeDate("dischargeDate");
	}
	
	@Test
	public void withFPMethodNameTest(){
		pncRegisterEntryDTO.withFPMethodName("fpMethodName");
	}
	
	@Test
	public void withFPMethodDateTest(){
		pncRegisterEntryDTO.withFPMethodDate("fpMethodDate");
	}
	
	@Test
	public void withDeliveryComplicationsTest(){
		pncRegisterEntryDTO.withDeliveryComplications("deliveryComplications");
	}
	
	@Test
	public void withChildrenDetails_Test(){
		List<Map<String, String>> childrenDetails = null;
		pncRegisterEntryDTO.withChildrenDetails(childrenDetails);
	}
	
	@Test
	public void withPNCVisits_Test(){
		List<PNCVisitDTO> pncVisits = null;
		pncRegisterEntryDTO.withPNCVisits(pncVisits);
	}
	
	@Test
	public void equalsTest(){
		Object o = null;
		boolean t= pncRegisterEntryDTO.equals(o);
		boolean x = false;
		assertEquals(t,x);
	}

	@Test
	public void hashCodeTest() {
		pncRegisterEntryDTO.hashCode();
	}

	@Test
	public void toStringTest() {
		pncRegisterEntryDTO.toString();
	}
}
