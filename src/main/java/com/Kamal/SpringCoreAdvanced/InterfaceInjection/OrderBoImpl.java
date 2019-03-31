package com.Kamal.SpringCoreAdvanced.InterfaceInjection;

public class OrderBoImpl implements OrderBo {

	private OrderDAO dao;
	
	@Override
	public void placeOrder() {
		System.out.println("Inside order BO place order");
		dao.createOrder();
		
	}

	public OrderDAO getDao() {
		return dao;
	}

	public void setDao(OrderDAO dao) {
		this.dao = dao;
	}

}
