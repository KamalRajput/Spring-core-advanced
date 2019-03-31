package com.Kamal.SpringCoreAdvanced.StereoTypeAnnotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StereoTest {

	public static void main(String[] args) {
		
		/*by default scope is singleton and object references will be same. It can 
		 * be changed by @Scope annotation over bean class */
		ApplicationContext ctx=new ClassPathXmlApplicationContext("com/Kamal/SpringCoreAdvanced/StereoTypeAnnotations/config.xml");
		Instructor e=(Instructor)ctx.getBean("inst");
		System.out.println(e);
		System.out.println(e.hashCode());
		
		Instructor e1=(Instructor)ctx.getBean("inst");
		System.out.println(e1);
		System.out.println(e1.hashCode());
		
		
	}

}
