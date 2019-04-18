package com.osf.sp.ioc4;

import org.springframework.stereotype.Component;

@Component
public class Developer implements Study {

	public void toStudy() {
		System.out.println("개발자가 공부합니다.");
	}

}
