package com.springcore.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Interfacemeth implements InitializingBean, DisposableBean{
	
	private double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Interfacemeth() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Interfacemeth [price=" + price + "]";
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		//init 
		System.out.println("Testing: init");
	}

	@Override
	public void destroy() throws Exception {
		//destroy
		System.out.println("Testing: destroy");
	}
	
	

}
