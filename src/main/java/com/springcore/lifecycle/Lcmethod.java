//configure using xml file
package com.springcore.lifecycle;

public class Lcmethod {

	private double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		System.out.println("Setting property");
		this.price = price;
	}

	public Lcmethod() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Lcmethod [price=" + price + "]";
	}
	
	public void hey()
	{
		
		System.out.println("Inside init method: hey how are you?");
	}
	
	public void bye()
	{
		System.out.println("Inside destroy method: bye bye i am going to die");
	}
	
}
