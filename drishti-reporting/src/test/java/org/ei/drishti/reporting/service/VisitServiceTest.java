package org.ei.drishti.reporting.service;
import static java.util.Arrays.asList;
import static org.junit.Assert.*;
import static org.mockito.Mockito.when;
import static org.mockito.MockitoAnnotations.initMocks;

import org.ei.drishti.reporting.controller.LocationController;
import org.ei.drishti.reporting.domain.ANCVisitDue;
import org.ei.drishti.reporting.domain.SP_ANM;
import org.ei.drishti.reporting.domain.VisitConf;
import org.ei.drishti.reporting.repository.AllVisitDueRepository;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

public class VisitServiceTest {
	@Mock
	public AllVisitDueRepository allVisitDueRepository;
	public VisitService visitService;
	
	@Before
    public void setUp() throws Exception {
        initMocks(this);
        visitService = new VisitService(allVisitDueRepository);
    }
@Test
	
    public void getVisitDueTest() {
	visitService.getVisitDue("anm123"); 
	ANCVisitDue ancvisitdue = new ANCVisitDue("entityid","patientnum","anmnum","visittype",213,"lmpdate", "womenname","visitdate","anmid");
	when(allVisitDueRepository.fetchvisitDueDetails("anm123")).thenReturn(asList(ancvisitdue));
    }


@Test

public void getVisitconfTest() {
visitService.getVisitconf(); 
VisitConf visitconf = new VisitConf("asd","sdaf","sad","sdf");
when(allVisitDueRepository.fetchvisitconf()).thenReturn(asList(visitconf));

}


	


}
