package com.main.controller;

import java.util.List;
import java.util.Random;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

//import java.util.Random;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.main.model.Patient;
import com.main.model.Physician;
import com.main.service.PatientService;

@Controller
public class PatientController {
	private static Logger log=Logger.getLogger(PatientController.class);
	 @Autowired
	    private PatientService patientService;	
	@RequestMapping(value="/redirect")
	public String loadRegistrationForm() {
	    return "links";
	}
		@RequestMapping(value="/patient",method=RequestMethod.GET)
		public String loadRegistrationForm(ModelMap map) {
			log.info("Request inside loadRegistration");
			Patient patient=new Patient(); 
		    map.addAttribute("patForm",patient);
		    return "PatientSuccess";
		}
		@RequestMapping(value="/savepat",method=RequestMethod.POST)
		public String savePatient(@Validated @ModelAttribute("patForm") Patient patient, BindingResult result,
				                   ModelMap map) {
			String viewPage;
			if(result.hasErrors()) {
				viewPage="PatientSuccess";
			}
			else
			{
				log.info("Invoking savePatient method");
				Random r=new Random();
				int patid=r.nextInt(99999) +10000;
				patient.setId(patid);
				patientService.savePatient(patient);
				 //List<Patient> patList = patientService.fetchPatient();
		         //map.addAttribute("patientList", patList);

				viewPage="PatientSuccessfile";
			}
			return viewPage;
		}
		@RequestMapping(value="/physician",method=RequestMethod.GET)
		public String loadRegistrationForm1(ModelMap map) {
		    Physician physician=new Physician(); 
		    map.addAttribute("phyForm",physician);
		    return "PhysicianSuccess";
		}
		@RequestMapping(value="/savephy",method=RequestMethod.POST)
		public String savePhysician(@Validated @ModelAttribute("phyForm") Physician physician, BindingResult result,
				                   ModelMap map) {
			String viewPage1;
			if(result.hasErrors()) {
				viewPage1="PhysicianSuccess";
			}
			else
			{
				//Random r=new Random();
				//int phyid=r.nextInt(99999) +10000;
				//patient.setId(phyid);
				viewPage1="PhysicianSuccessfile";
			}
			return viewPage1;
		}
}
