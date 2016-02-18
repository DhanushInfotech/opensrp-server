package org.ei.drishti.domain;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class Multimedia_Test {
	
	private Multimedia multimedia;
	
	@Before 
	public void setUp(){
		String providerId = null;
		String filePath = null;
		String contentType = null;
		String fileCategory = null;
		String caseId = null;
		multimedia = new Multimedia();
		multimedia = new Multimedia(caseId, providerId, contentType, filePath, fileCategory);
	}
	
	@Test
	public void withCaseId_Test(){
		String caseId = null;
		multimedia.withCaseId(caseId);
	}
	
	@Test
	public void withProviderId_Test(){
		String providerId = null;
		multimedia.withProviderId(providerId);
	}
	
	@Test
	public void withContentType_Test(){
		String contentType = null;
		multimedia.withContentType(contentType);
	}
	
	@Test
	public void withFilePath_Test(){
		String filePath = null;
		multimedia.withFilePath(filePath);
	}
	
	@Test
	public void withFileCategory_Test(){
		String fileCategory = null;
		multimedia.withFileCategory(fileCategory);
	}
	
	@Test
	public void setCaseId_Test(){
		String caseId = null;
		multimedia.setCaseId(caseId);
	}
	
	@Test
	public void setProviderId_Test(){
		String providerId = null;
		multimedia.setProviderId(providerId);
	}
	
	@Test
	public void setContentType_Test(){
		String contentType = null;
		multimedia.setContentType(contentType);
	}
	
	@Test
	public void setFilePath_Test(){
		String filePath = null;
		multimedia.setFilePath(filePath);
	}
	
	@Test
	public void setFileCategory_Test(){
		String fileCategory = null;
		multimedia.setFileCategory(fileCategory);
	}
	
	@Test
	public void equals_Test(){
		Object o = null;
		boolean t= multimedia.equals(o);
		boolean x = false;
		assertEquals(t,x);
	}
	
	@Test
	public void hashCode_Test(){
		multimedia.hashCode();
	}
	
	@Test
	public void toString_Test(){
		multimedia.toString();
	}

}
