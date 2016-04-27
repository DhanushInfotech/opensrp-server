package org.ei.drishti.reporting.repository;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;
import org.ei.drishti.reporting.domain.*;
import org.joda.time.LocalDate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

@Repository
public class AllServicesProvidedRepository {

    private DataAccessTemplate dataAccessTemplate;
    private static Logger logger = LoggerFactory
            .getLogger(AllServicesProvidedRepository.class.toString());

    protected AllServicesProvidedRepository() {
    }

    @Autowired
    public AllServicesProvidedRepository(@Qualifier("serviceProvidedDataAccessTemplate") DataAccessTemplate dataAccessTemplate) {
        this.dataAccessTemplate = dataAccessTemplate;
    }

    public void save(ServiceProvider serviceProvider, String externalId, Indicator indicator, Date date, Location location, String dristhiEntityId) {
        dataAccessTemplate.save(new ServiceProvided(serviceProvider, externalId, indicator, date, location, dristhiEntityId));
    }

    public void delete(String indicator, String startDate, String endDate) {
        List result = dataAccessTemplate.findByNamedQuery(ServiceProvided.FIND_BY_ANM_IDENTIFIER_WITH_INDICATOR_FOR_MONTH,
                indicator, LocalDate.parse(startDate).toDate(), LocalDate.parse(endDate).toDate());
        dataAccessTemplate.deleteAll(result);
    }

    public List<ServiceProvidedReport> getNewReports(Integer token) {
        return dataAccessTemplate.findByNamedQuery(ServiceProvidedReport.FIND_NEW_SERVICE_PROVIDED, token);
    }

    public List<ServiceProvided> getAllReportsForDristhiEntityID(String dristhiEntityID) {
        return dataAccessTemplate.findByNamedQuery(ServiceProvided.FIND_SERVICE_PROVIDED_FOR_DRISTHI_ENTITY_ID, dristhiEntityID);
    }

    public List<ServiceProvidedReport> getNewReports(Integer token, int numberOfRowsToFetch) {
        return dataAccessTemplate.getSessionFactory()
                .getCurrentSession()
                .getNamedQuery(ServiceProvidedReport.FIND_NEW_SERVICE_PROVIDED)
                .setParameter(0, token)
                .setMaxResults(numberOfRowsToFetch)
                .list();

    }

    public void deleteReportsFor(String dristhiEntityId) {
        dataAccessTemplate.deleteAll(getAllReportsForDristhiEntityID(dristhiEntityId));
    }

    public void ecsave(String entityid, String phonenumber) {
        logger.info("####### ecsave method invoked$$$$$");
        dataAccessTemplate.save(new EcRegDetails(entityid, phonenumber));

    }

    public void ancsave(String entityid, String patientnum, String anmnum, String visittype, Integer visitno, String lmpdate, String womenname, String visitdate, String anmid) {
        logger.info("####### ancsave method invoked$$$$$");
        dataAccessTemplate.save(new ANCVisitDue(entityid, patientnum, anmnum, visittype, visitno, lmpdate, womenname, visitdate, anmid));

    }

    public void ecupdate(Integer id, String phoneNumber) {

        EcRegDetails objectToUpdate = (EcRegDetails) dataAccessTemplate.get(EcRegDetails.class, id);
        objectToUpdate.setphonenumber(phoneNumber);
        dataAccessTemplate.saveOrUpdate(objectToUpdate);
        logger.info(" visit date: " + objectToUpdate);
        logger.info(" visit date2: ");
    }

    public void ancupdate(Integer id, String phonenumber) {

        ANCVisitDue objectToUpdate = (ANCVisitDue) dataAccessTemplate.get(ANCVisitDue.class, id);
        objectToUpdate.setpatientnum(phonenumber);
        dataAccessTemplate.saveOrUpdate(objectToUpdate);
        logger.info(" visit date: " + objectToUpdate);
        logger.info(" visit date2: ");
    }

    public void ancvisitupdate(Integer id, String newdate, Integer visitno) {

        ANCVisitDue objectToUpdate = (ANCVisitDue) dataAccessTemplate.get(ANCVisitDue.class, id);
        objectToUpdate.setvisitdate(newdate);
        objectToUpdate.setvisitno(visitno);
        dataAccessTemplate.saveOrUpdate(objectToUpdate);
        logger.info(" visit date: " + objectToUpdate);
        logger.info(" visit date2: ");
    }
    public void pocvisitupdate(int rid, String visittype, String visitentityid, String entityidec, String anmid, String phc, String timestamp, String wifename) {
    	Integer id= rid;
    	POC_Table objectToUpdate = (POC_Table) dataAccessTemplate.get(POC_Table.class, id);
    	java.util.Date date = new java.util.Date();
        Timestamp timestamp1 = new Timestamp(date.getTime());
    	
        objectToUpdate.setvisittype(visittype);
        objectToUpdate.setanmid(anmid);
        objectToUpdate.setphc(phc);
        objectToUpdate.settimestamp(timestamp1);
        objectToUpdate.setwifename(wifename);

        dataAccessTemplate.saveOrUpdate(objectToUpdate);
        logger.info(" POC Update: " + objectToUpdate);
     
    }
    

public void pocDelete(List pocDetails) {
	

    dataAccessTemplate.deleteAll(pocDetails);
    logger.info(" POC Update: " + pocDetails);
 
}

    public void pocsave(String visittype, String visitentityid, String entityidec, String anmid, String phc, String timestamp, String wifename) {
        logger.info("####### pocsave method invoked$$$$$" + phc);

        java.util.Date date = new java.util.Date();
        Timestamp timestamp1 = new Timestamp(date.getTime());

        dataAccessTemplate.save(new POC_Table(visitentityid, entityidec, anmid, "1", " ", " ", visittype, phc, " ", " ", timestamp1, wifename));

    }
    public void reportsave(String visitentityid, String entityidec, String patient_name, String anm_id, String activity, String indicator, Integer indicator_count, String date, String location, Integer child_weight, String other_date, String visit_location,String dob) {
        logger.info("####### anc report save method invoked$$$$$");
        dataAccessTemplate.save(new APPReport(visitentityid,entityidec, patient_name, anm_id, activity, indicator, indicator_count, date, location, child_weight,other_date,visit_location,dob));
        logger.info("report data save done");
    }
    
    public void ecsave(String visitentityid, String entityidec,
			String patient_name, String anm_id, String activity,
			String indicator, Integer indicator_count, String date,
			String location, Integer child_weight, String other_date,
			String visit_location, String dob) {

		dataAccessTemplate.save(new APPReport(visitentityid, entityidec,
				patient_name, anm_id, activity, indicator, indicator_count,
				date, location, child_weight, other_date, visit_location, dob));

	}

	public void ancsave(String visitentityid, String entityidec,
			String patient_name, String anm_id, String activity,
			String indicator, Integer indicator_count, String date,
			String location, Integer child_weight, String other_date,
			String visit_location, String dob) {

		dataAccessTemplate.save(new APPReport(visitentityid, entityidec,
				patient_name, anm_id, activity, indicator, indicator_count,
				date, location, child_weight, other_date, visit_location, dob));

	}

	public void pncsave(String visitentityid, String entityidec,
			String patient_name, String anm_id, String activity,
			String indicator, Integer indicator_count, String date,
			String location, Integer child_weight, String other_date,
			String visit_location, String dob) {

		dataAccessTemplate.save(new APPReport(visitentityid, entityidec,
				patient_name, anm_id, activity, indicator, indicator_count,
				date, location, child_weight, other_date, visit_location, dob));

	}
	
	  public void anctopncsave(String visitentityid, String entityidec,
				String patient_name, String anm_id, String activity,
				String indicator, Integer indicator_count, String date,
				String location, Integer child_weight, String other_date,
				String visit_location, String dob) {

			dataAccessTemplate.save(new APPReport(visitentityid, entityidec,
					patient_name, anm_id, activity, indicator, indicator_count,
					date, location, child_weight, other_date, visit_location, dob));

		}
}
