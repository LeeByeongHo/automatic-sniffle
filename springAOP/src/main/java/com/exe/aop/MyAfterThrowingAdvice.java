package com.exe.aop;

import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyAfterThrowingAdvice {
	
	@AfterThrowing("execution(* com..aop.*.*(..))")
	public void afterThrowingMethodCall() {
		
		System.out.println("Jointpoint 메소드가 에러발생시 실행(AT)...");
		
	}
	
}
