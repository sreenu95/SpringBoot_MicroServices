package com.ba.beans;

import java.util.List;

public interface IDelivery {

	public String dispatch(String orderId,List<String> products,Address address);
}
