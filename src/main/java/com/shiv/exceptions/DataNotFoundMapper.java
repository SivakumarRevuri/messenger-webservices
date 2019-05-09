package com.shiv.exceptions;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

import com.shiv.model.ErrorMessageModel;

@Provider
public class DataNotFoundMapper implements ExceptionMapper<DataNotFoundException>{

	@Override
	public Response toResponse(DataNotFoundException exception) {
		ErrorMessageModel entity = new ErrorMessageModel();
		entity.setErrorCode("404");
		entity.setErrorMessage(exception.getMessage());
		entity.setErrorRef("https://jersey.github.io/");
		return Response.status(Status.NOT_FOUND).entity(entity).build();
	}

}
