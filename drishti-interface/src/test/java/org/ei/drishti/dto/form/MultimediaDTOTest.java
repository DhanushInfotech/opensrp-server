package org.ei.drishti.dto.form;
import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
public class MultimediaDTOTest {

	private MultimediaDTO multimedia;
	
	@Before
	public void setUp(){
		multimedia = new MultimediaDTO();
		multimedia = new MultimediaDTO(null, null, null, null, null);
	}
	@Test
	public void caseIdTest(){
		String w= multimedia.caseId();
		String a=null;
		assertEquals(w,a);
	}
	@Test
	public void  providerIdTest(){
		String w= multimedia.providerId();
		String a=null;
		assertEquals(w,a);
	}
	@Test
	public void contentTypeTest(){
		String w= multimedia.contentType();
		String a=null;
		assertEquals(w,a);
	}
	@Test
	public void filePathTest(){
		String w= multimedia.filePath();
		String a=null;
		assertEquals(w,a);
	}
	@Test
	public void fileCategoryTest(){
		String w= multimedia.fileCategory();
		String a=null;
		assertEquals(w,a);
	}
	
	@Test
	public void equalsTest(){
		Object o = null;
		boolean t= multimedia.equals(o);
		boolean x = false;
		assertEquals(t,x);
	}

	@Test
	public void hashCodeTest() {
		multimedia.hashCode();
	}

	@Test
	public void toStringTest() {
		multimedia.toString();
	}
}
