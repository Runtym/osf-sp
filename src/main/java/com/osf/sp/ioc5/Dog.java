package com.osf.sp.ioc5;

import org.springframework.stereotype.Component;

@Component
public class Dog implements Animal {

	public void eat() {
		System.out.println("개가 사료를 먹습니다.");
	}

	public void sleep() {
		System.out.println("개가 잡니다.");
	}

}
