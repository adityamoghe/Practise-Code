package com.yash.usingproduceconsume.service;

import com.google.gson.Gson;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.yash.usingproduceconsume.domain.User;

@Path("/UserService")
public class UserService {

	User user = new User("Aditya", "Indore", 80000);

	@GET
	@Path("/users")
	@Produces(MediaType.APPLICATION_JSON)

	public String getUsers() {
		String gson= new Gson().toJson(user);
		
		return gson;
	}
	
	@Path("/consume")
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	
	
	public void getUser(User user){
		System.out.println("Consumer called");
	}

}
