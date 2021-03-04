package com.zzk.springdebug.aop;

/**
 * @author zzk
 * @create 2021-03-04 17:15
 */
public class TestAspect {


	public void doBefore() { //前置通知
		System.out.println("---before---");
	}

	public void doAfter() { //后置通知
		System.out.println("---after---");
	}
}
