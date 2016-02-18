package org.ei.drishti.domain.register;

import org.junit.Before;
import org.junit.Test;

public class ECRegisterEntry_Test {

	private ECRegisterEntry ecRegisterEntry;

	@Before
	public void setUp() {
		ecRegisterEntry = new ECRegisterEntry();
	}

	@Test
	public void registrationDate_Test() {
		ecRegisterEntry.registrationDate();
	}

	@Test
	public void ecNumber_Test() {
		ecRegisterEntry.ecNumber();
	}

	@Test
	public void wifeName_Test() {
		ecRegisterEntry.wifeName();
	}

	@Test
	public void husbandName_Test() {
		ecRegisterEntry.husbandName();
	}

	@Test
	public void househouldAddress_Test() {
		ecRegisterEntry.househouldAddress();
	}

	@Test
	public void wifeAge_Test() {
		ecRegisterEntry.wifeAge();
	}

	@Test
	public void husbandAge_Test() {
		ecRegisterEntry.husbandAge();
	}

	@Test
	public void wifeEducationLevel_Test() {
		ecRegisterEntry.wifeEducationLevel();
	}

	@Test
	public void husbandEducationLevel_Test() {
		ecRegisterEntry.husbandEducationLevel();
	}

	@Test
	public void caste_Test() {
		ecRegisterEntry.caste();
	}

	@Test
	public void religion_Test() {
		ecRegisterEntry.religion();
	}

	@Test
	public void economicStatus_Test() {
		ecRegisterEntry.economicStatus();
	}

	@Test
	public void gravida_Test() {
		ecRegisterEntry.gravida();
	}

	@Test
	public void parity_Test() {
		ecRegisterEntry.parity();
	}

	@Test
	public void numberOfLivingChildren_Test() {
		ecRegisterEntry.numberOfLivingChildren();
	}

	@Test
	public void numberOfStillBirths_Test() {
		ecRegisterEntry.numberOfStillBirths();
	}

	@Test
	public void numberOfAbortions_Test() {
		ecRegisterEntry.numberOfAbortions();
	}

	@Test
	public void numberOfLivingMaleChildren_Test() {
		ecRegisterEntry.numberOfLivingMaleChildren();
	}

	@Test
	public void numberOfLivingFemaleChildren_Test() {
		ecRegisterEntry.numberOfLivingFemaleChildren();
	}

	@Test
	public void youngestChildAge_Test() {
		ecRegisterEntry.youngestChildAge();
	}

	@Test
	public void currentFPMethod_Test() {
		ecRegisterEntry.currentFPMethod();
	}

	@Test
	public void currentFPMethodStartDate_Test() {
		ecRegisterEntry.currentFPMethodStartDate();
	}

	@Test
	public void isPregnant_Test() {
		ecRegisterEntry.isPregnant();
	}

	@Test
	public void householdNumber_Test() {
		ecRegisterEntry.householdNumber();
	}

	@Test
	public void headOfHousehold_Test() {
		ecRegisterEntry.headOfHousehold();
	}

	@Test
	public void village_Test() {
		ecRegisterEntry.village();
	}

	@Test
	public void subCenter_Test() {
		ecRegisterEntry.subCenter();
	}

	@Test
	public void phc_Test() {
		ecRegisterEntry.phc();
	}

	@Test
	public void hashCode_Test() {
		ecRegisterEntry.hashCode();
	}

	@Test
	public void toString_Test() {
		ecRegisterEntry.toString();
	}

}
