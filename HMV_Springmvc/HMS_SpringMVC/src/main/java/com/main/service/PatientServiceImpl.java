package com.main.service;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import com.main.dao.PatientDao;
import com.main.model.Patient;

public class PatientServiceImpl implements PatientService {
	private static Logger log=Logger.getLogger(PatientServiceImpl.class);
	@Autowired
	private PatientDao patientDao;

	@Override
	public void savePatient(Patient patient) {
		// TODO Auto-generated method stub
		log.info("Inside savePatient()");
		patientDao.savePatient(patient);
		
	}

}
