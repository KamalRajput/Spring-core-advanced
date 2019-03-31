package com.Kamal.SpringCoreAdvanced.InterfaceInjection;

public class OrderDAOImpl implements OrderDAO{

	@Override
	public void createOrder() {
		System.out.println("Inside order DAO create Order method");
		
	}

}
