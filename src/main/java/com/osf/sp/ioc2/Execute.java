package com.osf.sp.ioc2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Execute {

	public static void main(String[] args) {
		ApplicationContext ac = 
				new ClassPathXmlApplicationContext("ioc2/ioc.xml");
		Car c = (Car) ac.getBean("c1");
		CarMaker cm = new Hyundai(c);
		cm.sellCar();
		
		
	}
}
