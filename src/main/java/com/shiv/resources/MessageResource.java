package com.shiv.resources;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.shiv.businees.BusinessOperations;
import com.shiv.model.Message;

@Path("/messages")
public class MessageResource implements BusinessOperations {

	protected final Map<Long, Message> messageSource = new HashMap<>();

	public MessageResource() {
		messageSource.put(1L, new Message(1, "Hello World", "Shiv", new Date()));
	}

	@Override
	public void addMessage(Message message) throws Exception {

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
		messageSource.put(1L, new Message(1, "Hello World", "Shiv", new Date()));
		Collection<Message> values = messageSource.values();
		return new ArrayList<>(values);
	}

	@Override
	public Message getMessageById(long id) throws Exception {
		return null;
	}

}
