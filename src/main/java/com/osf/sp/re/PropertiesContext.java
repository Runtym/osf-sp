package com.osf.sp.re;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;

import com.osf.sp.ioc4.Person;

public class PropertiesContext {
	static Map<String,Object> ac = new HashMap<String,Object>();
	public PropertiesContext(String path) {
		InputStream is = PropertiesContext.class.getResourceAsStream(path);
		Properties prop = new Properties();
		try {
			prop.load(is);
			Iterator<Object> it = prop.keySet().iterator();
			while(it.hasNext()) {
				String key = it.next().toString();
				String className = prop.getProperty(key);
				System.out.println("key : " + className);
				Class clazz = Class.forName(className);
				ac.put(key, clazz.newInstance());
			}
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
		
	}
	public Object getBean(String id) {
		return ac.get("p");
	}

	public static void main(String[] args) {
		PropertiesContext pc = new PropertiesContext("/re/ioc.properties");
		Person p = (Person)pc.getBean("p");
		System.out.println(p);
	}
}
