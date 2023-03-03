package com.springcore.lifecycle;

//import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		AbstractApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/lifecycle/lifecycleconfig.xml");
		
		//registering shutdown hook
				context.registerShutdownHook(); 
				
//		Lcmethod s1=(Lcmethod) context.getBean("s1");
//		System.out.println(s1);
//		
//		System.out.println("+++++++++++++++++++++");
//		Interfacemeth p1=(Interfacemeth)context.getBean("p1");
//		
//		System.out.println(p1);
		
				Annotation a1=(Annotation) context.getBean("a1");
				System.out.println(a1);
	}

}
