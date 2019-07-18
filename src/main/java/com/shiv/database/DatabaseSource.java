package com.shiv.database;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import com.shiv.model.Message;

public class DatabaseSource {

	protected static final Map<Long, Message> messageSource = new HashMap<>();
	
	private DatabaseSource() {
		
	}

	public static Map<Long, Message> getMessageSource() {
		messageSource.put(1L, new Message(1, "Hello World", "Shiv", new Date()));
		return messageSource;
	}
}
