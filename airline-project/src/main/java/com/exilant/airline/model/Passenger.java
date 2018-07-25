package com.exilant.airline.model;

public class Passenger {
	private String passengerId;
	private String name;
	private int passengerAge;
	
	public String getPassengerId() {
		return passengerId;
	}
	public void setPassengerId(String passengerId) {
		this.passengerId = passengerId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPassengerAge() {
		return passengerAge;
	}
	public void setPassengerAge(int passengerAge) {
		this.passengerAge = passengerAge;
	}
	public Passenger(String passengerId, String name, int passengerAge) {
		super();
		this.passengerId = passengerId;
		this.name = name;
		this.passengerAge = passengerAge;
	}
	public Passenger() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Passenger [passengerId=" + passengerId + ", name=" + name + ", passengerAge=" + passengerAge + "]";
	}
	
	
	

}
