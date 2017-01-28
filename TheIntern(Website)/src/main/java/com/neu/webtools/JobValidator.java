package com.neu.webtools;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.neu.webtools.pojo.Job;
import com.neu.webtools.pojo.JobSeeker;

public class JobValidator implements Validator{

	@Override
	 public boolean supports(Class aClass)
   {
       return aClass.equals(Job.class);
   }

	@Override
	public void validate(Object obj, Errors errors) {

        Job user = (Job) obj;
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "companyName", "error.invalid.user", "Company Name Required");
       ValidationUtils.rejectIfEmptyOrWhitespace(errors, "jobTitle", "error.invalid.user", " Job Title Required");
       ValidationUtils.rejectIfEmptyOrWhitespace(errors, "jobDescription", "error.invalid.user", " Job Description Required");
      //  ValidationUtils.rejectIfEmptyOrWhitespace(errors, "lastName", "error.invalid.user", "Last Name Required");
       // ValidationUtils.rejectIfEmptyOrWhitespace(errors, "userName", "error.invalid.user", "User Name Required");
       // ValidationUtils.rejectIfEmptyOrWhitespace(errors, "password", "error.invalid.user", "Password Required");
       // ValidationUtils.rejectIfEmptyOrWhitespace(errors, "emailAddress", "error.invalid.user", "Email Required");
        
	}
}
