package com.Kamal.SpringCoreAdvanced.InterfaceInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class InterfaceInjectionTest {

	public static void main(String[] args) {
		
	/* so in this class we are injecting OrderDAOimpl into OrderBoImpl*/
		ApplicationContext ctx=new ClassPathXmlApplicationContext("com/Kamal/SpringCoreAdvanced/InterfaceInjection/config.xml");
		OrderBo impl=(OrderBo)ctx.getBean("bo");
		impl.placeOrder();
		
		
		
		
	}

}
