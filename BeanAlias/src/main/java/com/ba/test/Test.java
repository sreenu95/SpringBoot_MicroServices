package com.ba.test;

import java.util.ArrayList;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.ba.beans.Address;
import com.ba.beans.OrderManager;

public class Test {

	public static void main(String[] args) {
		BeanFactory factory=new XmlBeanFactory(new ClassPathResource("com/ba/common/application-context.xml"));
		OrderManager orderManager=(OrderManager) factory.getBean("orderManager");
		Address address=(Address) factory.getBean("address");
		String airwayNumber=orderManager.placeOrder("1234", new ArrayList<String>(), address);
		System.out.println("airway number: "+ airwayNumber);
		String[]beanNames=factory.getAliases("dtdc");
		for(String names:beanNames) {
			System.out.println(names);
		}
				
	}
}
