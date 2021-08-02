package com.shiv.businees;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Map;

import com.shiv.database.DatabaseSource;
import com.shiv.exceptions.DataNotFoundException;
import com.shiv.model.Message;

public class BussinessOperImpl implements BusinessOperations {

	protected final Map<Long, Message> messages = DatabaseSource.getMessageSource();

	public BussinessOperImpl() {
		messages.put(1L, new Message(1, "Hello World", "user754", new Date()));
		messages.put(2L, new Message(2, "Hi there!!!", "admin", new Date()));
	}

	@Override
	public Message addMessage(Message message) throws Exception {
		messages.put((long) (messages.size() + 1), message);
		return message;
	}

	@Override
	public Message updateMessage(long id, Message message) throws Exception {
		if (!messages.containsKey(id)) {
			throw new DataNotFoundException("Failed to update the message");
		}
		messages.put(id, message);
		return message;
	}

	@Override
	public Message deleteMessage(long id) throws Exception {
		if (!messages.containsKey(id)) {
			throw new DataNotFoundException("Can't delete the message");
		}
		return messages.remove(id);
	}

	@Override
	public List<Message> getAllMessages() throws Exception {
		Collection<Message> values = messages.values();
		return new ArrayList<>(values);
	}

	@Override
	public Message getMessageById(long id) throws Exception {
		Message message = messages.get(id);
		if (message == null) {
			throw new Exception("Data not Found Exception");
		}
		return message;
	}

	@Override
	public List<Message> filterById(int year) throws Exception {
		return null;
	}

	@Override
	public List<Message> getMessageByYear(int year) throws Exception {
		List<Message> messagesForYear = new ArrayList<>();
		Calendar calendar = Calendar.getInstance();
		for (Message message : messages.values()) {
			calendar.setTime(message.getCreated());
			if (calendar.get(Calendar.YEAR) == year) {
				messagesForYear.add(message);
			}
		}
		return messagesForYear;
	}

}
