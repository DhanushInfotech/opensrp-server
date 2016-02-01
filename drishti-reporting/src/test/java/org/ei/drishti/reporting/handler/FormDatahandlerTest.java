package org.ei.drishti.reporting.handler;
import static java.util.Arrays.asList;
import org.ei.drishti.common.util.DateUtil;
import org.ei.drishti.reporting.controller.SMSController;
import org.ei.drishti.reporting.repository.ANCVisitRepository;
import org.ei.drishti.reporting.service.ANMService;
import org.ei.drishti.reporting.service.VisitService;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import com.google.gson.JsonArray;
import org.ei.drishti.reporting.domain.ANCVisitDue;
import org.ei.drishti.reporting.domain.ANMVillages;
import org.ei.drishti.reporting.domain.EcRegDetails;
import org.ei.drishti.reporting.domain.HealthCenter;
import org.ei.drishti.reporting.domain.VisitConf;
import static org.mockito.Mockito.*;
import static org.mockito.MockitoAnnotations.initMocks;

public class FormDatahandlerTest {

	@Mock
	private SMSController smsController;
	@Mock
	private ANMService anmService;
	@Mock
	private ANCVisitRepository ancVisitRepository;
	@Mock
	private VisitService visitService;
	@Mock
	private DateUtil dateUtil;

	private FormDatahandler formDatahandler;

	@Before
	public void setUp() {
		initMocks(this);
		formDatahandler = new FormDatahandler(dateUtil, ancVisitRepository,anmService, smsController, visitService);

	}

	public static JSONObject data() throws JSONException {

		JSONArray list = new JSONArray();
		JSONArray list1 = new JSONArray();
		JSONArray li = new JSONArray();
		JSONArray instances = new JSONArray();
		JSONObject formte = new JSONObject();
		JSONObject formt = new JSONObject();
		JSONObject weight = new JSONObject();
		weight.put("weight", 5);
		instances.put(weight);
		formt.put("instances", instances);
		formte.put("name", "ecId");
		formte.put("value", "ecId");
		list.put(formte);
		list1.put(formt);
		JSONObject form = new JSONObject();
		form.put("fields", list);
		form.put("sub_forms", list1);
		JSONObject formInstance = new JSONObject();
		formInstance.put("form", form);
		JsonArray arr = new JsonArray();
		JSONObject test1 = new JSONObject();
		test1.put("anmId", "anmId");
		test1.put("instanceId", "instance");
		test1.put("entityId", "entity");
		test1.put("formName", "name");
		test1.put("formInstance", formInstance);
		test1.put("clientVersion", "client");
		test1.put("formDataDefinitionVersion", "formDataDefinition");
		return test1;
	}

	@Test
	public void ecRegistrationtest() throws Exception {
		
		JSONObject dataobject = data();
		formDatahandler.ecRegistration(dataobject, "12645");
		verify(smsController).sendSMSEC("", "", "", "EC");
		verify(ancVisitRepository).ecinsert("entity", "");

	}

	@Test
	public void ecEdittest() throws Exception {

		JSONObject dataobject = data();
		EcRegDetails ecRegDetails = new EcRegDetails(1, "entity", "213");
		when(anmService.getPhoneNumber("entity")).thenReturn(asList(ecRegDetails));
		formDatahandler.ecEdit(dataobject, "ptphoneNumber");
		ancVisitRepository.ecUpdate(1, "213");
		verify(ancVisitRepository).ecUpdate(1, "213");

	}

	@Test
	public void ancRegistrationtest() throws JSONException {

		String visittype = "anc_registration";
		JSONObject dataobject = data();
		VisitConf visitconf = new VisitConf("8", "10", "15", "20");
		when(visitService.getVisitconf()).thenReturn(asList(visitconf));
		EcRegDetails ecRegDetails = new EcRegDetails("entity", "213");
		when(anmService.getPhoneNumber("entity")).thenReturn(asList(ecRegDetails));
		formDatahandler.ancRegistration(dataobject, "anc_registration", "12645");
		formDatahandler.ancRegistration(dataobject, "anc_registration_oa","12645");
		ancVisitRepository.insert("entity", "2334", "12345", "sdaf", 2312,"sdf", "ewqr", "12/7/2015", "anm123");
		verify(ancVisitRepository).insert("entity", "2334", "12345", "sdaf",2312, "sdf", "ewqr", "12/7/2015", "anm123");

	}

	@Test
	public void ancEdittest() throws Exception {

		JSONObject dataobject = data();
		ANCVisitDue ancvisitdue = new ANCVisitDue(12, "entityid", "patientnum","anmnum", "visittype", 12312, "lmpdate", "womenname","visitdate", "anmid");
		when(visitService.getVisitDue("entity")).thenReturn(asList(ancvisitdue));
		formDatahandler.ancEdit(dataobject, "phoneNumber");
		ancVisitRepository.ancregUpdate(12, "213");
		verify(ancVisitRepository).ancregUpdate(12, "213");

	}

	@Test
	public void childRegistrationtest() throws Exception {
		
		String visittype = "child_registration_oa";
		JSONObject dataobject = data();
		EcRegDetails ecRegDetails = new EcRegDetails("entity", "213");
		when(anmService.getPhoneNumber("entity")).thenReturn(asList(ecRegDetails));
		smsController.sendSMSChild("", "EC");
		verify(smsController).sendSMSChild("", "EC");
		formDatahandler.childRegistration(dataobject, "child_registration_oa","SDF");
		formDatahandler.childRegistration(dataobject, "child_registration_ec","SD");
		ancVisitRepository.insert("entity", "2334", "12345", "sdaf", 2312,"sdf", "ewqr", "12/7/2015", "anm123");
		verify(ancVisitRepository).insert("entity", "2334", "12345", "sdaf",2312, "sdf", "ewqr", "12/7/2015", "anm123");

	}

	@Test
	public void pncRegistrationtest() throws Exception {
		
		
		JSONObject dataobject = data();
		ANCVisitDue ancvisitDue = new ANCVisitDue("ecId", "patientnum","anmnum", "visittype", 12312, "lmpdate", "womenname","visitdate", "anmid");
		when(visitService.getVisitDue("ecId")).thenReturn(asList(ancvisitDue));
		smsController.sendSMSPNC("phoneNumber", "ecNumber", "wifeName", "registrationType");
		verify(smsController).sendSMSPNC("phoneNumber", "ecNumber", "wifeName", "registrationType");
		formDatahandler.pncRegistration(dataobject, "delivery_outcome","12");
		formDatahandler.pncRegistration(dataobject, "pnc_registration_oa","12645");
    	ancVisitRepository.insert("entity", "ecId", "12345", "sdaf", 2312,"sdf", "ewqr", "12/7/2015", "anm123");
		verify(ancVisitRepository).insert("entity", "ecId", "12345", "sdaf",2312, "sdf", "ewqr", "12/7/2015", "anm123");

	}

	@Test
	public void ancVisittest() throws Exception {

		JSONObject dataobject = data();
		ANCVisitDue ancvisitdue = new ANCVisitDue(12, "entityid", "patientnum","32434", "visittype", 12312, "lmpdate", "womenname","visitdate", "anmid");
		when(visitService.getVisitDue("ecId")).thenReturn(asList(ancvisitdue));
		VisitConf visitconf = new VisitConf("8", "10", "15", "20");
		when(visitService.getVisitconf()).thenReturn(asList(visitconf));
		when(dateUtil.dateFormat("datetime", 32)).thenReturn(("12/7/2015"));
		formDatahandler.ancVisit(dataobject, "anc_visist");

	}

	@Test
	public void visitpoctest() throws Exception {
			
		JSONObject dataobject = data();
		ANMVillages anmvillages = new ANMVillages("villages", "user_role","user_id", "name", "phone_number", 233, 324, 324, 324, 243,32432);
		when(anmService.getANMVillages("anm123")).thenReturn(asList(anmvillages));
		formDatahandler.visitpoc(dataobject, "Subcenter");
		HealthCenter healthCenter = new HealthCenter(234234, "hospital_name","hospital_type", "hospital_address", "parent_hospital","villages", 324, 324, 324, 23234);
		when(anmService.getPHCDetails(243)).thenReturn(asList(healthCenter));
		formDatahandler.visitpoc(dataobject, "Subcenter");
		formDatahandler.visitpoc(dataobject, "anc_visit");
		ancVisitRepository.pocinsert(null, null, null, null, null, null, null);
		verify(ancVisitRepository).pocinsert(null, null, null, null, null,null, null);

	}

	@Test
	public void recordECPtest() throws Exception {

		JSONObject dataobject = data();
		formDatahandler.recordECP(dataobject, "anc_registration");

	}

	@Test
	public void ttDatatest() throws Exception {

		JSONObject dataobject = data();
		formDatahandler.ttData(dataobject, "anc_registration");

	}
	
	@Test
	public void childImmunizationtest() throws Exception {

		JSONObject dataobject = data();
		formDatahandler.childImmunization(dataobject, "anc_registration");

	}

}