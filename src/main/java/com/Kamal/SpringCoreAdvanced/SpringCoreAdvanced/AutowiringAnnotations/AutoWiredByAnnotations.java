package com.Kamal.SpringCoreAdvanced.SpringCoreAdvanced.AutowiringAnnotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutoWiredByAnnotations {

	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("com/Kamal/SpringCoreAdvanced/SpringCoreAdvanced/AutowiringAnnotations/config.xml");
		Employee e=(Employee)ctx.getBean("emp");
		System.out.println(e);


	}

}
