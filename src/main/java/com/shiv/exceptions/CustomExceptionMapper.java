package com.shiv.exceptions;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

import com.shiv.model.ErrorMessageModel;

// since this implements by Throwable it becomes generic exception handler for through out the exception
// just to avoid this, we can avoid registering this class by commenting @Provider 
@Provider
public class CustomExceptionMapper implements ExceptionMapper<Throwable> {

	@Override
	public Response toResponse(Throwable exception) {
		ErrorMessageModel entity = new ErrorMessageModel();
		entity.setErrorCode("500");
		entity.setErrorMessage(exception.getMessage());
		entity.setErrorRef("https://jersey.github.io/");
		return Response.status(Status.INTERNAL_SERVER_ERROR).entity(entity).build();
	}

}
