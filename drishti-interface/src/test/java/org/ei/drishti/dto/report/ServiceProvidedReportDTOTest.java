package org.ei.drishti.dto.report;

import static org.junit.Assert.*;

import org.joda.time.LocalDate;
import org.junit.Before;
import org.junit.Test;

public class ServiceProvidedReportDTOTest {
	
	private ServiceProvidedReportDTO serviceProvidedReportDTO;

	@Before
	public void setUp(){
		serviceProvidedReportDTO = new ServiceProvidedReportDTO();
		serviceProvidedReportDTO = new ServiceProvidedReportDTO(null, null, null, null, null, null, null, null, null, null, null);
	}
	
	@Test
	public void withIdTest(){
		Integer id = null;
		serviceProvidedReportDTO.withId(id);
	}
	
	@Test
	public void withNRHMReportMonthTest(){
		Integer month = null;
		serviceProvidedReportDTO.withNRHMReportMonth(month);
	}
	
	@Test
	public void withNRHMReportYearTest(){
		Integer year = null;
		serviceProvidedReportDTO.withNRHMReportYear(year);
	}
	
	@Test
	public void withDateTest(){
		LocalDate date = null;
		serviceProvidedReportDTO.withDate(date);
	}
}
