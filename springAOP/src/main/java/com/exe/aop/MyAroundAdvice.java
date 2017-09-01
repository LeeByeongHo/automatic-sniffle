package com.exe.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyAroundAdvice {
	
	@Around("execution(* com..aop.*.*(..))")
	public Object aroundMethodCall(ProceedingJoinPoint jointPoint) {
		
		Object result = null;
		
		try {
			
			System.out.println("JointPoint 메소드 호출 전(Around)..");
			result = jointPoint.proceed();
			System.out.println("JointPoint 메소드 호출 후(Around)..");
			
		} catch (Throwable e) {
			
			System.out.println(e.toString());
			
		}
		
		return result;
	}
}
