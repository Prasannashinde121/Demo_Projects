package com.springcore.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Annotation {

	private String subject;

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public Annotation() {
		super();

	}

	@Override
	public String toString() {
		return "Annotation [subject=" + subject + "]";
	}
	@PostConstruct
	public void start() 
	{
		System.out.println("starting method..............");
	}
	@PreDestroy
	public void stop()
	{
		System.out.println("ending method...............");
	}
}