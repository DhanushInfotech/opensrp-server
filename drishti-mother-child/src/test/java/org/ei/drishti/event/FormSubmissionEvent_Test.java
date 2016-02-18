package org.ei.drishti.event;

import org.junit.Before;
import org.junit.Test;

public class FormSubmissionEvent_Test {
	
	private FormSubmissionEvent formSubmissionEvent;
	
	@Before
	public void setUp(){
		formSubmissionEvent = new FormSubmissionEvent(null);
	}
	
	@Test
	public void toEvent_Test(){
		formSubmissionEvent.toEvent();
	}

}
