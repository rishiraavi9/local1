package com.neu.webtools;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.neu.webtools.pojo.JobSeeker;
import com.neu.webtools.pojo.Person;


	@Component
	public class LoginValidator implements Validator{

		@Override
		 public boolean supports(Class aClass)
	    {
	        return aClass.equals(Person.class);
	    }
		@Override
		public void validate(Object obj, Errors errors) {

	        Person user = (Person) obj;
	       
	        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "userName", "error.invalid.user", "User Name Required");
	        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "password", "error.invalid.user", "Password Required");
	       // ValidationUtils.rejectIfEmptyOrWhitespace(errors, "emailAddress", "error.invalid.user", "Email Required");
	        
		}

}
