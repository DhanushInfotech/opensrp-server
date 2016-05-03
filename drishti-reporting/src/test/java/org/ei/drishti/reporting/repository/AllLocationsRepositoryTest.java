package org.ei.drishti.reporting.repository;
import static org.mockito.MockitoAnnotations.initMocks;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;


public class AllLocationsRepositoryTest {

	@Mock
	private DataAccessTemplate dataAccessTemplate;
	private AllLocationsRepository allLocationsRepository;

	@Before
	public void setUp() throws Exception {
		initMocks(this);
		allLocationsRepository = new AllLocationsRepository(dataAccessTemplate);
	}

	@Test
	public void fetchphctest() throws Exception {

		allLocationsRepository.fetchphc(2323);
	
	}
		
	@Test
	public void fetchphonenumbertest() throws Exception {

		allLocationsRepository.fetchphonenumber("anm123");
		
	}
	
	
	@Test
	public void fetchANMphonenumbertest() throws Exception {

		allLocationsRepository.fetchANMphonenumber("anm123");
		
	}
	
	
	@Test
	public void fetchANMVillagestest() throws Exception {

		allLocationsRepository.fetchANMVillages("anm123");
		
	}
	@Test
	public void fetchBytest() throws Exception {

		allLocationsRepository.fetchBy("anm123","sadf","fsd");
		
	}
/*	@Test
	public void fetchByANMIdentifiertest() throws Exception {

		allLocationsRepository.fetchByANMIdentifier("anm123");
		
	}
	
	@Test
	public void fetchVillagesForANMtest() throws Exception {

		allLocationsRepository.fetchVillagesForANM("anm123");
		
	}
	@Test
	public void fetchLocationByANMIdentifiertest() throws Exception {

		allLocationsRepository.fetchLocationByANMIdentifier("anm123");
		
	}*/
	
	@Test
	public void PocdetailsTest(){
		String entityId = null;
		String entityidEC = null;
		allLocationsRepository.Pocdetails(entityId, entityidEC);
	}
}
