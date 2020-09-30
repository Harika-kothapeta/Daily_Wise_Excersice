package com.pack.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pack.model.Student;

@Controller
public class StudentController {
	@RequestMapping(value="/details")
	public String loginForm(ModelMap m) {
		Student s = new Student();
		m.addAttribute("validationPage",s);
		return "student";
	}
	@RequestMapping(value="/validation")
	public String validationCheck(@Validated @ModelAttribute("validationPage") Student s1,BindingResult result)
	{
		String res1;
		if(result.hasErrors())
		{
			res1="student";
		}
		else
		{
			res1="studentpage";
		}
		return res1;
	}
	@ModelAttribute("genderButton")
	public List<String> firstList(){
		List<String>genderButton=new ArrayList<>();
		genderButton.add("Male");
		genderButton.add("Female");
		return genderButton;
	}
	@ModelAttribute("modeChecklist")
	public List<String> secondList(){
		List<String> modeChecklist=new ArrayList<>();
		modeChecklist.add("English");
		modeChecklist.add("Science");
		modeChecklist.add("Social");
		return modeChecklist;
	}
}
