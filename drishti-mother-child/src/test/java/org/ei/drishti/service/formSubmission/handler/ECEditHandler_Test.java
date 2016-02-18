package org.ei.drishti.service.formSubmission.handler;

import org.ei.drishti.form.domain.FormSubmission;
import org.junit.Before;
import org.junit.Test;

public class ECEditHandler_Test {
	
	private ECEditHandler ecEditHandler;
	
	@Before
	public void setUp(){
		ecEditHandler = new ECEditHandler();
	}
	
	@Test
	public void handle_Test(){
		FormSubmission submission = null;
		ecEditHandler.handle(submission);
	}

}
