package org.ei.drishti.common.util;
import org.junit.Before;
import org.junit.Test;

public class EasyMapTest {
	
private DateTimeUtil dateTimeUtil;
	
	@Before 
	public void setUp(){
	dateTimeUtil = new DateTimeUtil();
	}
	
	/*@Test
	public void fakeItTest(){
		LocalDateTime fakeDateTime = null;
		dateTimeUtil.fakeIt(fakeDateTime);
	}*/
	
	@Test
	public void nowTest(){
		dateTimeUtil.now();
	}

}
