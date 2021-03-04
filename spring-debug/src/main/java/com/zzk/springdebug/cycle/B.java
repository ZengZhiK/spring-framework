package com.zzk.springdebug.cycle;

/**
 * @author zzk
 * @create 2021-03-04 15:34
 */
public class B {
	private A a;

	public A getA() {
		return a;
	}

	public void setA(A a) {
		this.a = a;
	}

	public void show() {
		System.out.println("b");
	}
}
