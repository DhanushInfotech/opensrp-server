package org.ei.drishti.reporting.service;
import static java.util.Arrays.asList;
import static org.junit.Assert.fail;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.mockito.MockitoAnnotations.initMocks;

import java.util.List;

import org.ei.drishti.reporting.domain.ANMVillages;
import org.ei.drishti.reporting.domain.EcRegDetails;
import org.ei.drishti.reporting.domain.HealthCenter;
import org.ei.drishti.reporting.domain.Location;
import org.ei.drishti.reporting.domain.PHC;
import org.ei.drishti.reporting.domain.SP_ANM;
import org.ei.drishti.reporting.repository.AllLocationsRepository;
import org.ei.drishti.reporting.repository.AllSP_ANMsRepository;
import org.ei.drishti.reporting.repository.AllVisitDueRepository;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.springframework.transaction.annotation.Transactional;

public class ANMServiceTest {
	@Mock
	private AllSP_ANMsRepository allANMsRepository;
	@Mock
	private AllLocationsRepository allLocationsRepository;
	private ANMService anmService;
		
	
	@Before
    public void setUp() throws Exception {
        initMocks(this);
        anmService = new ANMService(allANMsRepository,allLocationsRepository);
    }
	
	@Test
	public void allTest() {
		anmService.all();
		SP_ANM spanm = new SP_ANM("identifier", "name", "subCenter", 3232);
		when(allANMsRepository.fetchAll()).thenReturn(asList(spanm));
	}
	
	@Test
	public void getVillagesForANMTest() {
		anmService.getVillagesForANM("anm123") ;
		
		PHC phc =null;
		Location location =new Location(123, "village", "subCenter", phc ,"taluka", "district", "state");
		when(allLocationsRepository.fetchVillagesForANM("anm123")).thenReturn(asList(location));
		

	}
	
	@Test
	public void anmsInTheSameSCTest() {
		anmService.anmsInTheSameSC("anm123") ;
		
		PHC phc =null;
		SP_ANM spanm = new SP_ANM("identifier", "name", "subCenter", 3232);
		when(allANMsRepository.fetchAllANMSInSamePHC("anm123")).thenReturn(asList(spanm));

	}
	
	
	@Test
	public void anmsInTheSamePHCTest() {
		anmService.anmsInTheSamePHC("anm123") ;
		SP_ANM spanm = new SP_ANM("identifier", "name", "subCenter", 3232);
		
		when(allANMsRepository.fetchAllANMSInSamePHC("anm123")).thenReturn(asList(spanm));

	}
	
	@Test
	public void getANMVillagesTest() {
		anmService.getANMVillages("anm123") ;
		SP_ANM spanm = new SP_ANM("identifier", "name", "subCenter", 3232);
		when(allLocationsRepository.fetchANMVillages("anm123")).thenReturn(asList(spanm));

	}
	
	@Test
	public void getanmPhoneNumberTest() {
		anmService.getanmPhoneNumber("anm123") ;
		ANMVillages anmvillages = new ANMVillages(1221, "villages","user_role","user_id", "name", "phone_number",
	            324, 3241, 324, 324432, 3241, 3243142);
		when(allLocationsRepository.fetchANMVillages("anm123")).thenReturn(asList(anmvillages));

	}

	
	
	@Test
	public void getPhoneNumberTest() {
		anmService.getPhoneNumber("anm123") ;
		
		EcRegDetails ecRegDetails = new EcRegDetails(123,"entityid","phonenumber");
		when(allLocationsRepository.fetchphonenumber("anm123")).thenReturn(asList(ecRegDetails));

	}

	
	@Test
	public void getPHCDetailsTest() {
		anmService.getPHCDetails(2332) ;
		
		HealthCenter healthCenter = new HealthCenter(213,"hospital_name","hospital_type", "hospital_address","parent_hospital","villages",
	    		324,213,213,213);
		when(allLocationsRepository.fetchphc(123213)).thenReturn(asList(healthCenter));

	}
	
	@Test
	public void getANMLocationTest() {
		anmService.getANMLocation("anm123");
		
	}
	
	@Test
	public void getLocationTest() {
		anmService.getLocation("anm123");
		
	}
	
	
}
