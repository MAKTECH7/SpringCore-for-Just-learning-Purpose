package com.springcore.auto.wire;

public class Emp {
	
	private Address address;

	public Address getAddress() {
		return address;
	}


	public void setAddress(Address address) {
		this.address = address;
		System.out.println("Setting Value");
	}

	public Emp() {
		super();
		System.out.println("Inside a constructor method");
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "Emp [address=" + address + "]";
	}

}
