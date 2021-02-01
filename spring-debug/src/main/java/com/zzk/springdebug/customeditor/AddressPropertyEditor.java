package com.zzk.springdebug.customeditor;

import java.beans.PropertyEditorSupport;

/**
 * @author zzk
 * @create 2021-01-31 17:03
 */
public class AddressPropertyEditor extends PropertyEditorSupport {

	@Override
	public void setAsText(String text) throws IllegalArgumentException {
		String[] split = text.split("_");
		Address address = new Address();
		address.setProvince(split[0]);
		address.setCity(split[1]);
		address.setTown(split[2]);
		setValue(address);
	}
}
