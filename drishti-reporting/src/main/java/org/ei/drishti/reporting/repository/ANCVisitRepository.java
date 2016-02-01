/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.ei.drishti.reporting.repository;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Repository
public class ANCVisitRepository {

    private static Logger logger = LoggerFactory
            .getLogger(ANCVisitRepository.class.toString());

    private AllServicesProvidedRepository servicesProvidedRepository;

    protected ANCVisitRepository() {

    }

    @Autowired
    public ANCVisitRepository(AllServicesProvidedRepository servicesProvidedRepository) {
        this.servicesProvidedRepository = servicesProvidedRepository;
    }

    @Transactional("service_provided")
    public void insert(String entityId, String phoneNumber, String anmnum, String visittype, Integer visitno, String lmpdate, String womenname, String visitdate, String anmid) {
        logger.info("******ancvisitrepository**");
        servicesProvidedRepository.ancsave(entityId, phoneNumber, anmnum, visittype, visitno, lmpdate, womenname, visitdate, anmid);

    }

    @Transactional("service_provided")
    public void ecinsert(String entityId, String phonenumber) {

        logger.info("******ancvisitrepository**");
        servicesProvidedRepository.ecsave(entityId, phonenumber);

    }

    @Transactional("service_provided")
    public void ecUpdate(Integer id, String phoneNumber) {
        logger.info("******ancvisitrepository invoked**");
        servicesProvidedRepository.ecupdate(id, phoneNumber);

    }

    @Transactional("service_provided")
    public void ancregUpdate(Integer id, String phoneNumber) {
        logger.info("******ancvisitrepository invoked**");
        servicesProvidedRepository.ancupdate(id, phoneNumber);

    }

    @Transactional("service_provided")
    public void ancUpdate(Integer id, String newdate, Integer visitno) {
        logger.info("******ancvisitrepository invoked**");
        servicesProvidedRepository.ancvisitupdate(id, newdate, visitno);

    }

    @Transactional("service_provided")
    public void pocinsert(String visittype, String visitentityid, String entityidEC, String anmid, String phc, String timestamp, String wifename) {

        logger.info("******ancvisitrepository**");
        servicesProvidedRepository.pocsave(visittype, visitentityid, entityidEC, anmid, phc, timestamp, wifename);

    }
    @Transactional("service_provided")
    public void reportinsert(String visitentityid, String entityidec, String patient_name, String anm_id, String activity, String indicator, Integer indicator_count, String date, String location, Integer child_weight, String other_date, String visit_location, String dob) {
        logger.info("******anc report repository**");
        servicesProvidedRepository.reportsave(visitentityid,entityidec, patient_name, anm_id, activity, indicator, indicator_count, date, location, child_weight,other_date,visit_location,dob);
                                                
    }
    
    

	@Transactional("service_provided")
	public void ecinsert(String visitentityid, String entityidec,
			String patient_name, String anm_id, String activity,
			String indicator, Integer indicator_count, String date,
			String location, Integer child_weight, String other_date,
			String visit_location, String dob) {
		servicesProvidedRepository.ecsave(visitentityid, entityidec,
				patient_name, anm_id, activity, indicator, indicator_count,
				date, location, child_weight, other_date, visit_location, dob);

	}

	@Transactional("service_provided")
	public void ancinsert(String visitentityid, String entityidec,
			String patient_name, String anm_id, String activity,
			String indicator, Integer indicator_count, String date,
			String location, Integer child_weight, String other_date,
			String visit_location, String dob) {

		servicesProvidedRepository.ancsave(visitentityid, entityidec,
				patient_name, anm_id, activity, indicator, indicator_count,
				date, location, child_weight, other_date, visit_location, dob);

	}

	@Transactional("service_provided")
	public void pncinsert(String visitentityid, String entityidec,
			String patient_name, String anm_id, String activity,
			String indicator, Integer indicator_count, String date,
			String location, Integer child_weight, String other_date,
			String visit_location, String dob) {

		servicesProvidedRepository.pncsave(visitentityid, entityidec,
				patient_name, anm_id, activity, indicator, indicator_count,
				date, location, child_weight, other_date, visit_location, dob);

	}
    

}
