package com.shiv.resources;

import javax.ws.rs.CookieParam;
import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.MatrixParam;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/otherparams")
public class OtherResources {

	@GET
	@Produces(MediaType.APPLICATION_XML)
	public String getTestMethod(@MatrixParam("value") int value, @CookieParam("cookie") String cookie,
			@HeaderParam("header") String header) {
		return "Matrix param value: " + value + "; Cookie Param: " + cookie + "; Header param: " + header;
	}
}
