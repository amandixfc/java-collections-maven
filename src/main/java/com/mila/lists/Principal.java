package com.mila.lists;

import java.util.ArrayList;
import java.util.List;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Student> studentList = StudentList.CreateList();
		
		List<Student> studentSpainList = StudentList
				.getStudentsByCountry(studentList, "Spain");
		StudentList.loopThroughList(studentSpainList);
		
		/**
		List<Student> studentList = new ArrayList<Student>();
		
		Student student1 = new Student();
		student1.setId(1);
		student1.setName("Pepito");
		
		Student student2 = new Student();
		student2.setId(2);
		student2.setName("Marieta");
		
		studentList.add(student1);
		studentList.add(student2);
		
		for (Student s : studentList) {
			System.out.println(s.getId());
			System.out.println(s.getName());
		}
		*/
	}

}
