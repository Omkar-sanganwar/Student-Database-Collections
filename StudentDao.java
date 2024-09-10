package com.dao;

import java.util.ArrayList;
import java.util.List;
import com.entity.Student;

public class StudentDao {
	private List<Student> studentList = new ArrayList<>();

	// Add a student to the list
	public void addStudent(Student student) {
		studentList.add(student);
	}

	// Get all students
	public List<Student> getAllStudents() {
		return studentList;
	}

	// Find a student by ID
	public Student findStudentById(int id) {
		for (Student student : studentList) {
			if (student.getId() == id) {
				return student;
			}
		}
		return null;
	}
}
