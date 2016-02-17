package org.ei.drishti.common.domain;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ReportDataDeleteRequestTest {

	private ReportDataDeleteRequest reportDataDeleteRequest;

	@Before
	public void setUp() {
		reportDataDeleteRequest = new ReportDataDeleteRequest();

		String type = null;
		reportDataDeleteRequest = new ReportDataDeleteRequest(type);

		reportDataDeleteRequest = new ReportDataDeleteRequest(null);

	}

	@Test
	public void typeTest() {
		ReportDataDeleteRequest c = reportDataDeleteRequest.withType("type");
		String s = c.type();
		assertEquals(s, "type");
	}

	@Test
	public void dristhiEntityIdTest() {
		ReportDataDeleteRequest c = reportDataDeleteRequest.withDristhiEntityId("dristhiEntityId");
		String s = c.dristhiEntityId();
		assertEquals(s, "dristhiEntityId");
	}

	@Test
	public void buildReportDataRequestTest() {
		ReportDataDeleteRequest c = reportDataDeleteRequest.serviceProvidedDataDeleteRequest("dristhiEntityId");
		String s = c.dristhiEntityId();
		assertEquals(s, "dristhiEntityId");
	}

	@Test
	public void anmReportDataDeleteRequestTest() {
		ReportDataDeleteRequest c = reportDataDeleteRequest.anmReportDataDeleteRequest("dristhiEntityId");
		String s = c.dristhiEntityId();
		assertEquals(s, "dristhiEntityId");
	}
	
	@Test
	public void equalsTest(){
		Object o = null;
		boolean t= reportDataDeleteRequest.equals(o);
		boolean x = false;
		assertEquals(t,x);
	}

	@Test
	public void hashCodeTest() {
		reportDataDeleteRequest.hashCode();
	}

	@Test
	public void toStringTest() {
		reportDataDeleteRequest.toString();
	}

}
