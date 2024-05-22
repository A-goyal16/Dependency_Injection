package setterinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentMain {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext con = new ClassPathXmlApplicationContext("student.xml");
		Student s = con.getBean("student", Student.class);
		System.out.println("-------using list-----------");
		System.out.println(s.getName());
		System.out.println("-------using map-----------");
		System.out.println(s.getDetails());


	}
}
