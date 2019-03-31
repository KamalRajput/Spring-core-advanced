package com.Kamal.SpringCoreAdvanced.StandaloneLists;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StandaloneLists {

	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("com/Kamal/SpringCoreAdvanced/StandaloneLists/config.xml");
		ProductList pl=(ProductList)ctx.getBean("product");
		System.out.println(pl);


	}

}
