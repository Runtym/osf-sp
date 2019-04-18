package com.osf.sp.ioc6;

import org.springframework.stereotype.Component;

@Component
public class Designer extends Worker {

	public Designer() {
		super("디자이너","IT팀");
	}
	public void doWork() {
		System.out.println("디자인작업중!");
	}

	public void goToOffice() {
		System.out.println("회사로 가즈아~~");
	}

}
