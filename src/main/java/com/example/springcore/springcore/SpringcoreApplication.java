package com.example.springcore.springcore;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class SpringcoreApplication {

	public static void main(String[] args) {

		System.out.println("Hello World!");
		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		
        Student student1=(Student) context.getBean("student1");
        Student student2=(Student) context.getBean("student2");
        
		System.out.println(student1);
		System.out.println(student2);

	}

}
