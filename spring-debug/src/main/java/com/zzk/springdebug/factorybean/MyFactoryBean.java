package com.zzk.springdebug.factorybean;

import com.zzk.springdebug.customeditor.Address;
import com.zzk.springdebug.customeditor.Person;
import org.springframework.beans.factory.FactoryBean;

/**
 * @author zzk
 * @create 2021-02-28 11:16
 */
public class MyFactoryBean implements FactoryBean<Person> {

	@Override
	public Person getObject() throws Exception {
		Person person = new Person();
		person.setName("zzk");
		Address address = new Address();
		address.setProvince("ln");
		address.setCity("sy");
		address.setTown("hpq");
		person.setAddress(address);

		return person;
	}

	@Override
	public Class<?> getObjectType() {
		return Person.class;
	}

	@Override
	public boolean isSingleton() {
		return true;
	}
}
