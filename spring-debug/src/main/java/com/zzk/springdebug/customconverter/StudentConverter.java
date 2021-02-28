package com.zzk.springdebug.customconverter;

import com.zzk.springdebug.model.entity.Student;
import org.springframework.core.convert.converter.Converter;

/**
 * @author zzk
 * @create 2021-02-28 9:57
 */
public class StudentConverter implements Converter<String, Student> {
	@Override
	public Student convert(String source) {
		System.out.println("---Converter start---");
		Student student = new Student();
		String[] split = source.split("_");

		student.setId(Integer.parseInt(split[0]));
		student.setName(split[1]);

		System.out.println("---Converter end---");

		return student;
	}
}
