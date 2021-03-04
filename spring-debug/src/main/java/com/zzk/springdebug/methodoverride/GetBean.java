package com.zzk.springdebug.methodoverride;

/**
 * @author zzk
 * @create 2021-03-01 16:23
 */
public abstract class GetBean {
	public void who() {
		this.getBean().who();
	}

	public abstract Player getBean();
}
