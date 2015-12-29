package com.yash.restdemo.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;



@Path("/us")
public class UserService {
		
		   @GET
		   @Path("/um")
		   @Produces(MediaType.TEXT_PLAIN)
		   public String getUsers(){
		      return "Hello!!!!";
		}

		
}
