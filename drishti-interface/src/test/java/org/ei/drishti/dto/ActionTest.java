package org.ei.drishti.dto;

import static org.junit.Assert.assertEquals;

import java.util.Map;

import org.junit.Before;
import org.junit.Test;

public class ActionTest {
	
	private Action action;
	
	 @Before
	 public void setUp(){
		 action = new Action();
		 action = new Action(null,null,null,null,null,null,null);
	 }
	@Test
	public void caseIDTest(){
		String w= action.caseID();
		String a=null;
		assertEquals(w,a);
	}
	@Test
	public void targetTest(){
		String w= action.target();
		String a=null;
		assertEquals(w,a);
	}
	@Test
	public void typeTest(){
		String w= action.type();
		String a=null;
		assertEquals(w,a);
	}
	@Test
	public void isActionActiveTest(){
		Boolean w= action.isActionActive();
		String a=null;
		assertEquals(w,a);
	}
	@Test
	public void indexTest(){
		String w= action.index();
		String a=null;
		assertEquals(w,a);
	}
	@Test
	public void detailsTest(){
		Map<String, String> w= action.details();
		String a=null;
		assertEquals(w,a);
	}
	@Test
	public void dataTest(){
		Map<String, String> w= action.data();
		String a=null;
		assertEquals(w,a);
	}
	
	@Test
	public void equalsTest(){
		Object o = null;
		boolean t= action.equals(o);
		boolean x = false;
		assertEquals(t,x);
	}

	@Test
	public void hashCodeTest() {
		action.hashCode();
	}

	@Test
	public void toStringTest() {
		action.toString();
	}
	
}
