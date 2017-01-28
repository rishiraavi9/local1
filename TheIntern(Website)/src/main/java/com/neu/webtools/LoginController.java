package com.neu.webtools;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

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
import com.neu.webtools.pojo.Person;




@Controller
public class LoginController {
	@Autowired
    @Qualifier("loginValidator")
    
	LoginValidator validator;
    @InitBinder
    private void initBinder(WebDataBinder binder) {
        binder.setValidator(validator);
    }
	
	
	@RequestMapping(value="/loginpage" ,method=RequestMethod.POST)
    public String submitForm(HttpServletRequest request, HttpServletResponse response,@ModelAttribute("person")Person person,Model model,BindingResult result){
		 //model.addAttribute("person", new Person());
		validator.validate(person, result);
		   if (result.hasErrors()) {
	            return "login";
	        }

   
		PersonDao personDao=new PersonDao();
		try{
			
			Person userAccount=personDao.queryEmployeeByNameAndPassword(person.getUserName(),person.getPassword());
			Employer empAccount=personDao.get(person.getUserName());
			JobSeeker jobseekerAccount=personDao.getSeeker(person.getUserName());
			HttpSession session = request.getSession();
			if(userAccount.getRole().equalsIgnoreCase("JobSeeker")){
				
			   
			    //Person p1=new Person();
			    
			    //model.addAttribute("p1",p1);
			    System.out.println(userAccount.getFirstName());
			    session.setAttribute("jobseekerAccount",jobseekerAccount);
			    
			    System.out.println(jobseekerAccount.getLastName());
				return"jobseekerhome";
				
			}
			if(userAccount.getRole().equalsIgnoreCase("Employer")){
				//HttpSession session = request.getSession();
			   
			    //Person p1=new Person();
			    
			    //model.addAttribute("p1",p1);
			   // System.out.println(userAccount.getFirstName());
			    session.setAttribute("empAccount",empAccount);
				return"employerhome";
				
			}
			
			
			
		}
		
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
	    	//	return "loginError";
	}
		model.addAttribute("error",true);
		
		return"login";

	}
	
}
