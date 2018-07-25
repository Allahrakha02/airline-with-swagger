package com.exilant.airline.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Ticket {
	
	private String bookingId;
	//private int noOfTicket;
	private double price;
	private Date bookingDate;
	private double discount;
	private String source;
	private String destination;
	private double total;
	private int noOfPassengers;
	
	private List<Passenger> passengers;
	{
		passengers= new ArrayList<Passenger>();
	}
	public String getBookingId() {
		return bookingId;
	}
	public void setBookingId(String bookingId) {
		this.bookingId = bookingId;
	}
//	public int getNoOfTicket() {
//		return noOfTicket;
//	}
//	public void setNoOfTicket(int noOfTicket) {
//		this.noOfTicket = noOfTicket;
//	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Date getBookingDate() {
		return bookingDate;
	}
	public void setBookingDate(Date bookingDate) {
		this.bookingDate = bookingDate;
	}
	public double getDiscount() {
		return discount;
	}
	public void setDiscount(double discount) {
		this.discount = discount;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	public List<Passenger> getPassengers() {
		return passengers;
	}
	public void setPassengers(List<Passenger> passengers) {
		this.passengers = passengers;
	}
	public int getNoOfPassengers() {
		return noOfPassengers;
	}
	public void setNoOfPassengers(int noOfPassengers) {
		this.noOfPassengers = noOfPassengers;
	}
	public Ticket(String bookingId, double price, Date bookingDate, double discount, String source,
			String destination, double total, int noOfPassengers, List<Passenger> passengers) {
		super();
		this.bookingId = bookingId;
		//this.noOfTicket = noOfTicket;
		this.price = price;
		this.bookingDate = bookingDate;
		this.discount = discount;
		this.source = source;
		this.destination = destination;
		this.total = total;
		this.noOfPassengers = noOfPassengers;
		this.passengers = passengers;
	}
	public Ticket() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Ticket [bookingId=" + bookingId + ", price=" + price + ", bookingDate="
				+ bookingDate + ", discount=" + discount + ", source=" + source + ", destination=" + destination
				+ ", total=" + total + ", noOfPassengers=" + noOfPassengers + ", passengers=" + passengers + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}