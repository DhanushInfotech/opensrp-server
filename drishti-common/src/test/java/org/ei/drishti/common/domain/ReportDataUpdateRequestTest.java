package org.ei.drishti.common.domain;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class ReportDataUpdateRequestTest {
	
	private ReportDataUpdateRequest reportDataUpdateRequest;

	@Before
	public void setUp(){
		reportDataUpdateRequest = new ReportDataUpdateRequest();
		reportDataUpdateRequest = new ReportDataUpdateRequest(null);
	}
		
	@Test
	public void indicatorTest(){
		ReportDataUpdateRequest c = reportDataUpdateRequest.withIndicator("indicator");
		String s = c.indicator();
		assertEquals(s,"indicator");
	}
	
	@Test
	public void startDateTest(){
		ReportDataUpdateRequest c = reportDataUpdateRequest.withStartDate("startDate");
		String s = c.startDate();
		assertEquals(s,"startDate");
	}
	
	@Test
	public void endDateTest(){
		ReportDataUpdateRequest c = reportDataUpdateRequest.withEndDate("endDate");
		String s = c.endDate();
		assertEquals(s,"endDate");
	}
	
	@Test
	public void typeTest(){
		ReportDataUpdateRequest c = reportDataUpdateRequest.withType("type");
		String s = c.type();
		assertEquals(s,"type");
	}
	
	@Test
	public void reportingDataTest(){
		reportDataUpdateRequest.reportingData();
	}
		
	@Test
	public void withReportingDataTest(){
		List<ReportingData> reportingData = null;
		reportDataUpdateRequest.withReportingData(reportingData);
	}
	
	@Test
	public void equalsTest(){
		Object o = null;
		boolean t= reportDataUpdateRequest.equals(o);
		boolean x = false;
		assertEquals(t,x);
	}

	@Test
	public void hashCodeTest() {
		reportDataUpdateRequest.hashCode();
	}

	@Test
	public void toStringTest() {
		reportDataUpdateRequest.toString();
	}
}
