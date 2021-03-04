package com.zzk.springdebug.customeditor;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.Map;

/**
 * @author zzk
 * @create 2021-01-31 17:02
 */
public class Person {
	private String name;
	private Address address;

	private Map<String, Object> map;

	@PostConstruct
	public void init() {
		System.out.println("---person init---");
	}

	@PreDestroy
	public void destory() {
		System.out.println("---person destory---");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public void setMap(Map<String, Object> map) {
		this.map = map;
	}

	@Override
	public String toString() {
		return "Person{" +
				"name='" + name + '\'' +
				", address=" + address +
				", map=" + map +
				'}';
	}
}
