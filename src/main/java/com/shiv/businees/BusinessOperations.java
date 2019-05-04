package com.shiv.businees;

import java.util.List;

import com.shiv.model.Message;

public interface BusinessOperations {

	public Message addMessage(Message message) throws Exception;
	
	public Message updateMessage(long id, Message message) throws Exception;
	
	public Message deleteMessage(long id) throws Exception;
	
	public List<Message> getAllMessages() throws Exception;
	
	public Message getMessageById(long id) throws Exception;
	
}
