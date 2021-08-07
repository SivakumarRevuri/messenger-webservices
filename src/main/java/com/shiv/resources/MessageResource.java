package com.shiv.resources;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import com.shiv.businees.BussinessOperImpl;
import com.shiv.model.Message;

@Path("messages")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class MessageResource {

	private final BussinessOperImpl implementation = new BussinessOperImpl();

	@GET
	public List<Message> getAllMessages() throws Exception {
		return implementation.getAllMessages();
	}
	
	@GET
	@Path("/{messageId}")
	public Message getMessageById(@PathParam("messageId") long id) throws Exception {
		return implementation.getMessageById(id);
	}
	
	@POST
	public Message addMessage(Message message) throws Exception {
		return implementation.addMessage(message);
	}

	@PUT
	@Path("/{messageId}")
	public Message updateMessage(@PathParam("messageId") long id, Message message) throws Exception {
		return implementation.updateMessage(id, message);
	}

	@DELETE
	@Path("/{messageId}")
	public boolean deleteMessage(@PathParam("messageId") long id) throws Exception {
		if (implementation.deleteMessage(id) instanceof Message) {
			return true;
		}
		return false;
	}
	
	@GET
	@Path("filter")
	public List<Message> filterByYear(@QueryParam("year") int year) throws Exception{
		return implementation.getMessageByYear(year);
	}

}
