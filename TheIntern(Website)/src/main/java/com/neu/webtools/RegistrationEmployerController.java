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
@Controller
public class RegistrationEmployerController {
	@Autowired
    @Qualifier("employerValidator")
    //RegistrationValidator2 validator;
	RegistrationValidator2 validator;
    @InitBinder
    private void initBinder(WebDataBinder binder) {
        binder.setValidator(validator);
    }
    
	@RequestMapping(value= "/addemployer", method = RequestMethod.POST)
   public String addPerson(@ModelAttribute("employer")Employer employer,BindingResult result,Model model){
		validator.validate(employer, result);
		   if (result.hasErrors()) {
			   
			   
	            return "employeesignup";
	        }

     
   	try {
//   		HttpSession session = request.getSession();
//       	users=(UserAccount)session.getAttribute("user1");
       	//System.out.println("HIIIIIIIIIIIIIIIIIII");
   		//System.out.println(combined.getJobSeeker());
   		PersonDao personDao=new PersonDao();
   		Boolean isValid=personDao.employeeCheck(employer);
       	if(!isValid){
       		model.addAttribute("error",true);
       		return "employeesignup";
       	           	
       	}
       	
			
   		
   		
   		
   		personDao.createEmployer(employer.getUserName(), employer.getPassword(),employer.getFirstName(), employer.getLastName());
			
   		
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
