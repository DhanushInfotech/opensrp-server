package org.ei.drishti.reporting.repository;

import static org.mockito.MockitoAnnotations.initMocks;

import java.util.Date;

import org.ei.drishti.reporting.domain.Indicator;
import org.ei.drishti.reporting.domain.Location;
import org.ei.drishti.reporting.domain.ServiceProvider;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

public class AllServicesProvidedRepositoryTest {
	
	@Mock
    private DataAccessTemplate dataAccessTemplate;
	
	public AllServicesProvidedRepository allServicesProvidedRepository;
	
	@Before
	public void setUp(){
		
		initMocks(this);
		allServicesProvidedRepository = new AllServicesProvidedRepository(dataAccessTemplate);
	}
	
	@Test
	public void ecsaveTest1(){
		
		allServicesProvidedRepository.ecsave("visitentityid", "entityidec", "patient_name",
				"anm_id", "activity", "indicator", 456, "date", "location", 3,
				"other_date", "visit_location", "dob");
	}
	
	@Test
	public void ancsaveTest(){
		
		allServicesProvidedRepository.ancsave("visitentityid", "entityidec", "patient_name",
				"anm_id", "activity", "indicator", 799, "date", "location", 2,
				"other_date", "visit_location", "dob");
	}
	
	@Test
	public void pncsaveTest(){
		
		allServicesProvidedRepository.pncsave("visitentityid", "entityidec", "patient_name",
				"anm_id", "activity", "indicator", 749, "date", "location", 5,
				"other_date", "visit_location", "dob");
	}
	
	@Test
	public void anctopncsaveTest(){
		
		allServicesProvidedRepository.anctopncsave("visitentityid", "entityidec", "patient_name",
				"anm_id", "activity", "indicator", 956, "date", "location", 1,
				"other_date", "visit_location", "dob");
	}
			
	@Test
	public void saveTest(){
		
		Date date = null;
		ServiceProvider serviceProvider = null;
		Indicator indicator = null;
		Location location = null;
		allServicesProvidedRepository.save(serviceProvider, "externalId", indicator, date, location, "dristhiEntityId");
	}
	
	@Test
	public void getNewReportsTest(){
		
		Integer token = null;
		allServicesProvidedRepository.getNewReports(token);
	}
	
	@Test
	public void getAllReportsForDristhiEntityIDTest(){
		
		allServicesProvidedRepository.getAllReportsForDristhiEntityID("dristhiEntityID");
	}
	
	@Test
	public void ancsave_Test(){
		
		allServicesProvidedRepository.ancsave("entityid", "patientnum", "anmnum",
				"visittype", 987, "lmpdate", "womenname", "visitdate", "anmid");
	}
	
	@Test
	public void pocsaveTest(){
		
		allServicesProvidedRepository.pocsave("visittype", "visitentityid",
				"entityidec", "anmid", "phc", "timestamp", "wifename");
	}
	
	@Test
	public void reportsaveTest(){
		
		allServicesProvidedRepository.reportsave("visitentityid", "entityidec", 
				"patient_name", "anm_id", "activity", "indicator", 
				985, "date", "location", 4, "other_date", "visit_location", "dob");
	}
	
	@Test
	public void ecsaveTest(){
		
		allServicesProvidedRepository.ecsave("entityid", "phonenumber");
	}

}
