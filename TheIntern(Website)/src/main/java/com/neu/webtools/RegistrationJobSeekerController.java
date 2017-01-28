package com.neu.webtools;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.neu.webtools.dao.PersonDao;
import com.neu.webtools.pojo.Employer;
import com.neu.webtools.pojo.JobSeeker;

@Controller
public class RegistrationJobSeekerController {
	@Autowired
    @Qualifier("userValidator")
    RegistrationValidator validator;

    @InitBinder
    private void initBinder(WebDataBinder binder) {
        binder.setValidator(validator);
    }
	
	
	
	@RequestMapping(value= "/addjobseeker", method = RequestMethod.POST)
    public String addPerson(@ModelAttribute("jobseeker")JobSeeker jobseeker,BindingResult result,Model model){
		   validator.validate(jobseeker, result);
		   if (result.hasErrors()) {
	            return "usersignup";
	        }

      
    	try {
//    		HttpSession session = request.getSession();
//        	users=(UserAccount)session.getAttribute("user1");
        	//System.out.println("HIIIIIIIIIIIIIIIIIII");
    		//System.out.println(combined.getJobSeeker());
    		PersonDao personDao=new PersonDao();
    		Boolean isValid=personDao.employeeCheck(jobseeker);
        	if(!isValid){
        		model.addAttribute("error",true);
        		return "usersignup";
        	           	
        	}
        	
			
    		
    		
    		
    		personDao.create(jobseeker.getUserName(), jobseeker.getPassword(),jobseeker.getFirstName(), jobseeker.getLastName());
			
    		
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	return "registrationsuccess";
        }
	
    
}
