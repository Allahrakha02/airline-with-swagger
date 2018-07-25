package com.exilant.airline.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.exilant.airline.model.Ticket;


public interface TicketService {
	
	public Ticket bookTicket(Ticket ticket);
	public Ticket cancelTicket(Ticket ticket);
	public List<Ticket> getAllbookingList();
	public Ticket getSingleTicket(String ticketId);

}
