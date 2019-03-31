package com.Kamal.SpringCoreAdvanced.SpringCoreAdvanced.Autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutoWiredByTypeTest {

	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("com/Kamal/SpringCoreAdvanced/SpringCoreAdvanced/Autowiring/config.xml");
		Employee e=(Employee)ctx.getBean("emp");
		System.out.println(e);


	}

}
