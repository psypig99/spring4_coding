package com.apress.isf.spring.aop;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

/**
 * Created by Sejun on 2015. 12. 29..
 */
public class AroundLoggingModule implements MethodInterceptor{
	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		return null;
	}
}
