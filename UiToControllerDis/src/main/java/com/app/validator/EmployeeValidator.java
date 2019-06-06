package com.app.validator;
import java.util.regex.Pattern;

import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.app.model.Employee;
@Component
public class EmployeeValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		// Support only Employee class objects
		return Employee.class.equals(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		Employee e=(Employee)target;
	 if(!Pattern.matches("[A-Z]{4,6}",e.getEmpName())) {
		 errors.rejectValue("empName",null, "please enter valid name");
	 }
	 if(!Pattern.matches("[A-Za-z0-9]{3,6}",e.getEmpPwd())) {
		 errors.rejectValue("empPwd",null,"please enter valid password");
	 }
	 if(!StringUtils.hasText(e.getEmpGen())) {
		 errors.rejectValue("empGen",null, "please choose valid gender");;
	 }
	 if(!Pattern.matches("[A-Z]{5,10}",e.getEmpAddr())) {
		 errors.rejectValue("empAddr", null,"please enter valid address");
	 }
	 if(!StringUtils.hasText(e.getEmpCountry())) {
		 errors.rejectValue("empCountry", null,"plese select your country");
	 }
	 if(e.getEmpLangs()==null||e.getEmpLangs().isEmpty()) {
		 errors.rejectValue("empLangs", null, "please schoose atleast one langage");
	 }
		
	}

	
}
