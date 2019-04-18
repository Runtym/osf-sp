package com.osf.sp.ioc4;

import org.springframework.stereotype.Component;

import lombok.Data;

@Component("p")
@Data
public class Person implements Study{
	private String name;
	private Integer age;
	public void toStudy() {
		System.out.println("사람이 공부합니다.");
	}
}
