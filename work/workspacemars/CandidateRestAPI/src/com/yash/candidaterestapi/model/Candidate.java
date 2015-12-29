package com.yash.candidaterestapi.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Candidate {
	
	int candidate_id;
	String name;
	String city;
	Marks marks;
	
	public Candidate() {
		// TODO Auto-generated constructor stub
	}
	
	public Candidate(int candidate_id, String name, String city, Marks marks) {
		super();
		this.candidate_id = candidate_id;
		this.name = name;
		this.city = city;
		this.marks = marks;
	}

	public int getCandidate_id() {
		return candidate_id;
	}
	public void setCandidate_id(int candidate_id) {
		this.candidate_id = candidate_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Marks getMarks() {
		return marks;
	}
	public void setMarks(Marks marks) {
		this.marks = marks;
	}
}
