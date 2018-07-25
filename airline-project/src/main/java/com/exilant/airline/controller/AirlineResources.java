package com.exilant.airline.controller;

import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.Resource;
import org.springframework.hateoas.mvc.ControllerLinkBuilder;
import org.springframework.hateoas.mvc.ControllerLinkBuilderFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.exilant.airline.model.Ticket;
import com.exilant.airline.services.TicketService;

@RestController
@RequestMapping("api/airline/1/v1")
public class AirlineResources {
	
	@Autowired
	private TicketService ticketService;
	
//	List<Ticket> t = new ArrayList<Ticket>();
//	List<Passenger> passengers = new ArrayList<Passenger>();
//	passengers.add(new Passenger("p-101", "Allahrakha", 25));
//	passengers.add(new Passenger("p-102", "RAki", 25));
	

	@PostMapping("/booking")
	public Ticket bookTicket(@RequestBody Ticket ticket) {

		

		return ticketService.bookTicket(ticket);
	}

	@GetMapping("/bookinglist")
	public List<Ticket> getAllTicketDetails(){
		
		return ticketService.getAllbookingList();
	}

	@GetMapping("/singlebooking/{ticketId}")
	public Ticket getSingleTicketDetails(@PathVariable String ticketId) {

		

		return ticketService.getSingleTicket(ticketId);
	}
	
	
	
	@GetMapping("/cancel/{ticketId}")
	public Resource<String> cancelTicket(@PathVariable String ticketId) {
		
		Iterator<Ticket> it= ticketService.getAllbookingList().iterator();
		
		Ticket ticket= getSingleTicketDetails(ticketId);
		
		while(it.hasNext()) {
			if (it.next().getBookingId().equalsIgnoreCase(ticketId)) {
			it.remove();
			
		}
		}
		Resource<String> resources= new Resource<String>("Ticket Cancelled...");
		ControllerLinkBuilder linkInfo=new ControllerLinkBuilderFactory().linkTo(methodOn(this.getClass()).bookTicket(ticket));
		resources.add(linkInfo.withRel("book again your tiket"));
		return resources;
	}

}
