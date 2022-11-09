package com.mila.lists;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StudentList {

	public synchronized static List<Student> CreateList() {
		
		List<Student> studentList = new ArrayList<Student>();
		
		Student student = new Student();
		student.setId(1);
		student.setName("Pepe");
		student.setCountry("United States");
		student.setAge(17);
		
		studentList.add(student);
		
		Student student1 = new Student();
		student1.setId(2);
		student1.setName("Alberto");
		student1.setCountry("Spain");
		student1.setAge(19);
		
		studentList.add(student1);
		
		Student student2 = new Student();
		student2.setId(2);
		student2.setName("Marta");
		student2.setCountry("Spain");
		student2.setAge(18);
		
		studentList.add(student2);
		
		return studentList;
	}
	
	
	public static List<Student> getStudentsByCountry(List<Student> studentList, String country) {
		
		//Select * from Student where country='Spain';
		List<Student> studentCountryList = studentList.stream()
				.filter(student -> student.getCountry().equals(country))
				.collect(Collectors.toList());
		
		return studentCountryList;
	}
	
	public static List<Student> getAdultStudents(List<Student> studentList) {
		
		//Select * from Student where age>=18;
		List<Student> studentAdultList = studentList.stream()
				.filter(student -> student.getAge() >= 18)
				.collect(Collectors.toList());
		
		return studentAdultList;
	}
	
	public static void loopThroughList(List<Student> studentList) {
		
		studentList.forEach((final Student student) -> {
			System.out.println(student.getId());
			System.out.println(student.getName());
		});
	}
}
