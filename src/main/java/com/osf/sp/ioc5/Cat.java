package com.osf.sp.ioc5;

import org.springframework.stereotype.Component;

@Component
public class Cat implements Animal {

	public void eat() {
		System.out.println("고양이가 사료를 먹습니다.");
	}

	public void sleep() {
		System.out.println("고양이가 잡니다.");
	}

}
