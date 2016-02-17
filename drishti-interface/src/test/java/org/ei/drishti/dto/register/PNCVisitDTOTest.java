package org.ei.drishti.dto.register;

import static org.junit.Assert.assertEquals;

import java.util.List;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;

public class PNCVisitDTOTest {
	
	private PNCVisitDTO pncVisitDTO;
	
	@Before
	public void setUp(){
		pncVisitDTO = new PNCVisitDTO();
	}
	
	@Test
	public void withDateTest(){
		pncVisitDTO.withDate("date");
	}
	
	@Test
	public void withPersonTest(){
		pncVisitDTO.withPerson("person");
	}
	
	@Test
	public void withPlaceTest(){
		pncVisitDTO.withPlace("place");
	}
	
	@Test
	public void withDifficultiesTest(){
		pncVisitDTO.withDifficulties("difficulties");
	}
	
	@Test
	public void withAbdominalProblemsTest(){
		pncVisitDTO.withAbdominalProblems("abdominalProblems");
	}
	
	@Test
	public void withVaginalProblemsTest(){
		pncVisitDTO.withVaginalProblems("vaginalProblems");
	}
	
	@Test
	public void withUrinalProblemsTest(){
		pncVisitDTO.withUrinalProblems("urinalProblems");
	}
	
	@Test
	public void withBreastProblemsTest(){
		pncVisitDTO.withBreastProblems("breastProblems");
	}
	
	@Test
	public void equalsTest(){
		Object o = null;
		boolean t = pncVisitDTO.equals(o);
		boolean x = false;
		assertEquals(t,x);
	}

	@Test
	public void hashCodeTest() {
		pncVisitDTO.hashCode();
	}

	@Test
	public void toStringTest() {
		pncVisitDTO.toString();
	}
	
	@Test
	public void withChildrenDetails_Test(){
		List<Map<String, String>> childrenDetails = null;
		pncVisitDTO.withChildrenDetails(childrenDetails);
	}

}

