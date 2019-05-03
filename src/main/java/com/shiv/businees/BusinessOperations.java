package com.shiv.businees;

import java.util.List;

import com.shiv.model.Message;

public interface BusinessOperations {

	public Message addMessage(Message message) throws Exception;
	
	public boolean updateMessage(Message message) throws Exception;
	
	public boolean deleteMessage(Message message) throws Exception;
	
	public List<Message> getAllMessages() throws Exception;
	
	public Message getMessageById(long id) throws Exception;
	
}
