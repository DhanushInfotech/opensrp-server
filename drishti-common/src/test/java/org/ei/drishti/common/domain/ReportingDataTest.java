package org.ei.drishti.common.domain;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class ReportingDataTest {

	private ReportingData reportingData;

	@Before
	public void setUp() {
		reportingData = new ReportingData(null, null);
		reportingData = new ReportingData(null);
	}

	@Test
	public void typetest() throws Exception {
		String m = reportingData.type();
		String a = null;
		assertEquals(m, a);

	}
	
	@Test
	public void equalsTest(){
		Object o = null;
		boolean t= reportingData.equals(o);
		boolean x = false;
		assertEquals(t,x);
	}

	@Test
	public void hashCodeTest() {
		reportingData.hashCode();
	}

	@Test
	public void toStringTest() {
		reportingData.toString();
	}
	
	@Test
	public void with_Test(){
		String value = null;
		String key = null;
		reportingData.with(key, value);
	}
	
	@Test
	public void withQuantity_Test(){
		String quantity = null;
		reportingData.withQuantity(quantity);
	}
	
	@Test
	public void get_Test(){
		String key = null;
		reportingData.get(key);
	}

	
	@Test
	public void getMissingReportDataForANMReport_Test(){
		reportingData.getMissingReportDataForANMReport();
	}
	
	@Test
	public void getMissingReportDataForServiceProvided_Test(){
		reportingData.getMissingReportDataForServiceProvided();
	}
		
}



