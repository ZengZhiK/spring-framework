package com.zzk.springdebug.cycle;

/**
 * @author zzk
 * @create 2021-03-04 15:34
 */
public class A {
	private B b;

	public B getB() {
		return b;
	}

	public void setB(B b) {
		this.b = b;
	}

	public void show() {
		System.out.println("a");
	}
}
