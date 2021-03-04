package com.zzk.springdebug.methodoverride;

/**
 * @author zzk
 * @create 2021-03-01 16:21
 */
public class ZK extends Player{
	@Override
	public void who() {
		System.out.println("I am ZK");
	}
}
