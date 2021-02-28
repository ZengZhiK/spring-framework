package com.zzk.springdebug;

import com.zzk.springdebug.customeditor.Person;
import com.zzk.springdebug.factorybean.MyFactoryBean;
import com.zzk.springdebug.model.entity.Student;
import com.zzk.springdebug.model.entity.Teacher;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * @author zzk
 * @create 2021-01-29 10:46
 */
public class SpringDebugTest {
	public static void main(String[] args) {
//		ApplicationContext ac = new ClassPathXmlApplicationContext("spring-student.xml");
//		Student student = (Student) ac.getBean("student");
//		student.showBeanName();
//		Teacher teacher = (Teacher) ac.getBean("teacher");
//		System.out.println(teacher);

		ApplicationContext ac = new ClassPathXmlApplicationContext("custom-editor.xml");
		MyFactoryBean myFactoryBean = (MyFactoryBean) ac.getBean("&myFactoryBean");
		System.out.println(myFactoryBean);

//		Person person = ac.getBean(Person.class);
//		System.out.println(person);

		Person person = (Person) ac.getBean("myFactoryBean");
		System.out.println(person);
	}
}
