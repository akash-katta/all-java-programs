package com.multithreading;
//this is the resource
class BookMyShow {
	int total_tickets = 10;

	synchronized void bookMyShow(String name, int tickets) {
		if (total_tickets >= tickets) {
			System.out.println(tickets + "- tickets have been booked successfully by: " + name);
			total_tickets -= tickets;
			System.out.println("the remaining tickets are: " + total_tickets);
		}else {
			System.err.println("tickets are soled out");
			System.err.println("the remaining tickets are: " + total_tickets);

		}
	}
}
//this is thread
class Customer extends Thread {
	String customerName;
	BookMyShow bms;
	int tickets;

	public Customer(String customerName, BookMyShow bms, int tickets) {
		super();
		this.customerName = customerName;
		this.bms = bms;
		this.tickets = tickets;
	}
	@Override
	public void run() {
		bms.bookMyShow(customerName, tickets);
	}

}
//this is the driving class
public class Synchronisation {

	static BookMyShow bms = new BookMyShow();
	public static void main(String[] args) {

		System.out.println("welcome to book my show");
		Customer c1 = new Customer("akash",bms, 6);
		c1.start();
		
		Customer c2 = new Customer("ram", bms, 4);
		c2.start();
		
		Customer c3 = new Customer("sham", bms, 4);
		c3.start();
	}

}
