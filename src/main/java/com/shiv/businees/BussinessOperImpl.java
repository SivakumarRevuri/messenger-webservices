package com.shiv.businees;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.ws.rs.GET;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.shiv.database.DatabaseSource;
import com.shiv.model.Message;

public class BussinessOperImpl implements BusinessOperations {

	protected final Map<Long, Message> messages = DatabaseSource.getMessageSource();
	
	public BussinessOperImpl() {
		messages.put(1L, new Message(1, "Hello World", "Shiv", new Date()));
		messages.put(2L, new Message(2, "Hi there!!!", "Shiv", new Date()));
	}

	@Override
	public Message addMessage(Message message) throws Exception {
		messages.put((long) (messages.size() + 1), message);
		return message;
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
		Collection<Message> values = messages.values();
		return new ArrayList<>(values);
	}

	@Override
	public Message getMessageById(long id) throws Exception {
		return null;
	}

}
