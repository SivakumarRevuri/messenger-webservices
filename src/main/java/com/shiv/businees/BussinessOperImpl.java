package com.shiv.businees;

import java.util.Date;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.shiv.database.DatabaseSource;
import com.shiv.model.Message;

public class BussinessOperImpl implements BusinessOperations {

	protected DatabaseSource source;

	public BussinessOperImpl() {
		source.getMessageSource().put(1L, new Message(1, "Hello World", "Shiv", new Date()));
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
		return (List<Message>) source.getMessageSource().values();
	}

	@Override
	public Message getMessageById(long id) throws Exception {
		return null;
	}

}
