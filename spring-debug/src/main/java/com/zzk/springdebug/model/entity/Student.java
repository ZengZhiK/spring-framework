package com.zzk.springdebug.model.entity;

import org.springframework.beans.factory.BeanNameAware;

/**
 * @author zzk
 * @create 2021-01-29 10:44
 */
public class Student implements BeanNameAware {
	private Integer id;
	private String name;

	private String beanName;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void showBeanName() {
		System.out.println(this.beanName);
	}

	@Override
	public void setBeanName(String name) {
		this.beanName = name;
	}
}
