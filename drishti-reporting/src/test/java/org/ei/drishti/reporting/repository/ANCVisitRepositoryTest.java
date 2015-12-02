package org.ei.drishti.reporting.repository;

import static java.util.Arrays.asList;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.mockito.MockitoAnnotations.initMocks;

import org.ei.drishti.reporting.domain.ANCVisitDue;
import org.ei.drishti.reporting.service.VisitService;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

public class ANCVisitRepositoryTest {
	
	
	@Mock
	private AllServicesProvidedRepository servicesProvidedRepository;

	public ANCVisitRepository ancvisitRepository;
	
	@Before
    public void setUp() throws Exception {
        initMocks(this);
        ancvisitRepository = new ANCVisitRepository(servicesProvidedRepository);
    }

	@Test
	public void insertTest() {

		ancvisitRepository.insert("entityid", "patientnum", "anmnum",
				"visittype", 432, "lmpdate", "womenname", "visitdate", "anmid");
		
	}

	@Test
	public void ecinsertTest() {

		ancvisitRepository.ecinsert("entityid", "patientnum");
		
	}
	
	

	@Test
	public void ecUpdateTest() {

		ancvisitRepository.ecUpdate(3214, "patientnum");
		
	}

	
	@Test
	public void ancregUpdateTest() {

		ancvisitRepository.ancregUpdate(3214, "patientnum");
		
	}
	
	@Test
	public void ancUpdateTest() {

		ancvisitRepository.ancUpdate(3214, "patientnum",32324);
		
	}
	
	
	@Test
	public void pocinsertTest() {

		ancvisitRepository.pocinsert("3214", "patientnum","32324","dsf","sdf","sdf","sdf");
		
	}
	
	@Test
	public void reportinsertTest() {

		ancvisitRepository.reportinsert("visitentityid", " entityidec", "patient_name", "anm_id", "activity", "indicator", 42123, "date", "location", 23, "other_date", "visit_location");
		
	}
	
}
