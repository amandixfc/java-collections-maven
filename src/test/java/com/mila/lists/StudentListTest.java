package com.mila.lists;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;

class StudentListTest {

	@Test
	void testCreateList() {
		List<Student> studentList = StudentList.CreateList();
		assertTrue(studentList != null);
		assertTrue(studentList.size() == 3);
	}

	@Test
	void testGetStudentsByCountry() {
		List<Student> studentList = StudentList.CreateList();
		List<Student> studentSpainList = StudentList
				.getStudentsByCountry(studentList, "Spain");
		assertTrue(studentSpainList.size() == 2);
		Student spanishStudent = studentSpainList.get(0);
		assertTrue(spanishStudent.getName() == "Alberto");
		
	}
	
	@Test
	void testGetAdultStudents() {
		List<Student> studentList = StudentList.CreateList();
		List<Student> studentAdultList = StudentList
				.getAdultStudents(studentList);
		assertTrue(studentAdultList.size() == 2);
		Student adultStudent = studentAdultList.get(0);
		assertTrue(adultStudent.getName() == "Alberto");
	}

}
