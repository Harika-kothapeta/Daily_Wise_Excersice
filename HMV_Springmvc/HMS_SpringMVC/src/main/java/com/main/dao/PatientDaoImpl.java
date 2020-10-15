package com.main.dao;

import org.apache.log4j.Logger;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.main.model.Patient;
@Repository
public class PatientDaoImpl implements PatientDao {
	private static Logger log=Logger.getLogger(PatientDaoImpl.class);
	 @Autowired
		private SessionFactory sessionFactory;
	@Override
	public void savePatient(Patient patient) {
		// TODO Auto-generated method stub
		log.info("Inside dao savePatient()");
		sessionFactory.getCurrentSession().save(patient);
		
		
	}
	
}
