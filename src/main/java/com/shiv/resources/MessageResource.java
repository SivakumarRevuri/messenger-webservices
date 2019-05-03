package com.shiv.resources;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.shiv.businees.BusinessOperations;
import com.shiv.businees.BussinessOperImpl;
import com.shiv.model.Message;

@Path("/messages")
public class MessageResource implements BusinessOperations {
	
	private BussinessOperImpl implementation = new BussinessOperImpl();

	@POST
	@Override
	public Message addMessage(Message message) throws Exception {
		return implementation.addMessage(message);
	}

	@Override
	public boolean updateMessage(Message message) throws Exception {
		return false;
	}

	@Override
	public boolean deleteMessage(Message message) throws Exception {
		return false;
	}

	@GET
	@Produces(MediaType.APPLICATION_XML)
	@Override
	public List<Message> getAllMessages() throws Exception {
		return implementation.getAllMessages();
	}

	@Override
	public Message getMessageById(long id) throws Exception {
		return null;
	}

}
