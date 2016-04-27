/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.ei.drishti.reporting.controller;

import java.util.Iterator;
import java.util.List;
import org.ei.drishti.common.util.DateUtil;
import org.ei.drishti.dto.form.FormSubmissionDTO;
import org.ei.drishti.reporting.handler.FormDatahandler;
import org.ei.drishti.reporting.service.ANMService;
import org.joda.time.LocalDate;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import static ch.lambdaj.Lambda.collect;
import static ch.lambdaj.Lambda.on;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

@Controller
public class FormDataController {

    private ANMService anmService;
    private FormDatahandler formDataHandler;
    private SMSController smsController;
    private DateUtil dateUtil;
    private static Logger logger = LoggerFactory
            .getLogger(FormDataController.class.toString());

    String phoneNumber = "";
    String ecId = "";

    @Autowired
    public FormDataController(ANMService anmService2,
            FormDatahandler formDataHandler2, SMSController smsController2,
            DateUtil dateUtil2) {

        this.anmService = anmService2;
        this.formDataHandler = formDataHandler2;
        this.smsController = smsController2;
        this.dateUtil = dateUtil2;

    }

    @RequestMapping(headers = {"Accept=application/json"}, method = POST, value = "/formdata")
    public void formData(
            @RequestBody List<FormSubmissionDTO> formSubmissionsDTO) throws JSONException {
        logger.info("^^ form data into reporting controller****");
        Iterator<FormSubmissionDTO> itr = formSubmissionsDTO.iterator();
        String anmphoneNumber = "";
        String phNumber = "";

        while (itr.hasNext()) {
            Object object = (Object) itr.next();
            String jsonstr = object.toString();
            JSONObject dataObject = new JSONObject(jsonstr);
            String visittype = dataObject.getString("formName");
            logger.info("value of formname " + visittype);
            String user_id = dataObject.getString("anmId");
            anmphoneNumber = anmService.getanmPhoneNumber(user_id).get(0).toString();
            logger.info("value of anmphonenumber from db:" + anmphoneNumber);
            switch (visittype) {
                case "ec_registration":
                    formDataHandler.ecRegistration(dataObject, anmphoneNumber);
                    break;
                case "record_ecps":
                    formDataHandler.recordECP(dataObject, anmphoneNumber);
                    break;
                case "ec_edit":
                    formDataHandler.ecEdit(dataObject, anmphoneNumber);
                    break;
                    
                case "ec_close":
    				formDataHandler.ecClose(dataObject, anmphoneNumber);
    				break;
                case "anc_reg_edit_oa":
                    formDataHandler.ancEdit(dataObject, anmphoneNumber);
                    break;
                case "child_immunizations":
                    formDataHandler.childImmunization(dataObject, visittype);
                    break;
                case "child_registration_ec":
                    formDataHandler.childRegistration(dataObject, visittype, anmphoneNumber);
                    break;
                case "child_registration_oa":
                    formDataHandler.childRegistration(dataObject, visittype, anmphoneNumber);
                    break;
                case "anc_registration":
                    formDataHandler.ancRegistration(dataObject, visittype, anmphoneNumber);
                    break;
                    
                case "anc_close":
    				formDataHandler.ancClose(dataObject, visittype, anmphoneNumber);
    				break;

    			case "pnc_close":
				String anmNumber = null;
				formDataHandler.pncClose(dataObject, visittype, anmNumber);
    				break;
                case "anc_registration_oa":
                    formDataHandler.ancRegistration(dataObject, visittype, anmphoneNumber);
                    break;
                case "delivery_outcome":
                    String phoneNumber = anmService.getanmPhoneNumber(user_id).toString();
                    formDataHandler.pncRegistration(dataObject, visittype, phoneNumber);
                    break;
                case "pnc_registration_oa":
                    String phoneNumber1 = anmService.getanmPhoneNumber(user_id).toString();
                    formDataHandler.pncRegistration(dataObject, visittype, phoneNumber1);
                    break;
                case "anc_visit":
                    formDataHandler.visitpoc(dataObject, visittype);
                    formDataHandler.ancVisit(dataObject, visittype);
                    break;                    
                case "anc_visit_edit":
                    formDataHandler.visitpoc(dataObject, visittype);
                    formDataHandler.ancVisit(dataObject, visittype);
                    break;           
                
                case "pnc_visit":
                    formDataHandler.visitpoc(dataObject, visittype);
                    break;
                case "pnc_visit_edit":
                    formDataHandler.visitpoc(dataObject, visittype);
                    break;
                    
                case "child_illness":
                    formDataHandler.visitpoc(dataObject, visittype);
                    formDataHandler.child_illness(dataObject, visittype);
                    break;
                case "child_illness_edit":
                    formDataHandler.visitpoc(dataObject, visittype);
                    formDataHandler.child_illness(dataObject, visittype);
                    break;
                    
                case "tt":
                    formDataHandler.ttData(dataObject, visittype);
                    break;
            }
        }
    }

}
