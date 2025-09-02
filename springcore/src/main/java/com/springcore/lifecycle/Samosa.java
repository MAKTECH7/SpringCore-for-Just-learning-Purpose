package com.springcore.lifecycle;

public class Samosa {
	private double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		System.out.println("Setting Up the price");
		this.price = price;
	}

	public Samosa() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Samosa [price=" + price + "]";
	}
	
	public void Hey() {
		System.out.println("Hey my name is Ayan");
	}
	
	public void Bye() {
		System.out.println("Goodbye your life is end here i am going to kill youu right now");
	}
	
	
}
