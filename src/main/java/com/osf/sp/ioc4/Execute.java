package com.osf.sp.ioc4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Execute {

	public static void main(String[] args) {
		ApplicationContext ac = 
				new ClassPathXmlApplicationContext("ioc4/ioc.xml");
		School school = (School)ac.getBean("school");
		System.out.println(school);
		Developer dev = (Developer)ac.getBean("developer");
		System.out.println(dev);
	}
}
