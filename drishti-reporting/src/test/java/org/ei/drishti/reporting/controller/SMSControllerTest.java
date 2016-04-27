package org.ei.drishti.reporting.controller;

import static java.util.Arrays.asList;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;
import static org.mockito.MockitoAnnotations.initMocks;

import org.ei.drishti.common.util.HttpAgent;
import org.ei.drishti.common.util.HttpResponse;
import org.ei.drishti.dto.VillagesDTO;
import org.ei.drishti.dto.form.FormSubmissionDTO;
import org.ei.drishti.reporting.domain.ANMVillages;
import org.ei.drishti.reporting.domain.Location;
import org.ei.drishti.reporting.domain.PHC;
import org.ei.drishti.reporting.service.ANMService;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.springframework.http.ResponseEntity;

public class SMSControllerTest {
	
	 @Mock
	 private HttpAgent httpAgent;
	 @Mock
	 public FormSubmissionDTO formSubmissionsDTO;
     private SMSController smscontroller;
	   
	 @Before
	    public void setUp() throws Exception {
	        initMocks(this);
	        
	        smscontroller = new SMSController("http://drishti_form_data_url",httpAgent);

	    }
	
 @Test
 public void sendSMSPNCTest() throws Exception {
	 
	 smscontroller.sendSMSPNC("phoneNumber", "ecNumber", "wifeName", "registrationType","anm123");

 }
 
 
 @Test
 public void sendSMSECTest() throws Exception {
	 
	 smscontroller.sendSMSEC("phoneNumber", "ecNumber", "wifeName", "registrationType","anm123");
  
 }
 
 @Test
 public void sendSMSChildTest() throws Exception {
	 
	 smscontroller.sendSMSChild("phoneNumber", "ecNumber","anm123");
  
 }

}
