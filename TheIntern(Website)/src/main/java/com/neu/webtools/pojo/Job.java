package com.neu.webtools.pojo;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table
public class Job {
	
	@OneToMany(mappedBy="job")
	private Set<JobsApplied> ja=new HashSet<JobsApplied>();
	
	public long getId() {
		return id;
	}
	

	public String getCompanyName() {
		return companyName;
	}


	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}


	public String getLocation() {
		return location;
	}


	public void setLocation(String location) {
		this.location = location;
	}


	public void setId(long id) {
		this.id = id;
	}

	public Employer getEmployer() {
		return employer;
	}

	public void setEmployer(Employer employer) {
		this.employer = employer;
	}

	public String getExperience() {
		return experience;
	}

	public void setExperience(String experience) {
		this.experience = experience;
	}

	public String getJobFunction() {
		return jobFunction;
	}

	public void setJobFunction(String jobFunction) {
		this.jobFunction = jobFunction;
	}

	public String getJobDescription() {
		return jobDescription;
	}

	public void setJobDescription(String jobDescription) {
		this.jobDescription = jobDescription;
	}

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	@Column(name="jobId",unique=true,nullable=false)
    private long id;
	
	
	
	@ManyToOne(fetch=FetchType.EAGER,cascade=CascadeType.ALL)//Advert To User Many To One Join
	@JoinColumn(name="personID")
    private Employer employer;
	
	@Column(name="industry")
	private String industry;
	
	@Column(name="jobTitle")
	private String jobTitle;
	
	@Column(name="experience")
	private String experience;
	
	@Column(name="jobFunction")
	private String jobFunction;
	
	@Column(name="companyName")
	private String companyName;
	
	@Column(name="location")
	private String location;
	
	@Column(name="date")
	private Date date;
	
	
	
	@Column(name="jobDescription")
	private String jobDescription;
	public String getIndustry() {
		return industry;
	}

	public void setIndustry(String industry) {
		this.industry = industry;
	}
	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}


	public Set<JobsApplied> getJa() {
		return ja;
	}


	public void setJa(Set<JobsApplied> ja) {
		this.ja = ja;
	}
	
	public Date getDate() {
		return date;
	}


	public void setDate(Date date) {
		this.date = date;
	}


	public Job(){}
	
		


}
