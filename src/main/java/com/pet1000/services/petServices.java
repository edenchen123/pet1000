package com.pet1000.services;

import javax.jws.WebService;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.pet1000.security.Permission;


@WebService(serviceName = PetServices.SERVICE_NAME, targetNamespace = "http://www.pet1000.com/pet100/petServices")
@Consumes({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
@Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })


public interface PetServices {

	public final static String SERVICE_NAME = "petService";


	@Permission(permission="READ")
	@GET
	@Produces({MediaType.APPLICATION_JSON })
	@Path("/getAllAvaServices/{username}")
	public String getAllAvaServices(@PathParam("username") String userName) throws Exception;




}
