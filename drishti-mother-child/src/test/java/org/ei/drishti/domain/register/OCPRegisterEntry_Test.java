package org.ei.drishti.domain.register;

import org.junit.Before;
import org.junit.Test;

public class OCPRegisterEntry_Test {

	private OCPRegisterEntry ocpRegisterEntry;

	@Before
	public void setUp() {
		ocpRegisterEntry = new OCPRegisterEntry();
	}

	@Test
	public void ecNumber_Test() {
		ocpRegisterEntry.ecNumber();
	}

	@Test
	public void wifeName_Test() {
		ocpRegisterEntry.wifeName();
	}

	@Test
	public void husbandName_Test() {
		ocpRegisterEntry.husbandName();
	}

	@Test
	public void village_Test() {
		ocpRegisterEntry.village();
	}

	@Test
	public void subCenter_Test() {
		ocpRegisterEntry.subCenter();
	}

	@Test
	public void wifeAge_Test() {
		ocpRegisterEntry.wifeAge();
	}

	@Test
	public void caste_Test() {
		ocpRegisterEntry.caste();
	}

	@Test
	public void religion_Test() {
		ocpRegisterEntry.religion();
	}

	@Test
	public void numberOfLivingMaleChildren_Test() {
		ocpRegisterEntry.numberOfLivingMaleChildren();
	}

	@Test
	public void numberOfLivingFemaleChildren_Test() {
		ocpRegisterEntry.numberOfLivingFemaleChildren();
	}

	@Test
	public void lmpDate_Test() {
		ocpRegisterEntry.lmpDate();
	}

	@Test
	public void uptResult_Test() {
		ocpRegisterEntry.uptResult();
	}

	@Test
	public void wifeEducationLevel_Test() {
		ocpRegisterEntry.wifeEducationLevel();
	}

	@Test
	public void husbandEducationLevel_Test() {
		ocpRegisterEntry.husbandEducationLevel();
	}

	@Test
	public void fpDetails_Test() {
		ocpRegisterEntry.fpDetails();
	}

	@Test
	public void withLmpDate_Test() {
		String lmpDate = null;
		ocpRegisterEntry.withLmpDate(lmpDate);
	}

	@Test
	public void withUptResult_Test() {
		String uptResult = null;
		ocpRegisterEntry.withUptResult(uptResult);
	}

	@Test
	public void hashCode_Test() {
		ocpRegisterEntry.hashCode();
	}

	@Test
	public void toString_Test() {
		ocpRegisterEntry.toString();
	}

}
