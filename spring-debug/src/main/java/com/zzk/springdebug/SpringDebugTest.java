package com.zzk.springdebug;

import com.zzk.springdebug.customeditor.Person;
import com.zzk.springdebug.cycle.A;
import com.zzk.springdebug.cycle.B;
import com.zzk.springdebug.factorybean.MyFactoryBean;
import com.zzk.springdebug.methodoverride.GetBean;
import com.zzk.springdebug.model.entity.Student;
import com.zzk.springdebug.model.entity.Teacher;
import com.zzk.springdebug.resolvebeforeinstantiation.Apple;
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

//		ApplicationContext ac = new ClassPathXmlApplicationContext("custom-editor.xml");
		ApplicationContext ac = new ClassPathXmlApplicationContext("cycle.xml");
//		MyFactoryBean myFactoryBean = (MyFactoryBean) ac.getBean("&myFactoryBean");
//		System.out.println(myFactoryBean);

//		Person person = ac.getBean(Person.class);
//		System.out.println(person);

//		Person person = (Person) ac.getBean("myFactoryBean");
//		Person person = ac.getBean(Person.class);
//		Person person = (Person) ac.getBean("person2");
//		System.out.println(person);

//		GetBean getBean = (GetBean) ac.getBean("getBean");
//		getBean.who();

//		Apple apple = ac.getBean(Apple.class);
//		apple.show();

		A a = ac.getBean(A.class);
		B b = ac.getBean(B.class);
//		System.out.println(a);
//		System.out.println(b);
		a.show();
		b.show();
	}
}
