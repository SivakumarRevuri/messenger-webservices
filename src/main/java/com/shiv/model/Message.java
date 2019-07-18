package com.shiv.model;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Message {

	private long messageId;
	private String messageName;
	private String author;
	private Date created;

	protected Message() {
		super();
	}

	public Message(long messageId, String messageName, String author, Date created) {
		super();
		this.messageId = messageId;
		this.messageName = messageName;
		this.author = author;
		this.created = created;
	}

	public long getMessageId() {
		return messageId;
	}

	public void setMessageId(long messageId) {
		this.messageId = messageId;
	}

	public String getMessageName() {
		return messageName;
	}

	public void setMessageName(String messageName) {
		this.messageName = messageName;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public Date getCreated() {
		return created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}

}
