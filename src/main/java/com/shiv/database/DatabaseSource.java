package com.shiv.database;

import java.util.HashMap;
import java.util.Map;

import com.shiv.model.Message;

public class DatabaseSource {

	protected final Map<Long, Message> messageSource = new HashMap<>();
	
	private DatabaseSource() {
		super();
	}

	public Map<Long, Message> getMessageSource() {
		return messageSource;
	}
}
