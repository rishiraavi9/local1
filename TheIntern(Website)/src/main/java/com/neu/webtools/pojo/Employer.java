package com.neu.webtools.pojo;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;



@Entity
@Table
@PrimaryKeyJoinColumn(name="personID")
public class Employer extends Person{
	
	public Employer(){}
	
	
	@OneToMany(fetch=FetchType.EAGER,mappedBy="employer")
	private Set<Job> jobs = new HashSet<Job>();

	

	public Set<Job> getJobs() {
		return jobs;
	}

	public void setJobs(Set<Job> jobs) {
		this.jobs = jobs;
	}
	public void addJob(Job job){
		getJobs().add(job);
	}
	
	
}
