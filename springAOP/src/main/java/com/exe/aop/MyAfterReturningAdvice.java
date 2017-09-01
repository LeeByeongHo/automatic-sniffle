package com.exe.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component

public class MyAfterReturningAdvice {
	@AfterReturning("execution(* com..aop.*.*(..))")
	public void afterReturningMethodCall() {
		System.out.println("JointPoint 메소드가 정상 실행 후");
	}
}
