package com.springcore.javaconfig;

import org.springframework.stereotype.Component;

@Component("firststudent")
public class Student {

	private Abc abc;

	public Abc getAbc() {
		return abc;
	}

	public Student(Abc abc) {
		super();
		this.abc = abc;
	}

	public void setAbc(Abc abc) {
		this.abc = abc;
	}

	public void study() {

		this.abc.display();
		System.out.println("Student is Reading");
	}
}
