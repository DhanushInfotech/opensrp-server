package org.ei.drishti.dto;
import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
public class MonthSummaryDatumTest {
 
	private MonthSummaryDatum monthsummary;
	
	@Before
	public void setUp(){
		monthsummary = new MonthSummaryDatum();
		monthsummary = new MonthSummaryDatum(null, null, null, null, null);
	}
	
	@Test
	public void monthTest(){
		String w= monthsummary.month();
		String a=null;
		assertEquals(w,a);
	}
	
	@Test
	public void yearTest(){
		String w= monthsummary.year();
		String a=null;
		assertEquals(w,a);
	}
	
	@Test
	public void currentprogressTest(){
		String w= monthsummary.currentProgress();
		String a=null;
		assertEquals(w,a);
	}
	
	@Test
	public void aggregatedProgressTest(){
		String w= monthsummary.aggregatedProgress();
		String a=null;
		assertEquals(w,a);
	}
	
	@Test
	public void externalIDsTest(){
		List<String> w= monthsummary.externalIDs();
		String a=null;
		assertEquals(w,a);
	}
	
	@Test
	public void equalsTest(){
		Object o = null;
		boolean t= monthsummary.equals(o);
		boolean x = false;
		assertEquals(t,x);
	}

	@Test
	public void hashCodeTest() {
		monthsummary.hashCode();
	}

	@Test
	public void toStringTest() {
		monthsummary.toString();
	}
	
}
