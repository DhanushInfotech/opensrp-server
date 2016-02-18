package org.ei.drishti.domain;

import org.junit.Before;
import org.junit.Test;

public class MCTSReport_Test {
	
	private MCTSReport mctsReport;
	
	@Before
	public void setUp(){
		mctsReport = new MCTSReport();
	}
	
	@Test
	public void entityId_Test(){
		mctsReport.entityId();
	}
	
	@Test
	public void entityRegistrationDate_Test(){
		mctsReport.entityRegistrationDate();
	}
	
	@Test
	public void serviceProvidedDate_Test(){
		mctsReport.serviceProvidedDate();
	}
	
	@Test
	public void sendDate_Test(){
		mctsReport.sendDate();
	}
	
	@Test
	public void caseId_Test(){
		mctsReport.caseId();
	}
	
	@Test
	public void hashCode_Test(){
		mctsReport.hashCode();
	}
	
	@Test
	public void toString_Test(){
		mctsReport.toString();
	}

}
