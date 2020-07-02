package com.ba.beans;

import java.util.List;

public class BluedartDeliveryImpl implements IDelivery{

	public String dispatch(String orderId, List<String> products, Address address) {
		System.out.println("delivered by bluedart");
		return "103.blue";
	}

	
}
