package com.neu.webtools.dao;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.neu.webtools.pojo.Employer;
import com.neu.webtools.pojo.JobSeeker;
import com.neu.webtools.pojo.Person;




public class PersonDao extends DAO{
	
/*public void addJobSeeker(JobSeeker jobSeeker,UserAccount user) throws Exception{
		
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		//System.out.println("patient name"+patient.getFirstName());
		user.setPerson(jobSeeker);
		user.setRole("JobSeeker");
		
        session.persist(user);
        //p.setUserAccount(userAccount);
        tx.commit();
		close();
	
}*/
	public Person queryEmployeeByNameAndPassword(String userName, String password)
            throws Exception {
		try {
			begin();
            Query q = getSession().createQuery("from Person where userName = :userName and password = :password");
            //System.out.println("risssssssssssssss"+userName);
            q.setString("userName", userName);
            q.setString("password", password);
            
            Person userAccount = (Person) q.uniqueResult();
            //System.out.println("USSSS"+userAccount.getUserName());
            if(userAccount==null){
            	System.out.println("no userrrr");
            }
            commit();
            return userAccount;
		} catch (Exception e) {
			rollback();
            
		}
		return null;	
    }
	
public JobSeeker create(String username, String password, String firstName, String lastName)
        throws Exception {
    try {
        begin();
        System.out.println("inside DAO");
        
       
        
        JobSeeker job=new JobSeeker();
        job.setFirstName(firstName);
        job.setLastName(lastName);
        job.setUserName(username);
        job.setPassword(password); 
        job.setRole("JobSeeker");
       
        
       // user.setFirstName(firstName);
        //user.setLastName(lastName);
        
        //user.setEmail(email);
        
        //email.setUser(user);
        
        getSession().save(job);
        
        commit();
        return job;
    } catch (HibernateException e) {
        rollback();
        //throw new AdException("Could not create user " + username, e);
        throw new Exception("Exception while creating user: " + e.getMessage());
    }
}


public Employer createEmployer(String username, String password, String firstName, String lastName)
        throws Exception {
    try {
        begin();
        System.out.println("inside DAO");
        
       
        
        Employer job=new Employer();
        job.setFirstName(firstName);
        job.setLastName(lastName);
        job.setUserName(username);
        job.setPassword(password); 
        
        job.setRole("Employer");
       
        
       // user.setFirstName(firstName);
        //user.setLastName(lastName);
        
        //user.setEmail(email);
        
        //email.setUser(user);
        
        getSession().save(job);
        
        commit();
        return job;
    } catch (HibernateException e) {
        rollback();
        //throw new AdException("Could not create user " + username, e);
        throw new Exception("Exception while creating user: " + e.getMessage());
    }
}

public Boolean employeeCheck(Person person) throws Exception{
	
	
	ArrayList<Person> users = new ArrayList();
	Query q = getSession().createQuery("from Person");
	
	users = (ArrayList<Person>)q.list();
	for(Person u:users){
		System.out.println("given"+person.getUserName()+"actual"+u.getUserName());
		if(person.getUserName().equalsIgnoreCase(u.getUserName())){
			//model.addAttribute("error", "");
			
			return false;
		}
	}
	return true;

}
public Employer get(String userName)
        throws Exception {
	try {
		
        Query q = getSession().createQuery("from Employer where userName = :userName");
        //System.out.println("risssssssssssssss"+userName);
        q.setString("userName", userName);
      
        Employer userAccount = (Employer) q.uniqueResult();
        //System.out.println("USSSS"+userAccount.getUserName());
        if(userAccount==null){
        	System.out.println("no userrrr");
        }
        close();
        return userAccount;
	} catch (HibernateException e) {
		
        throw new Exception("Could not get user " + userName, e);
	}	
}
public Employer getEmployeeDetails(long id)
        throws Exception {
	try {
		
        Query q = getSession().createQuery("from Job where personID: ");
        //System.out.println("risssssssssssssss"+userName);
        q.setLong("personID", id);
      
        Employer userAccount = (Employer) q.uniqueResult();
        //System.out.println("USSSS"+userAccount.getUserName());
        if(userAccount==null){
        	System.out.println("no userrrr");
        }
        close();
        return userAccount;
	} catch (HibernateException e) {
		
        throw new Exception("Could not get user " );
	}	
}
public JobSeeker getSeeker(String userName)
        throws Exception {
	try {
		
        Query q = getSession().createQuery("from JobSeeker where userName = :userName");
        //System.out.println("risssssssssssssss"+userName);
        q.setString("userName", userName);
      
        JobSeeker userAccount = (JobSeeker) q.uniqueResult();
        //System.out.println("USSSS"+userAccount.getUserName());
        if(userAccount==null){
        	System.out.println("no userrrr");
        }
        close();
        return userAccount;
	} catch (HibernateException e) {
		
        throw new Exception("Could not get user " + userName, e);
	}	
}
public List list() throws Exception {
    try {
        begin();
        Query q = getSession().createQuery("from Employer");
        List list = q.list();
        commit();
        return list;
    } catch (HibernateException e) {
        rollback();
        throw new Exception("Could not list the categories", e);
    }
}

public void updateProfile(long personID, String email, String address, String firstName, String lastName) {
	// TODO Auto-generated method stub
	try{
		begin();
		Query q = getSession().createQuery("from JobSeeker where personID = :personID");
		 q.setLong("personID",personID);
		 
		 JobSeeker j = (JobSeeker) q.uniqueResult(); 
		 j.setFirstName(firstName);
		 j.setLastName(lastName);
		 j.setAddress(address);
		 j.setEmail(email);
		 getSession().update(j);
		 commit();
		
	}
	catch(Exception e){
		e.printStackTrace();
		rollback();
		
	}
}


}
