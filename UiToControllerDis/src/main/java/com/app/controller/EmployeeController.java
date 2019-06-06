package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.app.model.Employee;
import com.app.validator.EmployeeValidator;

@Controller
@RequestMapping("/emp")
public class EmployeeController {
	@Autowired
	private EmployeeValidator validator;
	//1. Show Register Form with Form Backing Object
	@RequestMapping("/reg")
	public ModelAndView showReg() {
		ModelAndView m=new ModelAndView();
		m.setViewName("Register");
		
		
		//Form Backing Object
		Employee e=new Employee();
		//modelAttribute="___"
		m.addObject("employee", e);
		return m;
	}
	
	//2. Read form data
	@RequestMapping(value = "/save",method = RequestMethod.POST)
	public ModelAndView readForm(@ModelAttribute Employee employee,Errors errors) {
		
		validator.validate(employee, errors);
		ModelAndView m=new ModelAndView();
		if(errors.hasErrors()) {
			m.setViewName("Register");
		}
		else {
			m.setViewName("Data");
			System.out.println(employee);
		m.addObject("emp", employee);
		}
		return m;
	}	
}
