package com.yash.candidaterestapi.resource;



import java.util.List; 

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.yash.candidaterestapi.model.Candidate;
import com.yash.candidaterestapi.model.Marks;
import com.yash.candidaterestapi.service.CandidateService;

@Path("/resources")
public class CandidateResource {
	
	CandidateService candidateService= new CandidateService();
	
	
	@GET
	@Path("/id/{candidateId}")
	@Produces(MediaType.APPLICATION_XML)
	public Candidate getCandidateById(@PathParam("candidateId") int candidateId){
		return candidateService.getCandidate(candidateId);
	}
	
	@GET
	@Path("/city/{candidateCity}")
	@Produces(MediaType.APPLICATION_XML)
	public List<Candidate> getCandidateByCity(@PathParam("candidateCity") String city){
		return candidateService.getCandidateByCityService(city);
	}
	
	@GET
	@Path("/standard/{candidateStandard}")
	@Produces(MediaType.APPLICATION_XML)
	public List<Marks> getCandidateMarksTenth(@PathParam("candidateStandard") int standard){
		return candidateService.getCandidateMarksTenth(standard);
	}
	
}
