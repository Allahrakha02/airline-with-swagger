package com.exilant.airline.servicesimpl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

import com.exilant.airline.model.Passenger;
import com.exilant.airline.model.Ticket;
import com.exilant.airline.services.TicketService;

@Service
public class TicketServiceImpl implements TicketService {

	private List<Ticket> tickets;
	{
		tickets= new ArrayList<Ticket>();
	}
	
	
	private final String airline="Airline";
	private int ticketId=1000;
	
	
	
	
	@Override
	public Ticket bookTicket(Ticket ticket) {
		List<Passenger> passengers = ticket.getPassengers();
		int noOfPassenger = passengers.size();
		double total = 0.0;
		ticketId++;
		ticket.setBookingId(airline + ticketId);
		ticket.setBookingDate(new Date());
		if (noOfPassenger >= 6) {
			ticket.setDiscount(10);
			total = (ticket.getPrice() - ((ticket.getPrice() * ticket.getDiscount()) / 100));
			total = total * noOfPassenger;
			ticket.setTotal(total);
		} else {
			ticket.setDiscount(0);
			total = ticket.getPrice() * noOfPassenger;
			ticket.setTotal(total);
		}
		ticket.setNoOfPassengers(noOfPassenger);

		tickets.add(ticket);
		return ticket;
	}

	@Override
	public Ticket cancelTicket(Ticket ticket) {
		
		return null;
	}

	@Override
	public List<Ticket> getAllbookingList() {
		// TODO Auto-generated method stub
		return tickets;
	}

	@Override
	public Ticket getSingleTicket(String ticketId) {
		
		for (Ticket t : tickets) {
			if (t.getBookingId().equalsIgnoreCase(ticketId)) {
				return t;
			}
		}
		
		return null;
	}


	

}
