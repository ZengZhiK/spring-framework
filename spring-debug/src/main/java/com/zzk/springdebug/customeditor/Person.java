package com.zzk.springdebug.customeditor;

/**
 * @author zzk
 * @create 2021-01-31 17:02
 */
public class Person {
	private String name;
	private Address address;

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

	@Override
	public String toString() {
		return "Person{" +
				"name='" + name + '\'' +
				", address=" + address +
				'}';
	}
}
