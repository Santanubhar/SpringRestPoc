package com.infy;

import java.util.List;
import java.util.Set;

public class Reports {
	
	List<Order> orders;
	
	public Reports(List<Order> orders)
	{
		this.orders = orders;
	}

	public List<Order> getOrders() {
		return orders;
	}

	public void setOrders(List<Order> orders) {
		this.orders = orders;
	}

	
	
}
