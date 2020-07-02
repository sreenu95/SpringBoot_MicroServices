package com.ba.beans;

import java.util.List;

public class OrderManager {
	
	private IDelivery blueDartDelivery;
	private IDelivery dtdcDelivery;
	
	public String placeOrder(String orderId,List<String>products,Address address) {
		String airwayNumber=null;
		
		if(address.getZipcode()<30123) {
			airwayNumber=blueDartDelivery.dispatch(orderId, products, address);
		}
		else {
			airwayNumber=dtdcDelivery.dispatch(orderId, products, address);
		}
		return airwayNumber;
	}
	
	public IDelivery getBlueDartDelivery() {
		return blueDartDelivery;
	}
	public void setBlueDartDelivery(IDelivery blueDartDelivery) {
		this.blueDartDelivery = blueDartDelivery;
	}
	public IDelivery getDtdcDelivery() {
		return dtdcDelivery;
	}
	public void setDtdcDelivery(IDelivery dtdcDelivery) {
		this.dtdcDelivery = dtdcDelivery;
	}
	
	

}
