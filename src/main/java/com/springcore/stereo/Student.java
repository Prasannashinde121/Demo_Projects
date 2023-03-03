package com.springcore.stereo;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("ob")
@Scope("prototype")
public class Student {
	
	@Value("Pikachu")
	private String studentName;
	
	@Value("asddfffjk")
	private String sutdentCity;
	
	@Value("#{temp}")
	private List<String> address;
	
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getSutdentCity() {
		return sutdentCity;
	}
	public void setSutdentCity(String sutdentCity) {
		this.sutdentCity = sutdentCity;
	}
	
	public List<String> getAddress() {
		return address;
	}
	public void setAddress(List<String> address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Student [studentName=" + studentName + ", sutdentCity=" + sutdentCity + "]";
	}
	
	
	
	
}
