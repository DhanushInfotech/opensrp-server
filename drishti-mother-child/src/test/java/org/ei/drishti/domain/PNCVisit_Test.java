package org.ei.drishti.domain;

import org.junit.Before;
import org.junit.Test;

public class PNCVisit_Test {
	
	private PNCVisit pncVisit;
	
	@Before
	public void setUp(){
		pncVisit = new PNCVisit();
	}
	
	@Test
	public void date_Test(){
		pncVisit.date();
	}
	
	@Test
	public void person_Test(){
		pncVisit.person();
	}
	
	@Test
	public void place_Test(){
		pncVisit.place();
	}
	
	@Test
	public void difficulties_Test(){
		pncVisit.difficulties();
	}
	
	@Test
	public void abdominalProblems_Test(){
		pncVisit.abdominalProblems();
	}
	
	@Test
	public void vaginalProblems_Test(){
		pncVisit.vaginalProblems();
	}
	
	@Test
	public void urinalProblems_Test(){
		pncVisit.urinalProblems();
	}
	
	@Test
	public void breastProblems_Test(){
		pncVisit.breastProblems();
	}
	
	@Test
	public void childrenDetails_Test(){
		pncVisit.childrenDetails();
	}
	
	@Test
	public void hashCode_Test(){
		pncVisit.hashCode();
	}
	
	@Test
	public void toString_Test(){
		pncVisit.toString();
	}

}
