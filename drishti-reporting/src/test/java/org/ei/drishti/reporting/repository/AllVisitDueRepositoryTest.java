package org.ei.drishti.reporting.repository;

import static org.mockito.MockitoAnnotations.initMocks;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

public class AllVisitDueRepositoryTest {

	
	@Mock
	 private DataAccessTemplate dataAccessTemplate;

	public AllVisitDueRepository allVisitDueRepository;
	
	@Before
    public void setUp() throws Exception {
        initMocks(this);
        allVisitDueRepository = new AllVisitDueRepository(dataAccessTemplate);
    }

	@Test
	public void fetchvisitDueDetailsTest() {

		allVisitDueRepository.fetchvisitDueDetails("anm123");
		
	}
	
	@Test
	public void fetchvisitconfTest() {

		allVisitDueRepository.fetchvisitconf();
		
	}
}
