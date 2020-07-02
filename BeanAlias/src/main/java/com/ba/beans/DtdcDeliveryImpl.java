package com.ba.beans;

import java.util.List;

public class DtdcDeliveryImpl implements IDelivery{

	public String dispatch(String orderId, List<String> products, Address address) {
		System.out.println("Delivered by Dtdc delivery");
		return "130.dtdc";
	}

	
}
